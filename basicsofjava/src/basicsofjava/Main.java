package basicsofjava;
class Base{
     public void show() {
		System.out.println("base show called");
	}
}
class Derived extends Base{
	public void show() {
		System.out.println("derived called");
	}
}
public class Main {

	public static void main(String[] args) {
		Base b=new Derived();
		b.show();	
	}
}
