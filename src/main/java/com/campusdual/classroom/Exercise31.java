package com.campusdual.classroom;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Exercise31 {

    public static void main(String[] args) {
        String ruta = "src/main/resources/lorem.txt";
        File fichero = new File(ruta);

        try{
            if (fichero.exists()) {
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                String linea;

                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }
            else {
                System.out.println("El fichero no existe.");
            }
        } catch (Exception e) {
            System.err.println("Error al acceder al fichero: " + e.getMessage());
        }
    }
}
