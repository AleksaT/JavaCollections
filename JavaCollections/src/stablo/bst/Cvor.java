package stablo.bst;

public class Cvor {
 
	int kljuc;

	String vrednost;
	
	Cvor desno;
	
	Cvor levo;
	
public Cvor(int kljuc, String vrednost, Cvor desno, Cvor levo){
	this.kljuc = kljuc;
	this.vrednost = vrednost;
	this.desno = desno;
	this.levo = levo;
}

}
