package JavaProgramsUpdates;

 class ABC {
    public void show()
    {
    System.out.println("Hello");    
    }
}

class sandesh4 extends ABC
{
public void display() 
{
System.out.println("bye");
}
}

public class Runner{

	public static void main(String[] args) {
		sandesh4 obj = new sandesh4();

		obj.show();
		obj.display();
		}  


	}

