import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;



/**
 * @author mrunal
 * First run mongod.exe
 */
public class DatabaseManager {

	private static DB db;
	
	private DatabaseManager() throws UnknownHostException{
		//if called through reflection need to check db is null
		if(db == null){
			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			db = mongoClient.getDB( "db" );
		}
	}
	
	public static DB getConnection() throws Exception {
		//create object only if not created earlier
		if(db==null)
			new DatabaseManager();
		return db;
	
	}
		
}
