package JavaProgramsUpdates;

public class ParameterizeConstructor {
	
	int id;
	String name;
	
	public   ParameterizeConstructor (int i, String n)
	{
		id=i;
		name=n;
	}
	
	public void display()
	{
		System.out.println(id+ " " +name);
		
	}
	

	public static void main(String[] args) {
		ParameterizeConstructor obj=new ParameterizeConstructor(1, "himanshu");
		obj.display();

	}

}
