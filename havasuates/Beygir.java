package havasuates;

public class Beygir extends Tas {

	public Beygir(String color, Board iamon) {
		super(color, iamon);
		setSymbol("H");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void move(Coordinate target) {
		Coordinate mekan= getOrigin().getKordinat();	
		int farkx=target.getCoordinatex()-mekan.getCoordinatex();
		int farky=target.getCoordinatey()-mekan.getCoordinatey();
		int x=target.getCoordinatex();
		int y=target.getCoordinatey();
		Tas hedef=getIamon().getTahta()[x][y].getPiece();
		if (hedef ==null)
		{
			
		if ( (Math.abs(farkx)==2 && Math.abs(farky)==1) || (Math.abs(farkx)==1 && Math.abs(farky)==2))
		{
			
			super.move(target);
			
		}//if beygirce
		}//target boş
		else
		{

			if ( hedef.getColor()!=getColor())
			{
				getOrigin().setPiece(null);
				 hedef.setOrigin(null);
				 
				 	getIamon().getTahta()[target.getCoordinatex()][target.getCoordinatey()].setPiece(this);
			}
			
		}
		
		
	}//move

}
