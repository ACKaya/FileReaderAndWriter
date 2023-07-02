import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        //File Reading Process
        try {
            FileReader readFile=new FileReader("test.txt");
            int i= readFile.read();
            while(i!=-1){
                System.out.print((char)i);
                i= readFile.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //File Writing Process
        /*String str="DE";
        try {
            FileWriter readFile=new FileWriter("test.txt",true);
            readFile.write(str);
            readFile.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
    }
}
