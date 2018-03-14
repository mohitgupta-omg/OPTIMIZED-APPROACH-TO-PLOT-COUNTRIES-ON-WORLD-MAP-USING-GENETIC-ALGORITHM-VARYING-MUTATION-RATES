
package genetic_algorithm_optimisation_with_mutationrates;
import genetic_algorithm_optimisation_with_mutationrates.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Country
{
    double latitude;
    double longitude;

    public Country()
    {
        this.latitude = Math.random()*200;
        this.longitude = Math.random()*200;
    }
    public Country(double latitude, double longitude)
    {
        this.latitude= latitude;
        this.longitude = longitude;
    }
    public double getLatitude()
    {
        return this.latitude;
    }
    public double getLongitude()
    {
        return this.longitude;
    }
    public double distanceTo(Country country) // Country distance
    {
        double latitudeDistance = Math.abs(getLatitude() - country.getLatitude());
        double longitudeDistance = Math.abs(getLongitude() - country.getLongitude());
        
        // Fitness Function
        double distance = Math.sqrt( (latitudeDistance*latitudeDistance) + (longitudeDistance*longitudeDistance) );

        return distance;
    }
    public String toString()
    {
        return ">> " + getLatitude()+" : "+getLongitude();
    }
}
