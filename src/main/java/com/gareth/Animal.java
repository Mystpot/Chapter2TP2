package com.gareth;

public class Animal {

    private String species;
    private double weight;
    private String gender;
    private int topSpeed;

    Animal ()
    {

    }

    Animal(String species, double weight, String gender, int topSpeed)
    {
        this.species = species;
        this.weight = weight;
        this.gender = gender;
        this.topSpeed = topSpeed;
    }

    public static boolean animalEquality(Animal a1, Animal a2)
    {
        boolean equals;
        if(a1.getSpecies() != a2.getSpecies())
            equals = false;
        else
        {
            if(a1.getWeight() != a2.getWeight())
                equals = false;
            else
            {
                if(a1.getGender() != a2.getGender())
                    equals = false;
                else

                    if(a1.getTopSpeed() != a2.getTopSpeed())
                    equals = false;
                    else
                         equals = true;
            }
        }
        return equals;
    }

    public void setSpecies(String species)
    {
        this.species = species;
    }

    public String getSpecies()
    {
        return this.species;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return this.weight;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getGender()
    {
        return this.gender;
    }

    public void setTopSpeed(int topSpeed)
    {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed()
    {
        return this.topSpeed;
    }

    public String toString()
    {
        return("Animal species: " + species + "\nWeight: " + weight + " kgs \nGender: " + gender + "\nTop Speed: " + topSpeed);
    }
}
