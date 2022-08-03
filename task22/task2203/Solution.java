package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        String[] tabsInStrings = string.split("\t");

        if (tabsInStrings.length < 3 ) throw new TooShortStringException();
        else {
            return tabsInStrings[1];
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
