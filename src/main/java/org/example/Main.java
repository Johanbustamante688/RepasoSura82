package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Variables Envolturas
        String nombre="Manzana";
        Integer precio=5000;
        String descripcion="Deliciosa manzana importada";
        Integer codigo=4587986;

        //Arreglo Primitivo
        String[] frutas=new String[500];


        //Arreglo Evolucionado Dinamicos (Lista)

        ArrayList<String> frutasDos=new ArrayList<>();
        frutasDos.add("Manzana");
        frutasDos.add("Pera");
        frutasDos.add("Sandia");
        System.out.println(frutasDos);

        //arreglo o lista de nombres de clientes (5)--> String
        //arreglo o lista de nombres de proveedores (10)--> String
        //arreglo o lista de valores de servicios publicos (5 meses) --> Integer/Double






    }
}
