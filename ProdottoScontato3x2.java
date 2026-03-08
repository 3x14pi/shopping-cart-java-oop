public class ProdottoScontato3x2 extends Prodotto {
    //CAMPI

    //COSTRUTTORI
    public ProdottoScontato3x2(String nome, double prezzo, int quantita) {
	super(nome, prezzo, quantita);
    }

    public ProdottoScontato3x2(String nome, double prezzo) {
	this(nome, prezzo, 1);
    } 

    //METODI
    public double costo() {
	int articoliNonScontati = super.getQuantita() % 3;
	double prezzoScontati = super.getPrezzo() *( (super.getQuantita()-articoliNonScontati) / 3 * 2);
	double prezzoNonScontati = articoliNonScontati * super.getPrezzo();
	return prezzoScontati + prezzoNonScontati; 

    }

@Override
    public String toString() {
    return super.toString() + " *** SCONTO 3x2 ***";
    }

}