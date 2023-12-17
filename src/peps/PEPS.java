/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peps;

import java.io.File;
import java.io.IOException;

public class PEPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombreArchivoCompras = "compras.txt";
        verificarYCrearArchivo(nombreArchivoCompras);

        // Verificar y crear el archivo salidas.txt
        String nombreArchivoSalidas = "salidas.txt";
        verificarYCrearArchivo(nombreArchivoSalidas);
        
        // Verificar y crear el archivo inventario.txt
        String nombreInventario = "inventario.txt";
        verificarYCrearArchivo(nombreInventario);
        
        String nombreOperaciones = "operaciones.txt";
        verificarYCrearArchivo(nombreOperaciones);
        
        
        Menu ventana = new Menu();
        ventana.setVisible(true);
    }
    
    public static void verificarYCrearArchivo(String nombreArchivo) {
        // Crear un objeto File con el nombre del archivo
        File archivo = new File(nombreArchivo);

        try {
            // Verificar si el archivo ya existe
            if (archivo.exists()) {
                System.out.println("El archivo " + nombreArchivo + " ya existe.");
            } else {
                // Si no existe, intentar crearlo
                if (archivo.createNewFile()) {
                    System.out.println("Se ha creado el archivo " + nombreArchivo + " exitosamente.");
                } else {
                    System.out.println("No se pudo crear el archivo " + nombreArchivo + ".");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al verificar o crear el archivo " + nombreArchivo + ": " + e.getMessage());
        }
    }
    
}
