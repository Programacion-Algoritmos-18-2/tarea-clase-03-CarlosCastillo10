/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author carlos
 */
public class Docente extends Persona{
    private double sueldo;//atributo privado
    
    //Llamamos al constructor de la clase padre
    public Docente(String n, String a,  int e, double s){
        super(n, a, e);
        agregar_sueldo(s);
    }
    
    //Metodo que permite agregar el sueldo
    public void agregar_sueldo(double s){
        sueldo = s;
    }
    
    //Retorna el sueldo.
    public double obtener_sueldo(){
        return sueldo;
    }
    
    //Sobre escribimos el metodo toString.
    @Override
    public String toString(){
    
        return String.format("%s - %.2f", super.toString(), obtener_sueldo());
    }
    
    
}
