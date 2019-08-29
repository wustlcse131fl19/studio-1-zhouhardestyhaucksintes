package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main (String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Choose an integer to be averaged");
        int n2 = ap.nextInt("Choose another integer");

        double average = (n1 + n2)/2.0;
        System.out.println("Your average is " + average + "!");
    }
}
