package paquete01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author reroes
 */

import paquete02.Establecimiento;
import paquete03.Pedido;
import paquete03.Ubicacion;
import paquete04.Operacion;
import paquete05.Informe;
import paquete06.Reporte;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    /*
    En este apartado invocamos las funciones correspondientes, esta es la 
    página principal, donde llamamos para poder realizar el ingreso de datos,
    las operaciones y el reporte.
    */
    
        String [] misCafeterias = Establecimiento.obtenerCafeterias();
        // En este arreglo unidimensional de cadenas, llamamos a la función para
        // obtener  el nombre de las cafeterías 

        int [][] misPedidos = Pedido.obtenerPedidos();
        // En este arreglo bidimensionales de enteros llamamos una función 
        // para obtener la matriz de los pedidos de cada establecimiento semanalmente

        String [] misSedes = Ubicacion.obtenerUbicaciones();
        /*
        En este arreglo unidimensional de cadenas llamamos a una fucnión para 
        obtener la ubicación de las sedes
        */
        
        double [] promedioSemanal = Operacion.obtenerPromedioSemanal(misPedidos);
        /*
        En este arreglo unidimensional de decimales llamamos a una función a la
        cual le enviámos los pedidos anteriormente ingresados para posteriormente
        sacar el promedio semanal de cada establecimieto
        */
        
        int pedidosMiercoles = Informe.obtenerTotalDia(misPedidos, 3);
        /*
        Declaramos una variable de tipo entero, que llame a una función a la 
        cual le enviamos los pedidos y enviámos el día 3 a lo que equivale a
        miércoles, luego dentro de la función, empieza a sumar los pedidos de ese
        día
        */
        
        int sumaPedidosTotal = Operacion.obtenerSumaTotal(misPedidos);
        /*
        Declaramos una variable de tipo entero que llama a una fucnión a la cual 
        le enviamos los pedidos, para posteriormente realizar una operación
        en la cual se recorren los espacios del arreglo y se los suma para obtener
        una totalización
        */
        
        String cafeteriaMasPedida = Informe.obtenerCafeteriaMasPedidos(misPedidos, misCafeterias);
        /*
        Declaramos una variable de tipo cadena que invoca una función a la cual
        le enviamos los pedidos y las cafeterías para obtener la cafetería que mas
        pedidos tuvo
        */
        
        int [] pedidosMenores = Informe.obtenerMenorPedidoCafeteria(misPedidos);
        /*
        Declaramos una variable de tipo cadena que invoca una función a la cual
        le enviamos los pedidos y las cafeterías para obtener de cada cafetería
        la menor cantidad de pedidos que tuvo        

        */
        
        int [] pedidosMayores = Informe.obtenerMayorPedidoCafeteria(misPedidos);
        /*
        Declaramos una variable de tipo cadena que invoca una función a la cual
        le enviamos los pedidos y las cafeterías para obtener de cada cafetería
        la mayor cantidad de pedidos que tuvo          
        */
        
        Reporte.imprimirReporte(misCafeterias, misSedes, 
                promedioSemanal, 
                pedidosMenores, 
                pedidosMayores, 
                pedidosMiercoles, 
                cafeteriaMasPedida);
        /*
        Este es un procedimiento al cual le enviamos los datos que copilamos
        en las variables que anteriormente declaramos para finalmente imprimir
        un reporte
        */
    }
 
}