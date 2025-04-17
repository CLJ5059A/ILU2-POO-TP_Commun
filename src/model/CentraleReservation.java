package model;

public class CentraleReservation<P extends Formulaire> {
	private EntiteReservable<P>[] entitesReservables;
	private int nbEntitesReservables;
	
	public CentraleReservation(EntiteReservable<P>[] entitesReservables) {
		this.entitesReservables = entitesReservables;
		this.nbEntitesReservables = entitesReservables.length;
	}
	
	public void ajouterEntite(EntiteReservable<P> newEntite) {
		
	}
}
