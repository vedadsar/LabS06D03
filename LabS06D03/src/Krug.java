public class Krug {
	private Tacka centar;
	private double radijus;

	public Krug(Tacka tacka, int radijus) {
		this.centar=new Tacka(tacka);
		this.radijus = radijus;
	}
	
	public Krug(Krug copy){
		this.radijus=copy.radijus;
		this.centar=new Tacka(copy.centar);
	}

	public String toString() {
		String out = "Koordinate tacke su: " + centar.toString()
				+ " a radijus: " + radijus;
		return out;
	}
	public boolean equals(Krug other){
		if(this.centar.equals(other) && this.radijus == other.radijus)
			return true;
		return false;
	}
	
	public int  isInside(Tacka other){
		if(radijus > centar.range(other))
			return 1;
		else if(radijus<centar.range(other))
            return -1;
		else
			return 0;
	}

	public int seSijeku(Krug other){
		
		if(this.centar.range(other.centar) > (this.radijus+other.radijus))
			return -1;
		else if(this.centar.range(other.centar) < (this.radijus+other.radijus))
			return 1;
		else
			return 0;
	}
}
