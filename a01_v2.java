/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u09;

import java.util.Scanner;

public class a01_v2 {

    public static void main(String[] args) {
        try {
            System.out.println(leerEntero());
        } catch (Exception e) {
            System.out.println("Error: no es un número");
        }
    }

    public static Integer leerEntero() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        String texto = sc.nextLine();
        return Integer.parseInt(texto);
    }
}
