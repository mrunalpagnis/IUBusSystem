import com.mongodb.DB;
import com.mongodb.DBCollection;


public class TestConnection {

	public static void main(String[] args) {
		try {
			DB db = DatabaseManager.getConnection();
			DBCollection intervaldata = db.getCollection("intervaldata");
			int count = intervaldata.find().count();
			System.out.println(count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
