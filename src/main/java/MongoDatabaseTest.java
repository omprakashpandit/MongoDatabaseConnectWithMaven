import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDatabaseTest {

	public static void main(String[] args) {
	 MongoClient mclient = new MongoClient("localhost", 27017);
	//	MongoClientURI uri = new MongoClientURI("mongodb+srv://omprakash:1234@cluster0.z5oxtrc.mongodb.net/zap?retryWrites=true&w=majority&appName=Cluster0");
	//	MongoClient mclient = new MongoClient(uri);
		MongoDatabase db = mclient.getDatabase("populations");
		MongoCollection<Document> col = db.getCollection("cities");
		FindIterable<Document> doc = col.find();
		System.out.println("connection successfully.!");
		for (Document d : doc) {
        	System.out.println("Name: "+d.get("name")+" "+"Country: "+d.get("country"));
        	
		}
	}
}
