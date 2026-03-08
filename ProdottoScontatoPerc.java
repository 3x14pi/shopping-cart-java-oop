public class ProdottoScontatoPerc extends Prodotto {

    //CAMPI
    private int sconto;

    //COSTRUTTORI
    public ProdottoScontatoPerc(String nome, double prezzo, int quantita, int sconto) {
	super(nome, prezzo, quantita);
        if(sconto < 0 || sconto > 100)
	    throw new ScontoException("Sconto non valido.");
	else
            this.sconto = sconto;
       
    }

    public ProdottoScontatoPerc(String nome, double prezzo, int sconto){
	this(nome, prezzo, 1, sconto);
    }

    //METODI

    public double costo() {
	return super.costo() * (100-sconto) / 100;
    }

@Override
    public String toString() {
    return super.toString() + " *** SCONTO " + this.sconto +  "% ***";
    }

}