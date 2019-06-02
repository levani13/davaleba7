import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader objReader = new BufferedReader(new FileReader("C:/Users/WinPux/Desktop/luwebisbechdva.txt"));

            String strCurrentLine;
            int i = 0;

            while ((strCurrentLine = objReader.readLine()) != null) {
                if(i%2==1){
                    System.out.println(strCurrentLine);
                }
                i+=1;
            }
        }
    }
