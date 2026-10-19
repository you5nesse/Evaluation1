package evaluation;

public class Location {
   private int nbJours;
   Client client;
   Vehicule vehicule;
   public Location(int nbJours, Client client, Vehicule vehicule) {
	this.nbJours = nbJours;
	this.client = client;
	this.vehicule = vehicule;
   }
  
   public double calculerMontant() {
	return vehicule.calculerCout(nbJours);
   }
   public void  afficherRecapitulatif() {
	   System.out.println("----Infos de location : ----");
	   System.out.println("client : "+client.getNom()+" "+ client.getPrenom());
	   
	   vehicule.afficherDetails();
	   System.out.println("la durée : "+nbJours+" jours");
	   System.out.println("le montant   : "+calculerMontant() +"DH");
   }
}
