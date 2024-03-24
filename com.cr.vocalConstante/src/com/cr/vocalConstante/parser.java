package com.cr.vocalConstante;

public class parser {

    /*
     * Metodo para convertir la cadena a un arreglo de caracteres
     */
    public char[] convertirCadenaAArreglo(String cadena) {
        // Convertir la cadena a un arreglo de caracteres
        char[] arregloCaracteres = cadena.toCharArray();
        return arregloCaracteres;
    }

    //metodo para validar si es vocal 
    public boolean esVocal(char caracter) {
        // Variable para almacenar el resultado de la comparación
        boolean comparador = false;

        // Evaluar si el caracter es una vocal
        switch (caracter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'á':
            case 'é':
            case 'í':
            case 'ó':
            case 'ú':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Á':
            case 'É':
            case 'Í':
            case 'Ó':
            case 'Ú':
                // Si es vocal, se cambia el valor de comparador a true
                comparador = true;
                break;
            default:
                // Si no es vocal, se mantiene el valor de comparador a false
                comparador = false;
                break;
        }

        // Retornar el resultado de la comparación
        return comparador;
    }

    //metodo para validar si es letra
    public boolean esLetra(char caracter) {
        // Usar el método `Character.isLetter` para verificar si es letra
        return Character.isLetter(caracter);
    }

}
