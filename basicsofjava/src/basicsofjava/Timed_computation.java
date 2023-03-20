package basicsofjava;

public class Timed_computation {

	public static void main(String[] args) {
		long startTime;
		long endTime;
		double time;
		System.out.println(" ");
		startTime= System.currentTimeMillis();
		double width,height,hypotenuse;
		width=42.0;
		height=17.0;
		hypotenuse=Math.sqrt(width*width+height*height);
		System.out.println("A triangle with sides 42 and 17 has a hypotenuse of");
		System.out.println(hypotenuse);
		System.out.println("\nMathematically, sin(x)*sin(x)+cos(x)*cos(x)-1 should be 0.");
		System.out.println("Let's check this for x=1:" );
		System.out.println("sin(1)*sin(1)+cos(1)*cos(1)-1 is");
		System.out.println(Math.sin(1)*Math.sin(1)+Math.cos(1)*Math.cos(1)-1);
		System.out.println("there can be round off errors when"+"computing with real numbers!");
		System.out.println("here is a random number :");
		System.out.println(Math.random());
		endTime=System.currentTimeMillis();
		time=(endTime-startTime)/1000.0;
		System.out.println("\nRun time in seconds was:");
		System.out.println();
		

	}

}
