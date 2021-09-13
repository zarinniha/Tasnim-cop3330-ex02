/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class characters {

    public static void main(String args[]) {
        int count = 0;
        System.out.print("What is the input String? ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }
        if (count != 0) {
            System.out.println(input + " has " + count + " characters.");
        } else {
            System.out.println("Please provide a word");

        }
    }


}
