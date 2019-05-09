/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4.ta2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nico
 */
public class UT4TA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        TArbolBB arbolito = new TArbolBB();
        
        String nombreArchivo = "src/ut4/ta2/clavesPrueba.txt";
        File file = new File (nombreArchivo);
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line; 
            while ((line = br.readLine()) != null) { 
                TElementoAB elem = new TElementoAB(line, line);
                arbolito.insertar(elem);
            }
        }
        Comparable esta = "1383";
        System.out.println(arbolito.buscar(esta).datos);
    }
    
}
