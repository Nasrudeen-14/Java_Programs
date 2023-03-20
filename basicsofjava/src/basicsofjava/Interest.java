package basicsofjava;

public class Interest {
	
	public static void main(String[]args) 
	{
		double principal;
		double rate;
		double interest;
		principal=17000;
		rate=0.07;
		interest= principal*rate;
		principal= principal+interest;
		System.out.println("The Intrest earned is $");
		System.out.println(interest);
		System.out.println("the value of investment after one year is $");
		System.out.println(principal);
	}
	
}


