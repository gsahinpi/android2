package havasuates;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Oyuncu {
	Board game;
  ArrayList<Tas> takim;
public Oyuncu(Board game) {
	
	this.game = game;
	takim =new ArrayList<Tas>();
	takim.add(new Tas("b",game));
	takim.add(new Tas("b",game));
	takim.add(new Tas("b",game));
	takim.add(new piyon("b", game));
	takim.add(new piyon("b", game));
	takim.add(new piyon("w", game));
	takim.add(new Kale("b", game));
	takim.add(new Kale("b", game));
	takim.add(new Beygir("b", game));
	takim.add(new Beygir("w", game));
}
public void initialise()
{
game.getTahta()[0][0].setPiece(takim.get(0));
game.getTahta()[1][1].setPiece(takim.get(1));
game.getTahta()[2][2].setPiece(takim.get(2));
game.getTahta()[2][3].setPiece(takim.get(3));
game.getTahta()[3][2].setPiece(takim.get(4));
game.getTahta()[4][1].setPiece(takim.get(5));
game.getTahta()[4][4].setPiece(takim.get(6));
game.getTahta()[5][5].setPiece(takim.get(7));
game.getTahta()[5][6].setPiece(takim.get(8));	
game.getTahta()[4][5].setPiece(takim.get(9));	
}//initialise
public void print()
{
	game.print();
}//print
public void movetas()
{
	int c1,c2,c3,c4;
while (true)
{
String in1=JOptionPane.showInputDialog("Enter 1st indice or q to quit") ;	
if (in1.equals("q"))
{
	break;
}else
{
c1=Integer.parseInt(in1);	
}//else
String in2=JOptionPane.showInputDialog("Enter 2nd indice or q to quit") ;	
if (in2.equals("q"))
{
	break;
}else
{
c2=Integer.parseInt(in2);	
}//else
String in3=JOptionPane.showInputDialog("Enter 3rd indice or q to quit") ;	
if (in3.equals("q"))
{
	break;
}else
{
c3=Integer.parseInt(in3);	
}//else

String in4=JOptionPane.showInputDialog("Enter 4th indice or q to quit") ;	
if (in4.equals("q"))
{
	break;
}else
{
c4=Integer.parseInt(in4);	
}//else

//Coordinate orig=new Coordinate (c1, c2);
Coordinate target=new Coordinate (c3, c4);
game.getTahta()[c1][c2].getPiece().move(target);
print();

}//

	
}//movetas
  

}
