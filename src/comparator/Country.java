package comparator;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

// A class Country that implements Comparable
public class Country implements Comparable<Country> {
    String name;
    String capital;
    int yrOfIndp;

    public Country(String name,String capital, int yrOfIndp){
        this.name = name ;
        this.capital = capital;
        this.yrOfIndp = yrOfIndp;
    }

    public int compareTo(Country c){
        return this.yrOfIndp - c.yrOfIndp;
    }

    public static void main(String[] args) {
        ArrayList<Country> arrLstCntry = new ArrayList<>();
        arrLstCntry.add(new Country("India","New Delhi",1947));
        arrLstCntry.add(new Country("USA","Washington D.C.",1776));
        arrLstCntry.add(new Country("Germany","Berlin",1871));
        arrLstCntry.add(new Country("Bangladesh","Dhaka",1971));

        System.out.println("Countries sorted by name: ");
        NameCompare compareByName = new NameCompare();
        Collections.sort(arrLstCntry, compareByName);

        for(Country c: arrLstCntry){
            System.out.println(c.name+" "+ c.yrOfIndp);
        }

        System.out.println("Countries sorted by capital: ");
        CapitalCompare compareByCapital = new CapitalCompare();

        // Call the overloaded sort method, giving it both the list and the
        // instance of the class that implements Comparator
        Collections.sort(arrLstCntry, compareByCapital);
        for(Country c:arrLstCntry){
            System.out.println(c.name + " "+ c.capital + " "+ c.yrOfIndp);
        }
    }
}

// class to compare countries by names
class NameCompare implements Comparator<Country>{
    public int compare(Country c1, Country c2){
        return c1.name.compareTo(c2.name);
    }
}

// class to compare countries by their capital
class CapitalCompare implements Comparator<Country>{
    public int compare(Country c1, Country c2){
        return c1.capital.compareTo(c2.capital);
    }
}
