/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package my.mavenproject4;


import java.util.Scanner;
/**
 *
 * @author pandi
 */

public class Mavenproject4 {

     public static void main(String[] args) {
        
           Scanner hack =new Scanner(System.in);
           System.out.println("Enter the number: ");
           int n=hack.nextInt();
             for(int i=1;i<=n;i++)
               {
                    if (n%i==0) {
                       System.out.println(i);
                    }   
               }
     }
}
          
