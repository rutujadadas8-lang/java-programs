
package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderdemo {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        try {
            System.out.println("Enter your name");

            String name = br.readLine();

            System.out.println("Your name is: " + name);
        }
        catch (IOException ex1) {
            System.out.println("An error occurred while reading input.");
        }
    }
}