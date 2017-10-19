  package havasuates;

public class Tas {
private	String symbol="T";
private	String color;
private Kare origin;
private  Board iamon;
public Tas(String color, Board iamon) {
	origin=null;
	this.color = color;
	this.iamon = iamon;
	if (color.equals("b"))
	{
	symbol="B"+symbol;	
	}else
	{
		symbol="W"+symbol;
	}
}
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	if (color.equals("b"))
	{
	this.symbol="B"+symbol;	
	}else
	{
		this.symbol="W"+symbol;
	}
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Kare getOrigin() {
	return origin;
}
public void setOrigin(Kare origin) {
	this.origin = origin;
}
public Board getIamon() {
	return iamon;
}
public void setIamon(Board iamon) {
	this.iamon = iamon;
}
public void move(Coordinate target) {
	// TODO Auto-generated method stub
//vheck target
	if (iamon.getTahta()[target.getCoordinatex()][target.getCoordinatey()].getPiece()==null)
	{
	 
	 	origin.setPiece(null);
	 
	 	iamon.getTahta()[target.getCoordinatex()][target.getCoordinatey()].setPiece(this);
	}
	
}

	

}
