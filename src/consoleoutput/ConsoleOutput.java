/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoleoutput;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ConsoleOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.format("The value of e is %-10.4f%n", Math.E);
        System.out.format("The value of pi is %10.5f%n", Math.PI);
        System.out.printf(Locale.ENGLISH, "Using English locale: %,d%n", 123456789);
        System.out.printf(Locale.GERMAN, "Using German locale: %,d%n", 123456789);
        System.out.printf(Locale.FRENCH, "Using German locale: %,d%n", 123456789);
        final double PI = (double) 22 / 7; //output will be double too
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------- Input block ---------");
        System.out.print("Enter first number: ");
        num1= sc.nextInt();
                System.out.print("Enter second number: ");
        num2= sc.nextInt();
        System.out.println("------------------");
        System.out.printf(String.join("%n",
                "Using argument index:",
                "First number:%1$-5d",
                "Second number:%2$5d",
                "PI: %3$.20f%n"), num1, num2, PI);
    }
    
}
