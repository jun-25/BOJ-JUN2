import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        String a=st.nextToken()+st.nextToken();
        String b=st.nextToken()+st.nextToken();
        System.out.println(Long.parseLong(a)+Long.parseLong(b));



        }
    }
