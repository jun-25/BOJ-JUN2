import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr=new int[10];

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());


        String str= String.valueOf(val);

        for(int i=0; i<str.length();i++){
            arr[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}