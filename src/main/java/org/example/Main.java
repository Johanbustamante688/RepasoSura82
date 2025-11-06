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

        System.out.println("Lista de Clientes: ");

        ArrayList<String> nombresClientes=new ArrayList<>();
        nombresClientes.add("Minimercados El Sol");
        nombresClientes.add("Fruver La Campiña");
        nombresClientes.add("Tienda La Curva");
        nombresClientes.add("Frutas El Mono");
        nombresClientes.add("Supermercados Los Giraldo");
        System.out.println(nombresClientes);


        //arreglo o lista de nombres de proveedores (10)--> String

        System.out.println("Lista de Proveedores: ");

        ArrayList<String> nombreProveedores =new ArrayList<>();
        nombreProveedores.add("Importadora San Martin");
        nombreProveedores.add("Frutas el Oeste");
        nombreProveedores.add("Importadora De Frutas SA");
        nombreProveedores.add("Mega Frutas");
        nombreProveedores.add("Importadora Dole\n");
        nombreProveedores.add("Importadora Del Valle");
        nombreProveedores.add("Distribuidora Frutal");
        nombreProveedores.add("Distri Frutras");
        nombreProveedores.add("Frutinal SA");
        nombreProveedores.add("Frunat SA");
        System.out.println(nombreProveedores);

        //arreglo o lista de valores de servicios publicos (5 meses) --> Integer/Double

        System.out.println("Los Valores de Servicios Publicos de los Ultimos 5 meses son: ");

        ArrayList<Double> valorServiciosPublicos =new ArrayList<>();
        valorServiciosPublicos.add(1235000.2);
        valorServiciosPublicos.add(1423500.5);
        valorServiciosPublicos.add(1267900.9);
        valorServiciosPublicos.add(1330750.4);
        valorServiciosPublicos.add(1199780.7);
        System.out.println(valorServiciosPublicos);


    }
}
