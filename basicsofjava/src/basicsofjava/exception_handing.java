package basicsofjava;

public class exception_handing {

	public static void main(String[] args) {
		try
		{
		int a=0;
		int b=5;
		int c=b/a;
		System.out.print("hello");
		}
		catch(ArithmeticException e)
		{
			System.out.print("world");
		}

	}

}
