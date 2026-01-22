/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Operacion {

    public static double[] obtenerPromedioSemanal(int[][] pedidos) {
        /*
        Aqui obtenemos el promedio semanal de cada cageteria, y devolvemos un arreglo
        unidimencional al main, para luego mostrarlo en el reporte final.
        */
        double[] promedios = new double[8];
        int suma;
        double promedio;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            promedio = (double) suma / 7;
            promedios[i] = promedio;
        }

        return promedios;
    }

    public static int obtenerSumaTotal(int[][] pedidos) {
        /*
        Aqui obtenemos la suma total de todos los pedidos en todas las cafeterias
        y retornamos un solo valor al main, para luego imprimirlo        
        */

        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {

            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }

        }

        return suma;
    }

    public static int[] obtenerSumaSemanal(int[][] pedidos) {
        /*
        Aqui hacemos la suma semanal de cada cafeteria para poder saber mas adelante 
        cual de esas cafeterias tuvo mas pedidos en la semana
        */
        int[] sumaSemanal = new int[8];
        int suma;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            sumaSemanal[i] = suma;
        }

        return sumaSemanal;
    }

    public static int obtenerMenor(int[] pedidosCafeteria) {
        /*
        Aqui por medio de un for y un if, comparamos los valores para saber cual fue 
        el menor pedidos de cada cafeteria
        */
        int menor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    public static int obtenerMayor(int[] pedidosCafeteria) {
        /*
        Aqui por medio de un for y un if, comparamos los valores para saber cual fue 
        el mayor pedidos de cada cafeteria
        */
        int mayor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }

}
