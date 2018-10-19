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
public class Policia extends Persona{
    private String rango;//atributo privado
    
    //Constructor
    public Policia(String n, String a, int e, String r){
        super(n, a, e);//Llamamos al constructor de la clase padre
        agregar_rango(r);
    }
    
    //Metodo que permite agregar el rango
    public void agregar_rango(String r){
        rango = r;
    }
    
    //Devuelve el rango.
    public String obtener_rango(){
        return rango;
    }
    
    //Sobre escribimos el metodo toString.
    @Override
    public String toString(){
    
        return String.format("%s - %s", super.toString(), obtener_rango());
    }
    
}
