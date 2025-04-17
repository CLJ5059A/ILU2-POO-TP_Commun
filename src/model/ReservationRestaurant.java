package model;

public class ReservationRestaurant extends Reservation {
	private String service;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numServ, int numTable) {
		super(jour,mois);
		if (numServ == 1) {
			this.service = "premier";
		} else {
			this.service = "deuxième";
		}
		this.numTable = numTable;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Table " + numTable + " pour le " + service + " service.";
	}
	
}
