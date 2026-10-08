package day6;
public class Students1 {
	
	    int rollNumber;
	    String name;
	    double percentage;

	    Students1() {
	        rollNumber = 111;
	        name = "Rutuja";
	        percentage = 82.82;
	    }

	    Students1(int r, String n, double p) {
	        rollNumber = r;
	        name = n;
	        percentage = p;
	    }

	    void display() {
	        System.out.println(rollNumber);
	        System.out.println(name);
	        System.out.println(percentage);
	    }
	}


