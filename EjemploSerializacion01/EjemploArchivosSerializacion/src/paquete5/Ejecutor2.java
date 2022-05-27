/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {

        String nombreArchivo = "data/hospitales.data";
        String idHospital_Buscar = "11112";
        Hospital Hospital_buscar;
        paquete5.LecturaArchivoSecuencial lectura
                = new paquete5.LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdHospital(idHospital_Buscar);
        lectura.establecerHospitalBuscado();
        Hospital_buscar = lectura.obtenerHospitalBuscado();
        if (Hospital_buscar != null) {
            System.out.println(Hospital_buscar);
        } else {
            System.out.println("Hospital no encontrado");
        }
    }

}
