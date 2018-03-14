
package genetic_algorithm_optimisation_with_mutationrates;
import genetic_algorithm_optimisation_with_mutationrates.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class ManageTour
{
    private static ArrayList country_dest = new ArrayList<Country>();
    
    public static void addCountry(Country country)
    {
        // Country to list
        country_dest.add(country); 
    }
    public static Country getCountry(double index)
    {
        //Index_latitude value of country
        return (Country)country_dest.get((int)index); 
    }

    public static double no_Countries()
    {
        // Size of list
        return country_dest.size(); 
    }
}
