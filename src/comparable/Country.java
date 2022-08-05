package comparable;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;

// A class Country that implements Comparable
public class Country implements Comparable<Country>{

    String name;
    int yrOfIndependence;

    // To sort countries by year of independence
    public int compareTo(Country c){
        return this.yrOfIndependence - c.yrOfIndependence;
    }

    // constructor
    public Country(String name, int yrOfIndependence){
        this.name = name;
        this.yrOfIndependence = yrOfIndependence;
    }
    public static void main(String[] args) {
        ArrayList<Country> listCntry = new ArrayList<>();
        listCntry.add(new Country("India",1947));
        listCntry.add(new Country("Pakistan",1947));
        listCntry.add(new Country("Myanmar",1948));

        Collections.sort(listCntry);
        System.out.println("Countries sorted on the basis of year of Independence:");
        for(Country c: listCntry){
            System.out.println(c.name+" "+ c.yrOfIndependence);
        }
    }
}
