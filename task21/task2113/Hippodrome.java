package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        horses = new ArrayList<>();
        horses.add(new Horse("Bullet", 3, 0));
        horses.add(new Horse("Flower", 3, 0));
        horses.add(new Horse("Victorious", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void move () {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print () {
        for (Horse horse : horses) {
            horse.print();
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }

    public void run () throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner() {
        double max = 0;
        Horse winner = null;
        for (Horse horse : horses) {
            if (horse.distance > max) {
                max = horse.distance;
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().name + "!");
    }
}
