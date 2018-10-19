/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Trabajador t = new Trabajador();//Objeto de la clase trabajador
        double sueldo;
        double semana1, semana2, semana3, semana4;
        double []sueldos = new double[4];//Arreglo que permite guardar los valores.
        
        System.out.printf("Número de nombres del trabajador 1 o 2: ");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();
        
        if(numero_nombres==1){
            System.out.printf("\nIngrese el nombre del trabajador: ");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        }else{
            System.out.printf("\nIngrese el nombre uno del trabajador: ");
            String nombre1 = scanner.nextLine();
            System.out.printf("Ingrese el nombre dos del trabajador: ");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);
        
        }
        
        System.out.printf("Ingrese el apellido del trabajador: ");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        
        System.out.printf("\n\t1. Ingresar sueldo mensual\n\t2. Ingresar "
                + "sueldo semanal\nEscoja una opcion: ");
        int opcion = scanner.nextInt();
        System.out.println();
        
        if(opcion == 1){
            System.out.printf("\nIngrese el sueldo del trabajador: ");
            sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
                
        }else{
            System.out.println("\nSUELDO MENSUAL");
            System.out.printf("\n\t1. Forma 1\n\t2. Forma 2\nIngrese una opcion: ");
            int opcion2 = scanner.nextInt();
            if(opcion2 == 1){//Envia el arreglo con los sueldos
                for(int x = 0; x<sueldos.length; x++){
                System.out.printf("Ingrese el sueldo de la semana %d: ",x + 1);
                sueldos[x] = scanner.nextDouble();
               
                }
                t.agregar_sueldo(sueldos);
            }else{//Pide los 4 valores
                System.out.printf("\nIngrese sueldo semana 1: ");
                semana1 = scanner.nextDouble();
                
                System.out.printf("Ingrese sueldo semana 2: ");
                semana2 = scanner.nextDouble();
                
                System.out.printf("Ingrese sueldo semana 3: ");
                semana3 = scanner.nextDouble();
                
                System.out.printf("Ingrese sueldo semana 4: ");
                semana4 = scanner.nextDouble();
                
                t.agregar_sueldo(semana1, semana2, semana3, semana4);
            }
            
            
        }
        
        
        System.out.printf("\nLos datos del trabajador son: %s\n", t.presentar_datos());
        
                
    }
}
