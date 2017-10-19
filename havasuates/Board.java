package havasuates;

public class Board {
	private Kare [] [] tahta;

	public Kare[][] getTahta() {
		return tahta;
	}

	public void setTahta(Kare[][] tahta) {
		this.tahta = tahta;
	}

	public Board() {
		tahta=new Kare [8][8];
		for (int i=0;i<8;i++)
		{
			for (int j=0;j<8;j++)
			{
				
				tahta[i][j]=new Kare(i,j);
			}
			
		}//fori
		
	}//construct
   public void print()
   {   
	  
	   for (int i=0;i<8;i++)
		{
		   System.out.print(i+"|");
			for (int j=0;j<8;j++)
			{
				
			 System.out.print(tahta[i][j].toString()+"|");
			}
			System.out.println("");
		}//fori  
	   System.out.println("!!!!!!!!!!!!!");
   }//print
}//class
