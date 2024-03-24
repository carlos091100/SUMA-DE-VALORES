package com.cr.main;

//Importar las clases necesarias
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.cr.listas.listas;


public class main {

    
    public static void main(String[] args) {

        // Solicitar la cantidad de n�meros
        System.out.println("�Cu�ntos n�meros desea sumar? ");
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = scanner.nextInt();

        // Creamos una lista para almacenar los n�meros
        List<Integer> listaNumeros = new ArrayList<>();

        // Solicitamos cada n�mero al usuario
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el n�mero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            listaNumeros.add(numero);
        }

        // Creamos instancia de la clase listas
        listas lista = new listas();

        // Sumar los n�meros de la lista
        Integer resultado = lista.sumarLista(listaNumeros);

        // Mostramos el resultado
        System.out.println("La suma de los n�meros es: " + resultado);
    }

}
