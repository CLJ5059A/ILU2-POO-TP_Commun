package model;

public class Chambre extends EntiteReservable<FormulaireHotel> {
	private int nbLitSimples;
	private int nbLitDoubles;
	
	public Chambre(int nbLitSimples, int nbLitDoubles) {
		this.nbLitDoubles = nbLitDoubles;
		this.nbLitSimples = nbLitSimples;
	}
	
	@Override
	public boolean compatible(FormulaireHotel formulaire) {
		
		return super.estLibre(formulaire) && !(formulaire.getNbLitDouble() != nbLitDoubles
				&& formulaire.getNbLitDouble() != (nbLitDoubles - 1))
				|| (formulaire.getNbLitSimple() != nbLitSimples
				&& formulaire.getNbLitSimple() != (nbLitSimples -1));
	}
	
	@Override
	public ReservationHotel reserver(FormulaireHotel formulaire) {
		//TODO
		return new ReservationHotel(0,0,0,0,0);
	}
}
