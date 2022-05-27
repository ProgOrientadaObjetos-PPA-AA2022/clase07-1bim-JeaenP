/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        String nombreArchivo ="Hospital.txt";
        Hospital h1 = new Hospital("Hospital Regional",45,140.99);
        Hospital h2 = new Hospital("Hospital UTPL",78,500.00);
        Hospital h3 = new Hospital("Hospital Medilab",12,150.5);
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        archivo.establecerRegistro(h1);
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
