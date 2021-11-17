import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class quest3 {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        String vetor, ed = scan.nextLine();
        BufferedReader bastaler = new BufferedReader(new FileReader(endereco));
        
        int a = 0;
        int c[][] = new int[2][2];
        int d[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (a = 0; a < 2; a++) {
                vetor = bastaler.readLine();
                c[i][a] = Integer.parseInt(vetor);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (a = 0; a < 2; a++) {
                vetor = bastaler.readLine();
                d[i][a] = Integer.parseInt(vetor);
            }
        }
        if ((c[0][1] < c[1][0]) || (c[1][1] < c[0][0]) || (d[0][1] < d[1][0]) || (d[1][1] < c[1][1])
                || (c[1][0] > c[0][1]) || (d[0][0] > d[1][1]) || (d[1][0] > d[0][1])) {
            System.out.print('1');
        } else {
            System.out.print('0');
        }
        scan.close();
        bastaler.close();
    }

}