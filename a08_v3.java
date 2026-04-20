/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u09;

import java.io.*;
import java.util.Scanner;

public class a08_v3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el nombre del archivo con extensión .txt: ");
        String archivoOrigen = sc.nextLine();
        if (archivoOrigen.endsWith(".txt")) {

            //Escritura del archivo de Origen
            try (BufferedWriter out = new BufferedWriter(new FileWriter(archivoOrigen))) {
                System.out.print("Escribe una linea: ");
                out.write(sc.nextLine());
                out.newLine();
                System.out.print("Escribe una segunda linea: ");
                out.write(sc.nextLine());
                out.newLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            //Copia del archivo
            try (
                    BufferedReader in = new BufferedReader(new FileReader(archivoOrigen));
                    BufferedWriter out = new BufferedWriter(new FileWriter("copia_de_" + archivoOrigen))) {
                String linea;
                while ((linea = in.readLine()) != null) {
                    out.write(linea);
                    out.newLine();
                }
            } catch (Exception e) {
                System.out.print("Error de copia: " + e.getMessage());
            }
        } else {
            System.out.print("Error no puedes crear un archivo que no tenga el formato .txt.");
        }
        System.out.println("Directorio actual: " + System.getProperty("user.dir"));
    }
}