package com.practice.bdd.dto;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CatTest {

    @Test
    public void shouldSetNameCorrectly()
    {
        String name = "Meow";
        Cat cat = new Cat(name);

        assertTrue(cat.getName().equals(name));
    }

    @Test
    public void shouldBeAbleToChangeNameCorrectly()
    {
        String name = "Meow";
        Cat cat = new Cat(name);

        String newName = "Kitty";
        cat.setName(newName);

        assertTrue(cat.getName().equals(newName));
    }
}
