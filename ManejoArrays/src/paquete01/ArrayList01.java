/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList01 {

    public static void main(String[] args) {

        // creación de un ArrayList
        ArrayList<Integer> arreglo = new ArrayList<>();

        arreglo.add(10);
        arreglo.add(20);
        arreglo.add(30);
        arreglo.add(40);
        arreglo.add(50);
        arreglo.add(60);
        arreglo.add(1000);
        arreglo.add(2000);
        arreglo.add(3000);
        arreglo.add(2);
       

        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(arreglo.get(i));
        }
        
        System.out.println("----------------------------------");

        ArrayList<Double> arreglo3 = new ArrayList<>();

        arreglo3.add(10.2);
        arreglo3.add(11.2);
        arreglo3.add(12.2);
        arreglo3.add(13.2);
        double suma = 0;
        for (int i = 0; i < arreglo3.size(); i++) {
          // System.out.println(arreglo3.get(i));
          suma = suma + arreglo3.get(i);
        
        }
        
        System.out.printf("%.2f\n", suma);
        System.out.println("----------------------------------");
               
    }
}
