/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u09;

import java.util.Scanner;

public class a01 {

    public static void main(String[] args) {
        int numero = leerNumero();
        System.out.println("Numero introducido: " + numero);
    }

    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce un entero: ");
            try {
                String texto = sc.nextLine();
                int numero = Integer.parseInt(texto);
                return numero;
            } catch (Exception e) {
                System.out.println("Error, no has introducido un numero valido");
            }
        }
    }
}
