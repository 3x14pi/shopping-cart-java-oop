import java.util.*;

public class Carrello {
    //CAMPI
    private List<Prodotto> prodotti;

    //COSTRUTTORI
    /** Costruisce un carrello vuoto */
    public Carrello() {
	this.prodotti = new ArrayList<Prodotto>();
    }

    //METODI
    /**Se questo carrello contiene gia' un prodotto p1 avente lo stesso nome e lo stesso prezzo del prodotto p,
  aggiunge a p1 la quantita' definita da p; altrimenti aggiunge al carrello il prodotto p. */
    public void add(Prodotto p) {
	if(!this.prodotti.contains(p))
	   this.prodotti.add(p);
        else{
      	for(Prodotto s: this.prodotti)
	    if (s.equals(p))
	        s.aumentaQuantita(p.getQuantita());
	   }
    }
    /** Calcola il costo totale dei prodotti in questo carrello (tenendo conto degli sconti).*/
    public double totale() {
        double totale = 0;
        for(Prodotto s: this.prodotti)
		totale += s.costo();
        return totale;
    }
    /**Calcola il costo lordo totale dei prodotti in questo carrello, ossia il costo originario dei prodotti
       senza tener conto degli sconti.*/
    public double totaleLordo() {
        double totale = 0;
        for(Prodotto s: this.prodotti)
	    totale += (s.getPrezzo()*s.getQuantita());
        return totale;
    }
    /** Restituisce la *lista*  dei prodotti scontati in questo carrello.*/
    public List<Prodotto> prodottiScontati(){
	List<Prodotto> lista = new ArrayList<Prodotto>();
	for(Prodotto s: this.prodotti)
	    if(s instanceof ProdottoScontatoPerc || s instanceof ProdottoScontato3x2)
		lista.add(s);
	return lista;
    }
 /** Restituisce la *lista*  dei prodotti non scontati in questo carrello.*/
    public List<Prodotto> prodottiNonScontati(){
	List<Prodotto> lista = new ArrayList<Prodotto>();
	for(Prodotto s: this.prodotti)
	    if(!(s instanceof ProdottoScontatoPerc) && !(s instanceof ProdottoScontato3x2))
		lista.add(s);
	return lista;
    }

    @Override 
    public String toString() {
	String s = "";
        for(Prodotto p: this.prodotti)
	    s += p.toString() + "\n";
	return s;
    }

    public void ordina() {
	Collections.sort(this.prodotti);
    }

    public void ordina(Comparator<Prodotto> cmp) {
	Collections.sort(this.prodotti, cmp);
    }





}