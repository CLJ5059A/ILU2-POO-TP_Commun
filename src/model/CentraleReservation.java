package model;

public class CentraleReservation<E extends EntiteReservable,F extends Formulaire> {
	private E[] entites;
	private int nbEntites = 0;
	
	public CentraleReservation(E[] entites) {
		this.entites = entites;
	}
	
	public void ajouterEntite(E newEntite) {
		
	}
}
