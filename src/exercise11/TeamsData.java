package exercise11;

public class TeamsData {
	
	String name;
	int points;
	int goals;
	int nPlays;
	
	public TeamsData(String name, int points, int goals, int nPlays) {
		
		this.name = name;
		this.points = points;
		this.goals = goals;
		this.nPlays = nPlays;
		
	}
	
	public void printD() {
		
		System.out.println("Time:   "+name+"\n");
		System.out.println("\tPontua��o: "+points);
		System.out.println("\tSaldo de gols: "+goals);
		System.out.println("\tN�mero de jogos: "+nPlays+"\n");
		
	}
}
