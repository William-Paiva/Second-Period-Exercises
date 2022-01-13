package exercise12;

public class StudantsAddress {
	
	String street;
	String district;
	String city;
	String state;
	int number;

public StudantsAddress(String street,int number, String district, String city, String state) {
	
	this.street = street;
	this.district = district;
	this.city = city;
	this.state = state;
	this.number = number;
	}

public void printEndereco() {
	
	System.out.println("\tRua: "+street);
	System.out.println("\tNúmero: "+number);
	System.out.println("\tBairro: "+district);
	System.out.println("\tCidade: "+city);
	System.out.println("\tEstado: "+state);
	System.out.println(" ");
	
}
}
