package exercise12;

public class StudantsData {

	String name;
	int cpf;
	int doBirth;
	StudantsAddress address;
	
public StudantsData(String name, int cpf, int doBirth,StudantsAddress address) {
		
		this.name = name;
		this.cpf = cpf;
		this.doBirth = doBirth;
		this.address = address;
	}
		
	public void printDados() {
		
		System.out.println("\nNome: "+name);
		System.out.println("CPF: "+cpf);
		System.out.println("Data de Nascimento: "+doBirth);
		System.out.println("\nEndereço: ");
		address.printEndereco();
		
	}
}
