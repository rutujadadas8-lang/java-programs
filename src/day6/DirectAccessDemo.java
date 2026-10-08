package day6;

public class DirectAccessDemo {

    private int rollNumber;
    private String studentName;
    private double percentage;

    public void acceptStudent() {
        rollNumber = 101;
        studentName = "Alice";
        percentage = 78.5;
    }

    public void displayStudent() {
        System.out.println("Roll Number is " + rollNumber);
        System.out.println("Student name " + studentName);
        System.out.println("Percentage is " + percentage);
    }

    public void search(int r) {
        System.out.println("Searching roll number: " + r);
    }

    public void search(String name) {
        System.out.println("Searching name: " + name);
    }

    public void setRollNumber(int r) {
        rollNumber = r;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}