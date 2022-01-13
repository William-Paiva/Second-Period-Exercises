package exercise1;

import java.util.Scanner;

public class StringInvert {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		inverse(scanner);
		
		scanner.close();

	}
	
	public static void inverse(Scanner scanner) {
		
		System.out.println("Digite a palavra ou frase para invertê-la: ");
		String phrase = scanner.nextLine();
		
		StringBuilder inverse = new StringBuilder(phrase).reverse();
		
		System.out.println("Invertendo a palavra "+phrase+" = "+inverse);
		
	}

}
