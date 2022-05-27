/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        String nombreArchivo = "profesores.data";
        
        Hospital h1 = new Hospital("Hospital Regional",45,140.99);
        Hospital h2 = new Hospital("Hospital UTPL",78,500.00);
        Hospital h3 = new Hospital("Hospital Medilab",12,150.5);

        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistroHospital(h1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(h2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospitales();
        System.out.println(lectura);
    }
    
}
