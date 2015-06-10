package stablo.bst;

public class Stablo {

	public Cvor koren;


	public String pretrazi(int kljuc, Cvor koren){
		if(koren == null) {
			return null;
		}
		
		if(koren.kljuc>kljuc){
			return pretrazi(kljuc, koren.levo);
		}
		if(koren.kljuc<kljuc){
			return pretrazi(kljuc,koren.desno);
		}
		else {
			return koren.vrednost;
		}
	}
}
