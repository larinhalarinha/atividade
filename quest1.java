package javateste;

import java.io.*;
import java.util.Arrays;

public class quest1 {
	
	public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream(./datatest.txt);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
        String [] input = new String[3];
        int x = -1;        
        while(linha != null) {
        	x = x + 1;
            input[x] = linha;
            linha = br.readLine();
        }
        String[] TamanhoSeparado = input[2].split(" ");

        int M = 0;
        int result = 0;
        for(int l=0; l < TamanhoSeparado.length; l++) {
        	M += Integer.parseInt(TamanhoSeparado[l]); 
        }
        M = M / Integer.parseInt(input[0]);
        
        while(M > 0) {
        	for(int l=0; l < TamanhoSeparado.length; l++) {
            	result += Integer.parseInt(TamanhoSeparado[l]) / M;
        	}
        	if(result == Integer.parseInt(input[0])) {
        		System.out.println(M);
        		break;
        	}
        	else {
        		M = M - 1;
        		result = 0;
        	}
        }
    }
}