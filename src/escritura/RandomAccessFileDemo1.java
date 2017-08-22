/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

/**
 *
 * @author Isabel-Fabian
 */
import java.io.*;

public class RandomAccessFileDemo1 {

   public static void main(String[] args) {
      try {
         // create a new RandomAccessFile with filename test
         RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
          for (int i = 0; i < 10; i++) {
              raf.writeInt((int)i);
          }
         // set the file pointer at 0 position
         raf.seek(0);
         System.out.println("" + raf.readInt());
         System.out.println("" + raf.readInt());
         raf.seek(3*4); //4 - bytes //Se posiciona en el byte especificado
         System.out.println("" + raf.readInt());
         raf.skipBytes(4); //Salta numero de Bytes
        System.out.println("" + raf.readInt());
          System.out.println(raf.getFilePointer()); //Byte actual
      } catch (IOException ex) {
         ex.printStackTrace();
      }

   }
}
