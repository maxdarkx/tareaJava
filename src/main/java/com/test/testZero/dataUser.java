package com.test.testZero;

import java.util.Scanner;

public class dataUser {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario = "";
        String celularUsuario = "";
        String edadUsuario = "";
        String text = "";

        System.out.print("Escriba su nombre: ");
        nombreUsuario = entrada.nextLine();
        System.out.print("Escriba su celular: ");
        celularUsuario = entrada.nextLine();
        System.out.print("Escriba su edad: ");
        edadUsuario = entrada.nextLine();

        text = "Bienvenido senor " + nombreUsuario + ", es un placer para nosotros contar con" +
                " una persona de " + edadUsuario + " anos.\n"+
                "Proximamente nos comunicaremos con usted al numero " + celularUsuario+ "\n" +
                "Feliz dia";

        System.out.println(text);
    }
}
