import java.text.DecimalFormat;

public class Prodotto implements Comparable<Prodotto> {

    //CAMPI
    private String nome;
    private double prezzo;
    private int quantita;

    //COSTRUTTORI
    public Prodotto(String nome, double prezzo, int quantita) {
	if(prezzo < 0) 
	    throw new PrezzoException("Prezzo negativo, non valido.");
	else if(quantita < 0)
	    throw new QuantitaException("Quantita negativa, non valida.");
	else {
        	this.nome = nome;
        	this.prezzo = prezzo;
	        this.quantita = quantita;
	}
    }
    public Prodotto(String nome, double prezzo) {
	this(nome, prezzo, 1);
    }

    //METODI
    public double costo() {
	return this.prezzo * this.quantita;
    }

    public String getNome(){
	return this.nome;
    }

    public double getPrezzo(){
	return this.prezzo;
    }

    public int getQuantita() {
	return this.quantita;
    }

    public boolean equals(Prodotto p) {
	return this.nome.equals(p.nome) && (this.prezzo == p.prezzo);
    }

    @Override
    public boolean equals(Object o) {
	return o instanceof Prodotto && this.equals((Prodotto) o);
    }

    public void  aumentaQuantita(int q){
	this.quantita += q;
    }

@Override 
    public String toString(){
    DecimalFormat df = new DecimalFormat("0.00");
    return this.nome + "- PREZZO UNITARIO: " + this.prezzo + " - QUANTITA': " + this.quantita + " - COSTO: " + df.format(this.costo());
    }


    public int compareTo(Prodotto p) {
	if(this.nome.equals(p.nome)){
	    if((this.prezzo-p.prezzo)>0)
		return 1;
	    else
		return -1;
	}
	else
	    return this.nome.compareTo(p.nome);
    }



}