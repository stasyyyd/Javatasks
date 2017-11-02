package dvfu.java.tasks4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by user on 02.11.2017.
 */
public class task {
    public static void main(String[] args) throws Exception {
        String[] array = new String[20];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = r.readLine();
        }
        for (int i=0;i<array.length;i++) {
            System.out.println(array[array.length-i-1]);
        }
    }

    public static void sort(int[] array) throws IOException{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(r.readLine());
        }
    }

}
