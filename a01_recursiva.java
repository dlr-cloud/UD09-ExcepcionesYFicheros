/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u09;

import java.util.Scanner;

public class a01_recursiva {

    public static void main(String[] args) {
        System.out.println(leerEntero());
    }

    public static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        String texto = sc.nextLine();

        try {
            return Integer.parseInt(texto);
        } catch (Exception e) {
            System.out.println("Error: no es un número");
            return leerEntero();
        }
    }
}