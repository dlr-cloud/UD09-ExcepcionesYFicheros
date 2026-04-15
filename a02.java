/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u09;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author ALUMNO
 */
import java.io.FileReader;
import java.io.IOException;

public class a02 {
    static final String FICHERO = "Main.java"; // o ruta completa

    public static void main(String[] args) {
        String texto = "";
        FileReader in = null;

        try {
            in = new FileReader(FICHERO);
            int c = in.read();

            while (c != -1) {
                texto = texto + (char) c;
                c = in.read();
            }

            System.out.println(texto);

        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }
}
