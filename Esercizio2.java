import java.util.*;

class CmpPrezzoDecrescente implements Comparator<Prodotto>{
    public int compare(Prodotto p1, Prodotto p2){
        if(p1.getPrezzo() == p2.getPrezzo()) {
	    return p1.getNome().compareTo(p2.getNome());
	}
	else{
	    if((p1.getPrezzo()-p2.getPrezzo())<0)
		return 1;
	    else
		return -1;

	}
	    
    }

}

public class  Esercizio2 {

    public static void main(String[] args)  {
	Carrello mioCarrello = new Carrello();
        // Aggiungere a mioCarrello  i seguenti prodotti (per ciascun prodotto va fatta una chiamata al metodo add(Prodotto)):
	mioCarrello.add(new Prodotto("pasta",  2.40,  3));
        mioCarrello.add(new ProdottoScontatoPerc("olio",  3.50,  10, 20));
        mioCarrello.add(new ProdottoScontato3x2("burro",  2.50,  6));
        mioCarrello.add(new ProdottoScontato3x2("tonno",  3.50,  9));
	mioCarrello.add(new Prodotto("pasta",  2.40,  1));
        mioCarrello.add(new ProdottoScontatoPerc("farina",  2,  5, 15));
	mioCarrello.add(new Prodotto("riso",  2.50,  8));
        mioCarrello.add(new ProdottoScontato3x2("burro",  2.50,  5));
	mioCarrello.add(new Prodotto("pasta",  1.50,  3));
        mioCarrello.add(new ProdottoScontato3x2("aceto",  1.20,  10));
	mioCarrello.add(new Prodotto("pasta",  1.50,  4));
	mioCarrello.ordina();
	System.out.println("==== CARRELLO ORDINATO =====");
	System.out.println(mioCarrello);
	mioCarrello.ordina(new CmpPrezzoDecrescente());
        System.out.println("==== CARRELLO ORDINATO PER PREZZO UNITARIO =====");
	System.out.println(mioCarrello);

	
    }//end main
}