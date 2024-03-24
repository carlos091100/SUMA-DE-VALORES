package com.cr.listas;

import java.util.List;

public class listas {
	
	//Creamos un metodo sumar lista
	public Integer sumarLista(List<Integer> lista) {

	    // Utilizamos la variable para almacenar la suma acumulada
	    Integer suma = 0;

	    // Recorremos cada elemento de la lista
	    for (Integer valor : lista) {

	        // Sumamos el valor actual a la variable suma
	        suma += valor;
	    }

	    // Aca se devuelve la suma acumulada
	    return suma;
	}
}