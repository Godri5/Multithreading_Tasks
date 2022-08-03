package com.javarush.task.task27.task2709;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() throws InterruptedException {
        while (!isValuePresent){
            this.wait();
        }
        isValuePresent = false;
        this.notify();
        System.out.println("Got: " + value);
        return value;
    }

    public synchronized void put(int value) throws InterruptedException {
        while (isValuePresent){
            this.wait();
        }
        isValuePresent = true;
        this.value = value;
        System.out.println("Put: " + value);
        this.notify();
    }
}
