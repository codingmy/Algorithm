import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] arg) throws IOException {
        int bracketNumber = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = br.readLine();
        for (int i = 0; i < Integer.parseInt(inputNumber); i++) {
            String str = br.readLine();
            System.out.println(getResultMessage(checkBracket(str, bracketNumber)));

        }

    }
    
    public static String getResultMessage(boolean bln){
        if(bln)
            return "YES";
        else return "NO";
    }

    public static boolean checkBracket(String str, int bracketNumber) {
        if (str.length() == 0) {
            return bracketNumber == 0;
        }
        if (str.charAt(0) == '(') {
            bracketNumber++;
        } else if (str.charAt(0) == ')') {
            bracketNumber--;
        } else {
            return false;
        }
        if (bracketNumber < 0) {
            return false;
        }
        return checkBracket(str.substring(1), bracketNumber);
    }
}
