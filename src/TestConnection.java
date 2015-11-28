import com.mongodb.DB;
import com.mongodb.DBCollection;


public class TestConnection {

	public static void main(String[] args) {
		try {
			DB db = DatabaseManager.getConnection();
			DBCollection intervaldata = db.getCollection("intervaldata");
			int count = intervaldata.find().count();
			System.out.println(count);
			// remove all other stops which are not major stops 
			// find unique bus numbers
			// for each bus number 
				// calculate time lapse from the next major stop
				// store diff in map
			// calculate deviation by comparing diff in map with planned schedule
			// calculate total deviation for each round trip and store
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
