/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.horas.a.semanas.dias.y.horas;
import java.util.Scanner;

/**
 *
 * @author camilo medina
 */
public class DeHorasASemanasDiasYHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        int horasTotales;
        int semanas;
        int dias;
        int horas;
        
        System.out.println("el numero de horas es de ");
        horasTotales= entrada.nextInt();
        
        semanas=(horasTotales/168);
        dias= horasTotales%168/24;
        horas=horasTotales%24;
        System.out.println("el numero de semanas es de "+semanas);
        System.out.println("el numero de dias es de "+dias);
        System.out.println("el numero de horas es de "+horas);
    }
    
}