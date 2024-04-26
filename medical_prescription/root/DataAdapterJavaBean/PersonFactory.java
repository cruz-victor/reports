import java.util.Collection;
import java.util.Vector;

public class PersonFactory{
	PersonFactory(){		
	}
	
	public static Collection<Peson> getDataSource() {
		Vector<Person> collection=new Vector<>();
		collection.add(new Person("Victor","Cruz"));
		collection.add(new Person("Grace","Illanes"));
		
		return collection;
	}
}