/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    public static String obtenerEmpresa() {
        Scanner entrada = new Scanner(System.in);
        String acumulador = "";
        System.out.println("Ingrese el nombre de la empresa");
        String empresa = entrada.nextLine();
        System.out.println("Ingrese nombre de la empresa");
        String nombreEmpresa = entrada.nextLine();
        System.out.println("Ingrese la dirección de la empresa");
        String direccionTrabajo = entrada.nextLine();
        acumulador = String.format("Nombre de la empresa es: %s\nDirección"
                + " de la empresa es: %s",
                nombreEmpresa,
                direccionTrabajo);
        return acumulador;

    }
    // método que permita preguntar al usuario la dirección de la empresa

    // método que permita preguntar al usuario la dirección de la empresa
}
