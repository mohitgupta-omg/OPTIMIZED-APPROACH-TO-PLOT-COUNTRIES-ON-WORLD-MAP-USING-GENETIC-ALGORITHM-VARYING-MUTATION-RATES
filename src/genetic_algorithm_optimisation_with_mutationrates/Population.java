package genetic_algorithm_optimisation_with_mutationrates;
import genetic_algorithm_optimisation_with_mutationrates.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Population
{
    Tour[] tours;
    public Population()
    {

    }
    public Population(double populationSize, boolean initialise)
    {
        tours = new Tour[(int)populationSize];
        if (initialise)
        {
            for (double i = 0; i < populationSize(); i++)
            {
                Tour newTour = new Tour();
                newTour.generateIndividual();
                saveTour(i, newTour);
            }
        }
    }
    public void saveTour(double index, Tour tour)
    {
        tours[(int)index] = tour;
    }
    public Tour getTour(double index)
    {
        return tours[(int)index];
    }

    public Tour getFittest()
    {
        Tour fittest = tours[0];
        for (double i = 1; i < populationSize(); i++)
        {
            if (fittest.getFitness() <= getTour(i).getFitness())
            {
                fittest = getTour(i);
            }
        }
        return fittest;
    }
    public double populationSize()
    {
        return tours.length;
    }
}
