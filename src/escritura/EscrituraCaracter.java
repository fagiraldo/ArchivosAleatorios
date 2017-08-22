/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

import java.io.*;

public class EscrituraCaracter {
    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        File archivo = new File ("lectura.txt");
        FileWriter fr = new FileWriter (archivo,true);
        PrintStream output
                = new PrintStream(archivo);
            
        output.println("Hello world.");
        output.println();
        output.println("This program produces four");
        output.println("lines of output.");
        output.format("%d", 5);
    }
}
