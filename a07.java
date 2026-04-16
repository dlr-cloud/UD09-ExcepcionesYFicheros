/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u09;

import java.io.*;

public class a07 {

    public static void main(String[] args) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\U09\\src\\main\\java\\u09\\Quijote.txt"));

            String linea1 = "En un lugar de la Mancha,";

            for (int i = 0; i < linea1.length(); i++) {
                writer.write(linea1.charAt(i));
            }
            writer.newLine();

            String linea2 = "de cuyo nombre no quiero acordarme";
            writer.write(linea2);
            

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero");
            }
        
        }    
    }
}