//Maddison Montijo/ Assignment 1.3 / CSD-402    

import java.util.Scanner;

public class Helloworld {

    public static void main(String[] args) {
        
        //Used the Scanner library because I remember it the most. 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of water in:");
        int waterMass = sc.nextInt();

        //  I'll probably explore options to have multiple inputs in one lines to waste less lines.
        System.out.println("Enter the inital temperature of the water in Celsius:");
        int initTmp = sc.nextInt();


        System.out.println("Enter the final temperature of the  water in Celsius:");
        int finTmp = sc.nextInt();

        System.out.println("Thermal Energy Formula : Q = m x c x delta(T)");

        int c = finTmp - initTmp;
        int Q = waterMass * (c) * 4184;

        //Double checked my work with an acutal thermal energy calculator
        //https://a2zcalculators.com/science-and-engineering-calculators/thermal-energy-calculator
        System.out.println(waterMass + " x " + c + " x 4184");

        System.out.println(Q + "J");

    }
}