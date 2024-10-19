import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        if (n == 1) {
            int out = Integer.parseInt(st.nextToken());
            System.out.println(out * out);
        } else {
            int a = 0;
            int min = 0;
            int max = 0;
 /*           for (int i = 0; i < n; i++) {
                a = Integer.parseInt(st.nextToken());
                if (i == 0) {
                    min = a;
                    max = a;
                } else if (min > a) {
                    min = a;
                } else if (max < a) {
                    max = a;
                }

            }*/
            a = Integer.parseInt(st.nextToken());
            min = a;
            max = a;
            while (st.hasMoreTokens()) {
                a = Integer.parseInt(st.nextToken());
                if (max < a) {
                    max = a;
                }
                if (min > a) {
                    min = a;
                }
            }
            System.out.println(min * max);
        }
    }
}