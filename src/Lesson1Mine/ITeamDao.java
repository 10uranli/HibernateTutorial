package Lesson1Mine;

public interface ITeamDao {
	public int insert(String name);

	public void update(int teamId, String teamName);

	public void delete(int teamId);
	
	public Team find(int teamId);
	

}
