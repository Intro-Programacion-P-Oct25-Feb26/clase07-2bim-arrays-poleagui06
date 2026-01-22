/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import paquete04.Operacion;

/**
 *
 * @author reroes
 */
public class Informe {
    
    public static int obtenerTotalDia(int [][] pedidos, int dia){
        
        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {
            suma = suma + pedidos[i][dia-1];
        }
        return suma;
        
        /*
        En esta función, hacemos un ciclo para poder obtener la cantidad de pedidos
        del día miercoles de cada cafetería
        */
    }
    
    public static String obtenerCafeteriaMasPedidos(int [][] pedidos, String[] cafeterias){
        
        int [] sumaSemanal = Operacion.obtenerSumaSemanal(pedidos);
        
        int mayor = sumaSemanal[0];
        int indice = 0;
        for (int i = 0; i < sumaSemanal.length; i++) {
            int valor = sumaSemanal[i];
            
            if (valor > mayor){
                mayor = valor;
                indice = i;
            }
        }
        
        return cafeterias[indice];
        
        /*
        En esta función, vamos por cada sección del arreglo y vamos comparando la
        cantidad de pedidos semanales de cada una para poder al final guardar la 
        que mas pedidos tuvo
        */
        
    }
    
    public static int [] obtenerMenorPedidoCafeteria(int [][] pedidos){
        int [] pedidosMenores = new int[8];
        
        for (int i = 0; i < pedidos.length; i++) {
            pedidosMenores[i] = Operacion.obtenerMenor(pedidos[i]);
        }
        
        return pedidosMenores;
    
        /*
        En esta función, vamos por cada sección del arreglo y vamos comparando la
        cantidad de pedidos que tuvo en la semana para sacar la menor cantidad
        de pedidos que tuvo
        */
    }
    
    public static int [] obtenerMayorPedidoCafeteria(int [][] pedidos){
        int [] pedidosMayores = new int[8];
        
        for (int i = 0; i < pedidos.length; i++) {
            pedidosMayores[i] = Operacion.obtenerMayor(pedidos[i]);
        }
        
        return pedidosMayores;
        
        /*
        En esta función, vamos por cada sección del arreglo y vamos comparando la
        cantidad de pedidos que tuvo en la semana para sacar la mayor cantidad
        de pedidos que tuvo
        */
    }
    
    
    
}