package day6;

import java.util.Scanner;

public class Student {

    private int rollNumber;
    private String studentName;
    private double percentage;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    // NoArgsConstructor
    public Student() {

        rollNumber = 101;
        studentName = "Rohit";
        percentage = 50.0;
    }

    // AllArgsConstructor
    public Student(int a, String b, double c) {

        rollNumber = a;
        studentName = b;
        percentage = c;
    }

    public void acceptStudent() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter roll number");
        rollNumber = sc.nextInt();

        System.out.println("Please enter Student name");
        studentName = sc.next();

        System.out.println("Please enter Percentage");
        percentage = sc.nextDouble();
    }

    public void displayStudent() {

        System.out.println("Roll Number is " + rollNumber);
        System.out.println("Student name " + studentName);
        System.out.println("Percentage is " + percentage);
    }

    // Function Overloading
    public boolean search(int rno) {

        if (rollNumber == rno)
            return true;
        else
            return false;
    }

    public boolean search(String searchedstudName) {

        if (studentName.equalsIgnoreCase(searchedstudName))
            return true;
        else
            return false;
    }
}