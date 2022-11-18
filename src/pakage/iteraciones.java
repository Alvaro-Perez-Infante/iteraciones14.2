package pakage;

import java.util.Scanner;

public class iteraciones {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		final int N = 10;
		
		
		for (int f=1; f<=N; f++) {
			for (int a=1; a<= N; a++) {
				if( a <= ( N-f ) ) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
}
}
