package dao;
import java.sql.Timestamp;
import java.util.List;

public interface TwitterDataDao {
	
	public List<TwitterWordData> GetOccurances(TwitterWordQuery word);
	
	public List<SystemDiag> GetSystemHealth();
	
	public List<TwitterTime> GetTimeRange();
}
