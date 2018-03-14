package genetic_algorithm_optimisation_with_mutationrates;
import genetic_algorithm_optimisation_with_mutationrates.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Genetic_Algo
{
    /* We have worked with different mutation rates 
       to get the most Optimized Path to plot all the countries on World Map
       using their Latitudes and Longitudes */
    
    static final double m_Rate = 0.01;
    static final boolean x = true;

    static Population evolvePopulation(Population pop)
    {
        Population newPopulation = new Population(pop.populationSize(), false);

        double xOffset = 0;
        if (x)
        {
            newPopulation.saveTour(0, pop.getFittest());
            xOffset = 1;
        }

        for (double i = xOffset; i < newPopulation.populationSize(); i++)
        {

            Tour p1 = tournamentSelection(pop);
            Tour p2 = tournamentSelection(pop);
// Single Point Crossover
// Single Point Crossover
// Single Point Crossover
            Tour child = cross(p1, p2);
            newPopulation.saveTour(i, child);
        }

        for (double i = xOffset; i < newPopulation.populationSize(); i++)
        {
            mutate(newPopulation.getTour(i));
        }

        return newPopulation;
    }


    public static Tour cross(Tour p1, Tour p2)
    {

        Tour child = new Tour();

        double start = (double) (Math.random() * p1.tourSize());
        double destination = (double) (Math.random() * p1.tourSize());


        for (double i = 0; i < child.tourSize(); i++)
        {
            if (start < destination && i > start && i < destination)
            {
                child.setCountry(i, p1.getCountry(i));
            }
            else if (start > destination)
            {
                if (i > start && i < destination)
                {
                    child.setCountry(i, p1.getCountry(i));
                }
            }
        }

        for (double i = 0; i < p2.tourSize(); i++)
        {
            if (!child.containsCountry(p2.getCountry(i)))
            {
                for (double ii = 0; ii < child.tourSize(); ii++)
                {
                    if (child.getCountry(ii) == null)
                    {
                        child.setCountry(ii, p2.getCountry(i));
                        break;
                    }
                }
            }
        }
        return child;
    }

    // //SWAP MUTATION
    // //SWAP MUTATION
    // //SWAP MUTATION
    // //SWAP MUTATION
    // //SWAP MUTATION

    private static void mutate(Tour tour)
    {
        for(double tourPos1=0; tourPos1 < tour.tourSize(); tourPos1++)
        {
            if(Math.random() < m_Rate)
            {
                double tourPos2 = (double) (tour.tourSize() * Math.random());
// Swap Mutation
                Country country1 = tour.getCountry(tourPos1);
                Country country2 = tour.getCountry(tourPos2);
                tour.setCountry(tourPos2, country1);
                tour.setCountry(tourPos1, country2);
            }
        }
    }
    static final double tornamnt_Size = 5;
    private static Tour tournamentSelection(Population pop)
    {
        Population tournament = new Population(tornamnt_Size, false);
        for (double i = 0; i < tornamnt_Size; i++)
        {
            double randomId = (double) (Math.random() * pop.populationSize());
            tournament.saveTour(i, pop.getTour(randomId));
        }

        Tour fittest = tournament.getFittest();
        return fittest;
    }
}
