package Activity1;
import java.util.*;

public class Innings {
	private String teamname,inningsname;
	private int runs;
	
	//teamname
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
			
	public String getTeamname() {
		return teamname;
	}
	
	//inningsname
	public void setinningsname(String inningsname) {
		this.inningsname = inningsname;
	}
				
	
	//runs
		public void setruns(int runs) {
			this.runs = runs;
		}
				
		public int getruns() {
			return runs;
		}
		
		public String alldetails() {
			int nr = runs+1 ;
	        return "Name:"+ getTeamname() + "\nScorred:"+ getruns() +"\nNeed "+ nr + " to win" ;                 
	    }
}
