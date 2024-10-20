import java.io.*;

public class Main{
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str= str.replaceAll("pi|ka|chu", "");
        if(str.isEmpty())
            System.out.println("YES");
        else System.out.println("NO");
    }
}