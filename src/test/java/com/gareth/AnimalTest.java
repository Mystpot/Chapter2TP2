package com.gareth;

import org.junit.*;

import static org.junit.Assert.*;

public class AnimalTest {


    @Test
    public void animalEquality() {
        Animal dog = new Animal("canine", 40, "male", 80);
        Animal fox = new Animal("canine", 40, "male", 80);

        assertTrue(Animal.animalEquality(dog, fox));
    }

    @Test
    public void animalIdentity() {

        Animal cat = new Animal("feline", 25, "female", 70);

        Animal newCat = cat;
        assertSame(cat, newCat);
    }

    @Test
    public void failure() {
        fail("This test will fail");
    }

    @Test(timeout = 500)
    public void timeoutTest() {
        while(true);
    }

    @Ignore("Test animal was changed")
    @Test
    public void animalEqIgnore()
    {
        Animal dog = new Animal("canine", 40, "male", 80);
        Animal lion = new Animal("feline", 150, "male", 100);

        assertTrue(Animal.animalEquality(dog, lion));
    }
}