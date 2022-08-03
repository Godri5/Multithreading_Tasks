package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
        if (string == null) throw new TooShortStringException();
        String[] spacesInString = string.split(" ");

        if (spacesInString.length < 5) throw new TooShortStringException();
        else {
             return spacesInString[1] + " " + spacesInString[2] + " "
                    + spacesInString[3] + " " + spacesInString[4];
        }
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
