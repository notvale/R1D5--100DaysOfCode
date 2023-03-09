package com.objetos.objetoselectronicos;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

import com.objetos.objetoselectronicos.models.Celular;

@SpringBootApplication
public class ObjetoselectronicosApplication {

	public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);		


System.out.println("Ingrese marca de su teléfono: ");
String inmarca = teclado.nextLine();

System.out.println("Ingrese número de serie de su teléfono: ");
Integer innumero_serie = teclado.nextInt();

System.out.println("Ingrese modelo de su teléfono: ");
String inmodelo = teclado.nextLine();

System.out.println("Ingrese tamaño de pantalla de su teléfono: ");
Integer intamanio_pantalla = teclado.nextInt();

System.out.println("Ingrese zoom de la cámara de su teléfono: ");
Integer inzoom = teclado.nextInt();

System.out.println("Ingrese true si su celular es smartphone");
Boolean insmartphone = teclado.nextBoolean();


Celular celularDefault = new Celular();

Celular celularDatoUser = new Celular(inmarca, innumero_serie, inmodelo, intamanio_pantalla, inzoom, insmartphone);


System.out.println(celularDatoUser);

	}

}
