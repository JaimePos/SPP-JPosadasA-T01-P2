/* Jaime Alejandro Posadas Adame - A00821432 - IFI
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jposadasa.t01.p2;
import java.util.Scanner;
/**
 *
 * @author Jaime Jr
 */
public class SPPJPosadasAT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner (System.in);
        double b, h, a, p;
        
        System.out.println("Bienvenido al caluclo de Area y Perimetro");
        System.out.println("Porfavor introduzca los datos necesarios");
        System.out.println("Base");
        b=kb.nextDouble();
        System.out.println("Altura");
        h=kb.nextDouble();
        a=b*h;
        p=((2*b)+(2*h));
        System.out.println("Area: " + a);
        System.out.println("Perimetro: " + p);
    }
}
