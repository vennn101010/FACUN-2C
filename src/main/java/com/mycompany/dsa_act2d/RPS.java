/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_act2d;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class RPS {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
    
    
        System.out.println("                                        ************************");
        System.out.println("                                        *        Let's Play!      *");
        System.out.println("                                        ************************");
        System.out.println("                                        *        [1] ROCK         ");
        System.out.println("                                        *       [2] PAPER         ");
        System.out.println("                                        *      [3] SCISSOR        ");
        System.out.println("                                        ************************");
        
        System.out.println("Enter Player 1: ");
        int p1 = input.nextInt();
        System.out.println("Enter Player 2: ");
        int p2 = input.nextInt();
        
        if(p1 == 1 && p2 == 1)
        {
            System.out.println("DRAW"); // DRAW
        }
        else if(p1 == 1 && p2 == 2)
        {
            System.out.println("Player 2 wins!");
        }
        else if(p1 == 1 && p2 == 3)
        {
            System.out.println("Player 1 wins!");
        }
        else if(p1 == 2 && p2 == 2)
        {
            System.out.println("DRAW"); //DRAW
        }
        else if(p1 == 3 && p2 == 3)
        {
            System.out.println("DRAW"); // DRAW
        }
        else if(p1 == 2 && p2 == 1)
        {
            System.out.println("Player 1 wins!");
        }
        else if(p1 == 2 && p2 == 3)
        {
            System.out.println("Player 2 wins!");
        }
        else if(p1 == 3 && p2 == 1)
        {
            System.out.println("Player 2 wins!");
        }else if(p1 == 3 && p2 == 2)
        {
            System.out.println("Player 1 wins!");
        }
        else
        {
            System.out.println("Error!! Try Again. ");
        }
        
        
    }
}
