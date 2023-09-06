/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.emperador.ui;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Ingrese los alumnos:");
        Scanner entrada = new Scanner(System.in);
        String alumnos = entrada.nextLine();
        
        String[] resultado = alumnos.split(",");
        
        for(String r : resultado){
            //System.out.println(r);
            String[] alumno = r.split(" ");
            String id = alumno[0];
            String primerNombre = alumno[3];
            String primerApellido = alumno[1];
            System.out.println("ID: " + id + " - " + primerNombre + " " + primerApellido);
        }
        
    }
}
