package evaluation;

public class Main {
public static void main(String[] args) {
	Client c1 = new Client("ait mhand", "younesse");
	Client c2 = new Client("alami", "hamza");
	Vehicule v1 = new Voiture("12345-A", "dacia", 300, 5);
	Vehicule v2 = new Voiture("2034-D", "mercides", 400, 7);
	Vehicule m1 = new Moto("3426-B", "yamaha", 150, 125);
    Vehicule[] vehicules  = new Vehicule [3];
    vehicules[0]= v1;
    vehicules[1]= v2;
    vehicules[2]= m1;
	for(Vehicule v : vehicules) {
		System.out.println("----Infos de vehicule   :---- ");
		v.afficherDetails();
		
	}
	Location locations []= new Location[3];
	Location l1 = new Location(6, c2, m1);
	Location l2 = new Location(3, c2, v1);
	Location l3 = new Location(2, c1, v2);
	locations[0]=l1;
	locations[1]=l2;
	locations[2]=l3;
	double totale = 0.0;
	for(Location l : locations) {
		
		l.afficherRecapitulatif();
		totale += l.calculerMontant();
		
	}
	
	System.out.println("montant total de toutes les locations = "+totale+"DH");
}
}
