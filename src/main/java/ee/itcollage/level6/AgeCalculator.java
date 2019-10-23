package ee.itcollage.level6;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println("How old are you?");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); //or sc.nextLine() for String
        System.out.println("You are: " + age + " years old");

        // todo calculate and print which year person was born in
        // todo if person is 18+ ask them whether they have coded java
        // todo if yes, print respect, if no, print good luck
        // todo we will use scanner only in this project, but it's a new thing you can google about a bit

        int birthYear = (2019 - age);
        System.out.println("You were born in " + birthYear);

        if(age >= 18) {
            System.out.println("Have you ever coded in Java20?");

            sc.nextLine();  // reset
            String codedInJava = sc.nextLine(); //or sc.nextLine() for String
            System.out.println((codedInJava.equals("yes")) ? "respect" : "good luck");
        }
    }
}
