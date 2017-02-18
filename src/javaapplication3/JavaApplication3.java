/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;


/**
 *
 * @author practi04
 */

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double x, p, h, a;
        System.out.println("un lado del triangulo equilatero: ");
        x = lector.nextDouble();
        p = x+x+x;
        h = Math.sqrt(x*x-(x/2)*(x/2));
        a = (h*x)/2;
        System.out.println("perimetro: " +p+ "\nalturra: " +h+  "\narea: " +a);
 
    }
    
}
