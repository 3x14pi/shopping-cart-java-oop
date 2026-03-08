import java.util.*;

public class  Esercizio1 {

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
	System.out.println(mioCarrello);
	System.out.println("==== TOTALE: " +  mioCarrello.totale() );
	System.out.println("==== TOTALE LORDO: " +  mioCarrello.totaleLordo() );
	System.out.println("==== PRODOTTI NON SCONTATI ==== ");
	// Stampare i prodotti non scontati (usare metodo prodottiNonScontati() )
	List<Prodotto> listNonScontati = mioCarrello.prodottiNonScontati();
	for(Prodotto pns: listNonScontati){
	    System.out.println(pns);
	}
	System.out.println("==== PRODOTTI SCONTATI ==== ");
        // Stampare i prodotti  scontati (usare metodo prodottiScontati() )
        List<Prodotto> listScontati = mioCarrello.prodottiScontati();
	for(Prodotto ps: listScontati){
	    System.out.println(ps);
	}
	
    }//end main

} // end class
