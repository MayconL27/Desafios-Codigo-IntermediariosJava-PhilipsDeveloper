import java.util.Scanner;
import java.lang.Math;

public class Desafio02 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
    
		for ( int i = 1 ; i <= N ; i++ ) {
			System.out.println(i + " " + (Math.pow(i, 2))  + " " +  Math.pow(i, 3));
			System.out.println(i + " " + (Math.pow(i, 2)+1) + " " +  (Math.pow(i, 3)+1));
		}

        /**
         * 
	        for ( int i = 1 ; i <= N ; i++ ) {
			    System.out.println(i + " " + (i * i)  + " " +  (i * i * i));
			    System.out.println(i + " " + ((i * i)+1) + " " +  ((i * i * i)+1));
		    }
         */

    }
    
}
