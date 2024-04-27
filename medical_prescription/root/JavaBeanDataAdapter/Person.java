package root.JavaBeanDataAdapter;

public class Person{
	private String name;
	private String lastName;
	
	Person(){
		this.name="";
		this.lastName="";
	}
	
	Person(String name, String lastName){
		this.name=name;
		this.lastName=lastName;
	}
	
	public getName() {
		return this.name;
	}
	
	
	public getLastName() {
		return this.lastName;
	}
	
	public setName(String name) {
		this.name=name;
	}
	
	
	public setLastName(String lastName) {
		this.lastName=lastName;		
	}
}