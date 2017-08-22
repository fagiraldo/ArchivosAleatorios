/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Isabel-Fabian
 */
public class LecturaDato {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
     File archivo = new File ("lectura2.txt");
     FileInputStream fout = new FileInputStream(archivo);
     DataInputStream dout = new DataInputStream(fout);
     int dato = dout.readInt();
     System.out.println(dato);
     dout.close();
     fout.close();
  
    }
}
