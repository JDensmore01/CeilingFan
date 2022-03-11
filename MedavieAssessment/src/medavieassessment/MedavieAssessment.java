/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medavieassessment;

import java.util.Scanner;

/**
 *
 * @author jason
 * @date March 11, 2022
 * @purpose Demonstrate functionality of CeilingFan Class
 */
public class MedavieAssessment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean exit = false;
        CeilingFan cf = new CeilingFan();
        
        Scanner sc = new Scanner(System.in);
        
        String menu = "1. Change Speed\t|" +
                " 2. Reverse Direction\t|" +
                " 3. Exit";        
        
        while (!exit) {
            System.out.println(menu);
            switch (sc.next()) {
                case "1":
                    cf.changeSpeed();
                    System.out.println("New Speed: " + cf.getSpeed());
                    break;
                case "2":
                    cf.reverseDirection();
                    System.out.println("New direction: " + 
                            (cf.isReverse() ? "Reversed" : "Forward"));
                    break;
                case "3":
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option.");
                    break;
            }
        }
    }
    
}
