package Lesson1Mine;

public class TeamTest {
	public static void main(String[] args) 
	{
			ITeamDao teamDao = new TeamDao();
			int teamId = teamDao.insert("Galatasaray");
			
			Team team = teamDao.find(teamId);
			System.out.println(team);
	}
}
