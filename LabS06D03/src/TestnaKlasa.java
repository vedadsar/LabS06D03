
public class TestnaKlasa {
public static void main(String[] args) {
	Tacka nula = new Tacka();
	Tacka copy = new Tacka(15,3);
	
	
	Krug nekiKrug = new Krug(nula, 25);
	Krug drugiKrug = new Krug(copy,11);
	
	System.out.println(nekiKrug.seSijeku(drugiKrug));
	
 }
}
