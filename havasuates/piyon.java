  package havasuates;

import javax.swing.JOptionPane;

public class piyon extends Tas{

	public piyon(String color, Board iamon) {
		super(color, iamon);
	setSymbol("P");
	}//constructor
@Override
public void move(Coordinate target) {
	// TODO Auto-generated method stub
Coordinate mekan= getOrigin().getKordinat();	
int farkx=target.getCoordinatex()-mekan.getCoordinatex();
int farky=target.getCoordinatey()-mekan.getCoordinatey();
Boolean canAttack=false;
int x=target.getCoordinatex();
int y=target.getCoordinatey();
Tas hedef=getIamon().getTahta()[x][y].getPiece();
//hedef kare boş ise 
if (hedef==null)
{


if (farkx==1 && farky==0)
{
	super.move(target);
}
else 
{
	JOptionPane.showInputDialog("GErizekalııı o öyle mi oynuyor de git!");
}
}//if null
else//hedef kare dolu
{
	if ( hedef.getColor()!=getColor())//karede ki taşın rengi karşı takımın rengiysye
	{
		//System.err.println("farky= "+farky+" farkx="+farkx+" "+hedef.getColor()+ " "+ getColor());
	 if (Math.abs(farky)==1 && farkx==1)//capraz mı
	 {//daşı ye
		 getOrigin().setPiece(null);
		 hedef.setOrigin(null);
		 
		 	getIamon().getTahta()[target.getCoordinatex()][target.getCoordinatey()].setPiece(this);
		
	 }else
	 {
		 JOptionPane.showMessageDialog(null,"her kusun eti yenmez"); }
		
	}//color
}//null else
}//move

}//
