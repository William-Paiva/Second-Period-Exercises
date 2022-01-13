package exercise13;

import java.util.Scanner;

public class CustomersRegister {
	
	static Scanner scanner = new Scanner(System.in);
	static CustomersData cad[] = new CustomersData[100];
	static int count = 0;

	public static void main(String[] args) {
int option;
		
		do {
			
			option=menu();
			scanner.nextLine();
			
			if(option==1) {
				cadastro();
			}else if(option==2) {
				listOne();
			}else if(option==3) {
				listAll();
			}else if(option==4) {
				remove();
			}else if(option==9) {
				System.out.println("Saindo do Programa...");
			}
			
			
			
		}while(option!=9);
		System.out.println("Obrigado!!!");
		
		
	}

	public static int menu() {
		System.out.println("\n----BEM VINDO AO CADASTRO DE CLIENTES----\n");
		System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO:\n ");
		System.out.println("1. Cadastrar Cliente");
		System.out.println("2. Encontrar Cliente");
		System.out.println("3. Listar Clientes Cadastrados");
		System.out.println("4. Remover Cliente da Lista");
		System.out.println("9. Sair\n ");
		
		return scanner.nextInt();
	}
	
	public static void cadastro() {
		CustomersData c = new CustomersData();
		
		System.out.println("Cadastre as informações abaixo:\n ");
		System.out.println("Id: ");
		c.id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nome: ");
		c.nome = scanner.nextLine();
		System.out.println("CPF: ");
		c.cpf = scanner.nextInt();
		scanner.nextLine();
		System.out.println("E-mail: ");
		c.email = scanner.nextLine();
		
		cad[count] = c;
		count++;
		
	}
	
	public static void listOne() {
		System.out.println("Digite o id do cliente para encontrá-lo:\n ");
		int idc = scanner.nextInt() -1;
		if(idc<count) {
		cad[idc].printC();
		}else {
			System.out.println("Este cliente não se encontra em nosso cadastro!");
		}
	}
	
	public static void listAll() {
		System.out.println("Listando Todos os Clientes...\n ");
		for(int i=0; i<count; i++) {
			cad[i].printC();
		}
	}
	
	public static void remove() {
		System.out.println("Digite o id do cliente para removê-lo: ");
		int r = scanner.nextInt() -1;
		System.out.println("Removendo o cliente:\n ");
		cad[r].printC();
		if(r<count) {
		for(int i=r; i<count; i++) {
			cad[i] = cad[i+1];
		}
		count--;
		}else {
			System.out.println("Este cliente não se encontra em nosso cadastro!");
		}
		
		scanner.close();

	}

}
