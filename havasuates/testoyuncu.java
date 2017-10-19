package havasuates;

public class testoyuncu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board brd=new Board();
	
		Oyuncu o=new Oyuncu(brd);
		o.print();
System.out.println("-----------------");
     o.initialise();
     o.print();
     System.out.println("-----------------");
     o.movetas();
     
     
	}//

}
