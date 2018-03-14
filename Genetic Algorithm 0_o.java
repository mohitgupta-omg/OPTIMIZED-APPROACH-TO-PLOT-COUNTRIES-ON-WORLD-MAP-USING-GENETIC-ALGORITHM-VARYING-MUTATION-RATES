import java.util.*;
import java.lang.*;
import java.io.*;

class City
{
    int x;
    int y;

    public City()
    {
        this.x = (int)(Math.random()*200);
        this.y = (int)(Math.random()*200);
    }
    public City(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public double distanceTo(City city) // City distance
    {
        int xDistance = Math.abs(getX() - city.getX());
        int yDistance = Math.abs(getY() - city.getY());
        double distance = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );

        return distance;
    }
    public String toString()
    {
        return ">> " + getX()+" : "+getY();
    }
}

// ///////???????????????????????????///////////////////////????????????????????????????????????????????????
// <<<<<<><>>>>>>>>>>>><>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>
class ManageTour
{
    private static ArrayList city_dest = new ArrayList<City>();

    public static void addCity(City city)
    {
        city_dest.add(city); // City to list
    }
    public static City getCity(int index)
    {
        return (City)city_dest.get(index); //Index value of city
    }

    public static int no_Cities()
    {
        return city_dest.size(); // Size of list
    }
}

// ///////???????????????????????????///////////////////////????????????????????????????????????????????????
// <<<<<<><>>>>>>>>>>>><>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>
class Tour
{

    private ArrayList tour = new ArrayList<City>();

    private double fitness = 0;
    private int distance = 0;

    public Tour()
    {
        for (int i = 0; i < ManageTour.no_Cities(); i++)
        {
            tour.add(null);
        }
    }

    public Tour(ArrayList tour)
    {
        this.tour = tour;
    }

    public void generateIndividual()
    {
        for (int cityIndex = 0; cityIndex < ManageTour.no_Cities(); cityIndex++) // set - get
        {
            setCity(cityIndex, ManageTour.getCity(cityIndex));
        }

        Collections.shuffle(tour);
    }

    public City getCity(int tourPosition)
    {
        return (City)tour.get(tourPosition);
    }

    public void setCity(int tourPosition, City city)
    {
        tour.set(tourPosition, city);

        fitness = 0;
        distance = 0;
    }

    // MOST IMPORTANT
    // MOST IMPORTANT
    // MOST IMPORTANT
    public double getFitness()
    {
        if (fitness == 0)
        {
            fitness = 1/(double)getDistance(); // MOST IMPORTANT
        }
        return fitness;
    }

    public int getDistance()
    {
        if (distance == 0)
        {
            int tourDistance = 0;
            for (int cityIndex=0; cityIndex < tourSize(); cityIndex++)
            {

                City fromCity = getCity(cityIndex);

                City destinationCity;

                if(cityIndex+1 < tourSize())
                {
                    destinationCity = getCity(cityIndex+1);
                }
                else
                {
                    destinationCity = getCity(0);
                }
                tourDistance += fromCity.distanceTo(destinationCity);
            }
            distance = tourDistance;
        }
        return distance;
    }

    public int tourSize()
    {
        return tour.size();
    }


    public boolean containsCity(City city)
    {
        return tour.contains(city);
    }

    public String toString()
    {
        String gene = " ";
        for (int i = 0; i < tourSize(); i++)
        {
            gene += getCity(i)+"    ";
        }
        return gene;
    }
}

// ///////???????????????????????????///////////////////////????????????????????????????????????????????????
// <<<<<<><>>>>>>>>>>>><>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>
class Population
{
    Tour[] tours;

    public Population(int populationSize, boolean initialise)
    {
        tours = new Tour[populationSize];
        if (initialise)
        {
            for (int i = 0; i < populationSize(); i++)
            {
                Tour newTour = new Tour();
                newTour.generateIndividual();
                saveTour(i, newTour);
            }
        }
    }
    public void saveTour(int index, Tour tour)
    {
        tours[index] = tour;
    }
    public Tour getTour(int index)
    {
        return tours[index];
    }


    public Tour getFittest()
    {
        Tour fittest = tours[0];
        for (int i = 1; i < populationSize(); i++)
        {
            if (fittest.getFitness() <= getTour(i).getFitness())
            {
                fittest = getTour(i);
            }
        }
        return fittest;
    }
    public int populationSize()
    {
        return tours.length;
    }
}


// ///////???????????????????????????///////////////////////????????????????????????????????????????????????
// <<<<<<><>>>>>>>>>>>><>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>
class GA
{
    static final double m_Rate = 0.015;
    static final boolean x = true;

