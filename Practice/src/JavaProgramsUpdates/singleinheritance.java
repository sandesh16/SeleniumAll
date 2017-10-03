package JavaProgramsUpdates;

class sandesh12
{
	void show()
	{
		System.out.println("Hello");
	}
}

class priya extends sandesh12
{
	void display()
	{
		System.out.println("Bye");
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		priya obj =new priya();
		
		obj.show();
		obj.display();

	}

}
