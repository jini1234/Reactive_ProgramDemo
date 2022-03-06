import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*public class Test {
    public static void main(String[] args) {
        //int i = 0;
        //System.out.println(i);

        //List iterations

        List<Integer> l = new ArrayList<Integer>();
        l.add(5);
        l.add(10);


        for (Integer i : l) {
            System.out.println(i);

        }
    }
}*/
import java.io.File;
        import java.io.IOException;
        import org.apache.commons.io.FileUtils;
        import org.apache.commons.io.LineIterator;
public class Test {
    public static void main(String[] args) {
        try {

            usingLineIterator();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void usingLineIterator() throws IOException {
        //get the file object
        File file = FileUtils.getFile("/Users/jinisha/Desktop/SSH_2k.log.txt");
        try(LineIterator lineIterator = FileUtils.lineIterator(file)) {
            System.out.println("Contents of input.txt");
            while(lineIterator.hasNext()) {
                System.out.println(lineIterator.next());
            }
        }



    }
}
