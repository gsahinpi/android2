package havasuates;

public class Kare {
	private Tas piece;
	private Coordinate kordinat;
	public Kare( Coordinate kordinat) {
		this.kordinat = kordinat;
		piece=null;
	}
	
	public Kare(int i, int j) {
		
		kordinat=new Coordinate(i, j);
		this.piece = piece;
		this.kordinat = kordinat;
	}

	public Tas getPiece() {
		return piece;
	}
	public void setPiece(Tas piece) {
		this.piece = piece;
		if (piece!=null)
		{
		piece.setOrigin(this);
		}
	}
	public Coordinate getKordinat() {
		return kordinat;
	}
	public void setKordinat(Coordinate kordinat) {
		this.kordinat = kordinat;
	}
	public String toString()
	{
	 String symbol="  ";
	 if (piece !=null)
	 {
		 symbol=piece.getSymbol();
	 }
	 return symbol;
		
	}

}
