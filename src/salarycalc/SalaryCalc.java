/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarycalc;

/**
 *
 * @author William
 */
import java.util.Scanner;
public class SalaryCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
      int perHourPay; 
      
        System.out.println("How much do you make per hour?");
      perHourPay = scnr.nextInt(); 
      
      System.out.println("Your gross salary is $" + (perHourPay * 40 * 52) + ".");
   }
}
    

