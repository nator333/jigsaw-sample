package com.greetings;

import org.astro.World;
import org.astro.stars.Earth;

public class Main {
    public static void main(String[] args) {
        System.out.format("Greetings %s!%n", World.name());
        System.out.format("Greetings %s!%n", Earth.name());
    }
}

