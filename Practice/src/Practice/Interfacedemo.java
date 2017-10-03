package Practice;

interface abc
{
	void show();
}

class pqr implements abc
{
	public void show()
	{
		System.out.println("This is interface example");
	}
}
public class Interfacedemo {

	public static void main(String[] args) {
		
		pqr obj=new pqr();
		obj.show();

	}

}
