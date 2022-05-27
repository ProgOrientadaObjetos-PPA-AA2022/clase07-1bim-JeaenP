/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    
    String nombre;
    int numeroCamas;
    double presupuesto;
    
    public Hospital(String nom, int numCam, double pre){
        nombre = nom;
        numeroCamas = numCam;
        presupuesto = pre;
    }
    public void establecerNombre(String nom){
        nombre = nom;
    }
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerNumeroCamas(int numCam){
        numeroCamas = numCam;
    }
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public void establecerPresupuesto(double pre){
        presupuesto = pre;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
    
}