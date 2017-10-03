package Practice;

class class12
{
	void show()
	{
		System.out.println("Hello");
	}
}

class class2 extends class12
{
	void display()
	{
		System.out.println("Bye");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		class2 obj=new class2();
		obj.show();
		obj.display();

	}

}
