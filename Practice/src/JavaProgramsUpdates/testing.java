package JavaProgramsUpdates;

//inheritance 
class a1
{
public void show()
	{
		System.out.println("hello");
	}
}

class a2 extends a1
{
public	void display()
	{
		System.out.println("bye");
	}
}

public class testing {

	public static void main(String[] args) {
		
		a2 obj=new a2();
obj.show();
obj.display();

	}

}
