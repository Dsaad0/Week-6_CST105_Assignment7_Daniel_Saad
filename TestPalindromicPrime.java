/*  Program:  Assignment 7 - Testing Prime Paldromic Integers
  * File:     TestPalindromicPrime.java
  * Summary:  Tests integers from 1 - 100,000 for Prime and Palindrome
  * Author:   Daniel Saad
  * Date:     12/12/18
 */
import java.io.FileNotFoundException;
//Import java scanner
import java.util.Scanner;

public class TestPalindromicPrime {

    //Main Method
    public static void main(String[] args) {
        //Initialize number
        int Number;
        //For loop starting at 1 going to 100,000
        for (Number = 1; Number <= 100000; Number++) {
            //if statement to test both Palindrome and Prime number
            if (TestPalindrome(Number) == true && TestPrime(Number) == true) {
                System.out.println(Number);
            }
        }
    }

    //Testprime Method returns boolean
    public static Boolean TestPrime(int number) {
        //Prime cannot be less or equal to 1
        if (number <= 1) {
            return false;
        }
        //for loop to find if number is divisible by any number than 2
        for (int i = 2; i < number; i++) {
            //If no remainder number is not prime
            if (number % i == 0) {
                return false;
            }
        }
        //if all hurdles passed number is prime.
        return true;
    }

    //TestPalindrome Method returns boolean
    public static Boolean TestPalindrome(int number) {
        //Initialize Holder
        int holder = number;
        //Intialize Reversed number to zero
        int reversed = 0;
        //While loop till holder == 0
        while (holder != 0) {
            //Initialize extra variable to help builde reverse
            int c = holder % 10;
            //Adds variable to reverse digits
            reversed = reversed * 10 + c;
            //reduces holder to next digit
            holder = holder / 10;
        }
        //If-Else Statement to check if number is Palidrome
        if (reversed == number) {
            return true;
        } else {
            return false;
        }
    }
}