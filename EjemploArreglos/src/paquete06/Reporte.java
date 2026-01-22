/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Reporte {

    public static void imprimirReporte(String[] cafeterias, String[] sedes,
            double[] promediosCaf, int[] pedidosMenor, int[] pedidosMayor,
            int pedidosDia, String caferiaMasPedidos) {
        /*
        Implementamos un procedimiento para presentar el reporte, donde analizamos
        qué parámetros necesita este procedimiento. Al final presentamos el listado de cada cafeteria
        con todo lo que el ejercicio pide
         */
        String mensaje = "Listado de Cafeterías\n";

        for (int i = 0; i < cafeterias.length; i++) {
            mensaje = String.format("%sCafetería: %s (Sede: %s), "
                    + "promedio de pedidos: %.2f, número menor de pedidos: %d, "
                    + "número mayor de pedidos: %d\n",
                    mensaje,
                    cafeterias[i],
                    sedes[i],
                    promediosCaf[i],
                    pedidosMenor[i],
                    pedidosMayor[i]);
        }

        mensaje = String.format("%s\nPedidos del día miércoles: %d\n", mensaje, pedidosDia);
        mensaje = String.format("%s\nCafeterías más pedidos: %s", mensaje, caferiaMasPedidos);

        System.out.printf("%s\n", mensaje);
    }
}
