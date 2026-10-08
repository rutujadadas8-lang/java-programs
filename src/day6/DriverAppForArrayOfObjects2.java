package day6;

import java.util.Scanner;

public class DriverAppForArrayOfObjects2 {

    public static void main(String[] args) {

        Student fsdBatch[] = new Student[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < fsdBatch.length; i++) {

            System.out.println("Please enter roll number");
            int a = sc.nextInt();

            System.out.println("Please enter Student name");
            String b = sc.next();

            System.out.println("Please enter Percentage");
            double c = sc.nextDouble();

            fsdBatch[i] = new Student(a, b, c);
        }

        for (int i = 0; i < fsdBatch.length; i++) {

            fsdBatch[i].displayStudent();
        }

        sc.close();
    }
}