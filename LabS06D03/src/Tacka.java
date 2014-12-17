public class Tacka {
	private int xKoordinata;
	private int yKoordinate;

	public Tacka() {
		this.xKoordinata = 0;
		this.yKoordinate = 0;
	}

	public Tacka(int xKoordinata, int yKoordinata) {
		this.xKoordinata = xKoordinata;
		this.yKoordinate = yKoordinata;
	}
	
	public Tacka(Tacka other){
		this.xKoordinata=other.xKoordinata;
		this.yKoordinate=other.yKoordinate;
	}

	public boolean equals(Tacka other) {
		if(this.xKoordinata==other.xKoordinata && this.yKoordinate == other.yKoordinate)
			return true;
		return false;		
	}

	public String toString(){
		String out = "";
		out += "(" +xKoordinata +"," +yKoordinate +")";
		return out;
	}
	

	public double range(Tacka other){
		
		double range = Math.sqrt(Math.pow((other.xKoordinata - this.xKoordinata), 2) + Math.pow((other.yKoordinate - this.yKoordinate), 2));
		return range;
	}
}
