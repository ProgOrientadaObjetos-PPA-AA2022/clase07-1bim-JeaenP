/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class EscrituraArchivoSecuencial {
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Hospital registroHospitales;
    private ArrayList<Hospital> listaHospitales;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaHospitales(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaHospitales().size() > 0) {
                for (int i = 0; i < obtenerListaHospitales().size(); i++) {
                    establecerRegistroHospital(obtenerListaHospitales().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerRegistroHospital(Hospital p) {
        registroHospitales = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroHospitales); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerListaHospitales() {
        paquete5.LecturaArchivoSecuencial l = 
                new paquete5.LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerHospitales();
        listaHospitales = l.obtenerHospitales();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Hospital> obtenerListaHospitales() {
        return listaHospitales;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 
}
