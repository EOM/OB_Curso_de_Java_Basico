package com.miempresa.miproyecto;
import java.util.Date;

// Definición de la clase principal
public class MiClase {

    // Método principal
    public static void ejercicio() {
        // Imprime datos de ejemplo
        int numeroEntero = 10;
        long numeroLargo = 1234567890L;
        double numeroDecimal = 3.14;
        boolean esVerdadero = true;
        String texto = "Hola, mundo!";
        Date fechaActual = new Date();

        System.out.println("Datos de ejemplo:");
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número largo: " + numeroLargo);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Es verdadero? " + esVerdadero);
        System.out.println("Texto: " + texto);
        System.out.println("Fecha actual: " + fechaActual);
    }
}
