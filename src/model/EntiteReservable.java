package model;

public abstract class EntiteReservable<F extends Formulaire> {
	private int numero;
	private CalendrierAnnuel calendrierPerso = new CalendrierAnnuel();
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(F formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrierPerso.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);
}
