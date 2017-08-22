package lectura;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class LecturaCaracter{
    public static void main(String[] args) throws Exception{
        File archivo = new File ("lectura.txt");
        FileReader fr = new FileReader (archivo);
        String input;
        BufferedReader bin = new BufferedReader(fr);
        while ( (input = bin.readLine()) != null){
            System.out.println(input);
        }
    }
}