    static Population evolvePopulation(Population pop)
    {
        Population newPopulation = new Population(pop.populationSize(), false);

        int xOffset = 0;
        if (x)
        {
            newPopulation.saveTour(0, pop.getFittest());
            xOffset = 1;
        }

        for (int i = xOffset; i < newPopulation.populationSize(); i++)
        {

            Tour parent1 = tournamentSelection(pop);
            Tour parent2 = tournamentSelection(pop);

            Tour child = cross(parent1, parent2);
            newPopulation.saveTour(i, child);
        }

        for (int i = xOffset; i < newPopulation.populationSize(); i++)
        {
            mutate(newPopulation.getTour(i));
        }

        return newPopulation;
    }


    public static Tour cross(Tour parent1, Tour parent2)
    {

        Tour child = new Tour();

        int startPos = (int) (Math.random() * parent1.tourSize());
        int endPos = (int) (Math.random() * parent1.tourSize());


        for (int i = 0; i < child.tourSize(); i++)
        {
            if (startPos < endPos && i > startPos && i < endPos)
            {
                child.setCity(i, parent1.getCity(i));
            }
            else if (startPos > endPos)
            {
                if (!(i < startPos && i > endPos))
                {
                    child.setCity(i, parent1.getCity(i));
                }
            }
        }

        for (int i = 0; i < parent2.tourSize(); i++)
        {
            if (!child.containsCity(parent2.getCity(i)))
            {
                for (int ii = 0; ii < child.tourSize(); ii++)
                {
                    if (child.getCity(ii) == null)
                    {
                        child.setCity(ii, parent2.getCity(i));
                        break;
                    }
                }
            }
        }
        return child;
    }

    private static void mutate(Tour tour)
    {
        for(int tourPos1=0; tourPos1 < tour.tourSize(); tourPos1++)
        {
            if(Math.random() < m_Rate)
            {
                int tourPos2 = (int) (tour.tourSize() * Math.random());
// Swap Muttaion
                City city1 = tour.getCity(tourPos1);
                City city2 = tour.getCity(tourPos2);
                tour.setCity(tourPos2, city1);
                tour.setCity(tourPos1, city2);
            }
        }
    }
    static final int tornamnt_Size = 5;
    private static Tour tournamentSelection(Population pop)
    {
        Population tournament = new Population(tornamnt_Size, false);
        for (int i = 0; i < tornamnt_Size; i++)
        {
            int randomId = (int) (Math.random() * pop.populationSize());
            tournament.saveTour(i, pop.getTour(randomId));
        }

        Tour fittest = tournament.getFittest();
        return fittest;
    }
}



// ///////???????????????????????????///////////////////////????????????????????????????????????????????????
// <<<<<<><>>>>>>>>>>>><>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>
public class TSP_GA
{
    public static void main(String[] args)
    {
        City city1 = new City(60, 200);
        ManageTour.addCity(city1);
        City city2 = new City(180, 200);
        ManageTour.addCity(city2);
        City city3 = new City(80, 180);
        ManageTour.addCity(city3);
        City city4 = new City(140, 180);
        ManageTour.addCity(city4);
        City city5 = new City(20, 160);
        ManageTour.addCity(city5);
        City city6 = new City(100, 160);
        ManageTour.addCity(city6);
        City city7 = new City(200, 160);
        ManageTour.addCity(city7);
        City city8 = new City(140, 140);
        ManageTour.addCity(city8);
        City city9 = new City(40, 120);
        ManageTour.addCity(city9);
        City city10 = new City(100, 120);
        ManageTour.addCity(city10);
        City city11 = new City(180, 100);
        ManageTour.addCity(city11);
        City city12 = new City(60, 80);
        ManageTour.addCity(city12);
        City city13 = new City(120, 130);
        ManageTour.addCity(city13);
        City city14 = new City(180, 60);
        ManageTour.addCity(city14);
        City city15 = new City(20, 40);
        ManageTour.addCity(city15);
        City city16 = new City(100, 40);
        ManageTour.addCity(city16);
        City city17 = new City(200, 40);
        ManageTour.addCity(city17);
        City city18 = new City(20, 20);
        ManageTour.addCity(city18);
        City city19 = new City(60, 20);
        ManageTour.addCity(city19);
        City city20 = new City(160, 20);
        ManageTour.addCity(city20);

        System.out.println("No. of cities : " + ManageTour.no_Cities());

        Population pop = new Population(50, true);
        

        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 20; i++)
        {
            pop = GA.evolvePopulation(pop);
        }

        System.out.println("Distance: " + pop.getFittest().getDistance());
        System.out.println("\nPath acc. to GA : \n");
        System.out.println(pop.getFittest());
    }
}
