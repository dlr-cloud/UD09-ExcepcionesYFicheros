/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u09;

import java.io.File;
import java.util.Scanner;

public class a04 {

    public static void main(String[] args) {
        double suma = 0;
        int contador = 0;

        try {
            File archivo = new File("NumerosReales.txt");
            Scanner leer = new Scanner(archivo);

            String linea = leer.nextLine();
            String[] numeros = linea.split(" "); 

            for (int i = 0; i < numeros.length; i++) { 
                double num = Double.parseDouble(numeros[i]); 
                suma = suma + num;
                contador = contador + 1;
            }

            leer.close();

            double media = suma / contador;

            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);

        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
