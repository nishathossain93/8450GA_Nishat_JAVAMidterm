package string.problems;

import java.util.Arrays;
import java.util.Locale;


public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void main(String[] args) {
    checkAnagram("cat", "act");
    checkAnagram("army","mary");
    checkAnagram("FART","RAFT");
    }

    public static void checkAnagram(String word, String anagram){
        char a [] = word.toLowerCase().toCharArray();
        char b [] = anagram.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean result = Arrays.equals(a,b);

        if (result == true){
            System.out.println("THIS IS AN ANAGRAM!");
        }else {
            System.out.println("THIS IS NOT AN ANAGRAM!");
        }
    }


    }

