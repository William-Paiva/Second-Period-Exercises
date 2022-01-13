package exercise11;

import java.util.Scanner;

public class Classification {
	
	static TeamsData[]dados = new TeamsData[3];
		
	public static void main(String[] args) {
		
		register();
		print();

	}

public static void register() {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
		
		System.out.println("Digite as informa��es abaixo:\n ");
		System.out.println("Nome do time: ");
		String name = scanner.nextLine();
		System.out.println("Pontua��o: ");
		int points = scanner.nextInt();
		System.out.println("Saldo de gols: ");
		int goals = scanner.nextInt();
		System.out.println("N�mero de partidas disputadas: ");
		int nPlays = scanner.nextInt();
		scanner.nextLine();
		
		TeamsData d = new TeamsData(name, points, goals, nPlays);
		
		dados[i] = d;
		
		}
		scanner.close();
	}
	
	public static void print() {
		
		System.out.println("\n-----CLASSIFICA��O DOS TIMES-----\n");
		
		for(int i=0; i<3; i++) {
			dados[i].printD();
		}
	}
}
