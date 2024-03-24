package com.cr.main;

//Importar las clases necesarias
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.cr.listas.listas;


public class main {

    
    public static void main(String[] args) {

        // Solicitar la cantidad de números
        System.out.println("¿Cuántos números desea sumar? ");
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = scanner.nextInt();

        // Creamos una lista para almacenar los números
        List<Integer> listaNumeros = new ArrayList<>();

        // Solicitamos cada número al usuario
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            listaNumeros.add(numero);
        }

        // Creamos instancia de la clase listas
        listas lista = new listas();

        // Sumar los números de la lista
        Integer resultado = lista.sumarLista(listaNumeros);

        // Mostramos el resultado
        System.out.println("La suma de los números es: " + resultado);
    }

}
