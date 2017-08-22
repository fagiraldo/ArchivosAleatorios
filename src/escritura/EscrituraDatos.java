/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Isabel-Fabian
 */
public class EscrituraDatos {
    public static void main(String[] args) throws FileNotFoundException, IOException {
     File archivo = new File ("lectura2.txt");
     FileOutputStream fout = new FileOutputStream(archivo,true);
     DataOutputStream dout = new DataOutputStream(fout);
     dout.writeInt(6);
     dout.flush();
     dout.close();
     fout.close();
  
    }
}
