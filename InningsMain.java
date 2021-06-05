package Activity1;

import java.util.Scanner;

public class InningsMain {
	public static void main(String[] args) {
		Innings ing = new Innings();
		String teamname,inningsname;
		int runs;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the team name:");
		ing.setTeamname(teamname = sc.nextLine());
		System.out.println("Enter Session:");
		ing.setinningsname( inningsname = sc.nextLine());
		System.out.println("Enter the Runs:");
		ing.setruns( runs = sc.nextInt());
		System.out.println(ing.alldetails());
	}
}
