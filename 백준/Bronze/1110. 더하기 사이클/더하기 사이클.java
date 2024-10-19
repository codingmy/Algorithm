import java.io.*;

public class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int in = Integer.parseInt(br.readLine());
        int original = in;
        int i = 0;
        while (in != original | i == 0) {
            in = in % 10 * 10 + (in / 10 + in % 10) % 10;
            i++;
        }
        System.out.println(i);
    }
}