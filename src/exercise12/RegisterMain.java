package exercise12;

import java.util.Scanner;

public class RegisterMain {
	
	static Scanner scanner = new Scanner(System.in);
	static StudantsData dados [] = new StudantsData[100];
	static int count = 0;

	public static void main(String[] args) {
	
int option;
		
		do {
			
			option = menu();
			scanner.nextLine();
			
			if(option==1) {
				register();
			}else if(option==2) {
				list();
			}else if(option==9) {
				System.out.println("Saindo do programa...");
			}
				
		}while(option!=9);
		System.out.println("Obrigado!!!");
		
	}
	
	public static int menu() {
		
		System.out.println("-----CADASTRO DE ALUNOS-----\n");
		System.out.println("Escolha uma das opções abaixo:\n ");
		System.out.println("1. Cadastrar Aluno");
		System.out.println("2. Listar Alunos Cadastrados");
		System.out.println("9. Sair\n");
		
		return scanner.nextInt();
	}
	
	public static void register() {
		
		System.out.println("Preencha as informações abaixo:\n ");
		System.out.println("Nome: ");
		String name = scanner.nextLine();
		System.out.println("CPF: ");
		int cpf = scanner.nextInt();
		System.out.println("Data de Nascimento: ");
		int doBirth = scanner.nextInt();
		System.out.println("Rua: ");
		scanner.nextLine();
		String street = scanner.nextLine();
		System.out.println("Número: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Bairro: ");
		String district = scanner.nextLine();
		System.out.println("Cidade: ");
		String city = scanner.nextLine();
		System.out.println("Estado: ");
		String state = scanner.nextLine();
		
		StudantsAddress e = new StudantsAddress(street, number, district, city, state);
		StudantsData d = new StudantsData(name, cpf, doBirth, e);
		
		dados[count] = d;
		count++;
	}
	
	public static void list() {
		
		System.out.println("Listando Alunos Cadastrados...\n");
		for(int i=0; i<count; i++) {
			dados[i].printDados();
		}
		

	}

}
