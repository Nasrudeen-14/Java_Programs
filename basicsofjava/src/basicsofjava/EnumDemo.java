package basicsofjava;

public class EnumDemo {
	enum Day {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
	enum Month{ JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}
	public static void main(String[] args) {
		Day tgif;
		Month libra;
		
		tgif=Day.FRIDAY;
		libra=Month.OCT;
		
		System.out.println("My sign is libra since I was born in");
		System.out.println(libra);
		
		System.out.println("That's the ");
		System.out.println(libra.ordinal()+"-th month of the year.");
		System.out.println("Counting from the zero of course!");
		System.out.println("Is'nt it nice to get to ");
		System.out.println(tgif);
		System.out.println(tgif+" is the "+tgif.ordinal()+"-th day of the week.");
		

	}

}
