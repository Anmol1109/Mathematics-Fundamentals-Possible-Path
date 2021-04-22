import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static long gcd(long a,long b){
        if(a > b){
            if(b == 0)
                return a;
            return gcd(b,a % b);
        }
        else{
            if(a == 0)
                return b;
            return gcd(a,b % a);
        }
    }
    static String solve(long a, long b, long x, long y) {
        if(gcd(a,b) == gcd(x,y))
            return "YES";
        else
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] abxy = scanner.nextLine().split(" ");

            long a = Long.parseLong(abxy[0]);

            long b = Long.parseLong(abxy[1]);

            long x = Long.parseLong(abxy[2]);

            long y = Long.parseLong(abxy[3]);

            String result = solve(a, b, x, y);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
