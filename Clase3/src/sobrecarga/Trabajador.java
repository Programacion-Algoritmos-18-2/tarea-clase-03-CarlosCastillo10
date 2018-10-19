/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author reroes
 */
public class Trabajador {
    private String nombres;
    private double sueldo_mensual = 0;
    private String apellidos;
    
    public void agregar_nombres(String n){
        nombres = n;
    }
    
    public void agregar_nombres(String n1, String n2){
        nombres = String.format("%s-%s", n1, n2);
    }
    
    
    public void agregar_sueldo(double sueldo){
        sueldo_mensual = sueldo;
    }
    
    //Metodo que recibe un arreglo
    public void agregar_sueldo(double [] sueldos){
        for(int x = 0; x< sueldos.length; x++){
            sueldo_mensual = sueldo_mensual + sueldos[x];
        }
        
    }
    //Metodo que recibe todos los sueldos.
    public void agregar_sueldo(double s1, double s2, double s3, double s4){
        sueldo_mensual = s1 + s2 + s3 + s4;
    }
        
    public void agregar_apellidos(String n){
        apellidos = n;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public double obtener_sueldo_mensual(){
        return sueldo_mensual;
    }
    
   
    public String presentar_datos(){
        return String.format("\n\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
    
    
}
