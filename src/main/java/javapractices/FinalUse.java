package javapractices;

public /*final */ class FinalUse {                //if class is final we cannot create child class or inherit
	
 public final String PAN;
	{
	 PAN= "SAN4856845";                          //we can declare final variable where it initialise or in final block{}
	}
	static final long accnum;
	
	static
	{
		accnum= 2689754856845l;                          //we can declare static variable where it initialise or in static block using static {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public final void testfinalmethod(){
		System.out.println("final method");

	}

}
class childfinal extends FinalUse{
	
	public final void testfinalmethod(int a) {                                  //cannot override final method we can overload
		
	
}
}
