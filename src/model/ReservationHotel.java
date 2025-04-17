package model;

public class ReservationHotel extends Reservation {
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple,
			int nbLitDouble, int numChambre) {
		super(jour, mois);
		this.nbLitDouble = nbLitDouble;
		this.nbLitSimple = nbLitSimple;
		this.numChambre = numChambre;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Chambre n°" + numChambre + " avec " + nbLitSimple + " lits simples et " + nbLitDouble + " lits doubles.";
	}
}
