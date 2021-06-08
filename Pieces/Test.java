public class Test { 
	
	public static void main (String[] args)
	{
		
		
		Case c1, c2;
		
		c1 = new Case(false, 3, 3);
		c2 = new Case(false, 1, 1);

		
		System.out.println("\n");

		//Reine r1;
		
		//r1 = new Reine (true, c2);
		
		


		Reine r1;
		r1 = new Reine(false, c1);

		System.out.println(r1.deplacementValid(c2));
		
		
		System.out.println("\n" + "fin test classe Case" + "\n");
		
	}
	
	
}
