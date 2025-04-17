package model;

public class Table extends EntiteReservable<FormulaireRestaurant> {
	private int nbChaises;
	
	public Table (int nbChaises) {
		this.nbChaises = nbChaises;
	}
	
	@Override
	public boolean compatible(FormulaireRestaurant formulaire) {
		
		if (!super.estLibre(formulaire) || (formulaire.getNombrePersonnes() != nbChaises
				&& formulaire.getNombrePersonnes() != nbChaises)) {
			return false;
		}
		
		return true;
		
	}
	
	@Override
	public ReservationRestaurant reserver(FormulaireRestaurant formulaire) {
		if (!compatible(formulaire)) {
			return null;
		}
		
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		int numService = formulaire.getNumService();
		int numero = super.getNumero();
		
		return new ReservationRestaurant(jour,mois,numService,numero);
		
	}
}
