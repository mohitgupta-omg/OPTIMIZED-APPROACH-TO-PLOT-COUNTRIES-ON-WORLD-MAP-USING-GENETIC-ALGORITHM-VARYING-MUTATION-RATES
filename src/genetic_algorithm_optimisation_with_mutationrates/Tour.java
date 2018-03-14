
package genetic_algorithm_optimisation_with_mutationrates;
import genetic_algorithm_optimisation_with_mutationrates.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Tour
{
    private ArrayList tour = new ArrayList<Country>();

    private double fitness = 0;
    private double distance = 0;

    public Tour()
    {
        for (double i = 0; i < ManageTour.no_Countries(); i++)
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
        // set - get
        for (double countryIndex = 0; countryIndex < ManageTour.no_Countries(); countryIndex++) 
        {
            setCountry(countryIndex, ManageTour.getCountry(countryIndex));
        }

        Collections.shuffle(tour);
    }

    public Country getCountry(double tourPosition)
    {
        return (Country)tour.get((int)tourPosition);
    }

    public void setCountry(double tourPosition, Country country)
    {
        tour.set((int)tourPosition, country);

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
            // MOST IMPORTANT
            fitness = 1/(double)getDistance(); 
        }
        return fitness;
    }

    public double getDistance()
    {
        if (distance == 0)
        {
            double tourDistance = 0;
            for (double countryIndex=0; countryIndex < tourSize(); countryIndex++)
            {
                Country fromCountry = getCountry(countryIndex);

                Country destinationCountry;

                if(countryIndex+1 < tourSize())
                {
                    destinationCountry = getCountry(countryIndex+1);
                }
                else
                {
                    destinationCountry = getCountry(0);
                }
                tourDistance += fromCountry.distanceTo(destinationCountry);
            }
            distance = tourDistance;
        }
        return distance;
    }

    public double tourSize()
    {
        return tour.size();
    }

    public boolean containsCountry(Country country)
    {
        return tour.contains(country);
    }

    public String toString()
    {
        String gene = " ";
        for (double i = 0; i < tourSize(); i++)
        {
            gene += getCountry(i)+"    ";
        }
        return gene;
    }
}
