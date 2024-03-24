package com.cr.main;

import java.util.Scanner;

import com.cr.vocalConstante.parser;

public class Main {

    
    public static void main(String[] args) {
        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.println("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        // Crear una instancia de la clase parser
        parser parser = new parser();

        // Convertir la cadena a un arreglo de caracteres
        char[] caracteres = parser.convertirCadenaAArreglo(cadena);

        // Contenedores para las vocales y consonantes
        StringBuilder vocales = new StringBuilder();
        StringBuilder consonantes = new StringBuilder();

        // Recorrer cada caracter del arreglo
        for (char caracter : caracteres) {
            // Verificar si es vocal
            if (parser.esVocal(caracter)) {
                // Agregar a la cadena de vocales
                vocales.append(caracter);
            } else if (Character.isLetter(caracter)) {
                // Agregar a la cadena de consonantes
                consonantes.append(caracter);
            }
        }

        // Mostrar en la consola las vocales y consonantes
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
}
