package Practice;

abstract class test
{
	abstract void show();
}

class test1 extends test
{
	void show()
	{
		System.out.println("This is abstract method");
	}
}

public class abstractclass {

	public static void main(String[] args) {
		
		test1 obj=new test1();
		obj.show();

	}

}
