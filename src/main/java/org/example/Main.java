package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        String example1 = "I did, did I?";
        String example2 = "Racecar";
        String example3 = "hello";
        String example4 = "Was it a car or a cat I saw ?";

        System.out.println(example1 + " => " + checkForPalindrome(example1));
        System.out.println(example2 + " => " + checkForPalindrome(example2));
        System.out.println(example3 + " => " + checkForPalindrome(example3));
        System.out.println(example4 + " => " + checkForPalindrome(example4));

        System.out.println(convertDecimalToBinary(13));


    }

    public static boolean checkForPalindrome (String str) {

        String convertedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        LinkedList<Character> charList = new LinkedList<>();

        for(char c : convertedStr.toCharArray()) {
            charList.add(c);
        }
            while(charList.size() > 1) {
                if(!charList.pollFirst().equals(charList.pollLast())) {
                    return false;
                }
            }
             return true;
    }
    public static String convertDecimalToBinary(int decimal) {

        LinkedList<Integer> binaryList = new LinkedList<>();

        while (decimal != 0) {
            binaryList.addFirst(decimal % 2);
            decimal /= 2;
        }

        StringBuilder result = new StringBuilder();
        for (Integer i : binaryList) {
            result.append(i);
        }
        return result.toString();
        }
    }

