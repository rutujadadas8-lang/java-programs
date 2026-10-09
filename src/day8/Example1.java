
package day8;

public class Example1 {

    public static void main(String[] args) {

        String s1 = "my name is Alice I have 2 brothers and 1 sister i am 9 years old";

        String words[] = s1.split(" ");

        int intCounter = 0;

        for (String word : words) {
            try {
                int n1 = Integer.parseInt(word);
                intCounter++;
            }
            catch (NumberFormatException ex) {
                // Word is not an integer
            }
        }

        System.out.println("There are " + intCounter + " integers in this sentence");
    }
}