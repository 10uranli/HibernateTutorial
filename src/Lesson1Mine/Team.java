package Lesson1Mine;

public class Team {
	public Team() {
	}
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
	private int teamId;
	private String teamName;	

	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: " + this.teamName + " id : " + this.teamId;
	}
	
	

}
