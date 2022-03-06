import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/Users/jinisha/Desktop/abc.txt");
        BufferedReader br=new BufferedReader(fr);

        int x=0;
        while(br.readLine()!=null){
            x++;
            System.out.println(br.readLine());
        }
        System.out.println(x);
        fr.close();
        br.close();
    }
}
