package evaluation;

public class Client {
 private static int comp;
 private int id;
 private String nom;
 private String prenom;
 public Client( String nom, String prenom) {
	super();
	this.id = ++comp;
	this.nom = nom;
	this.prenom = prenom;
 }
 
 public int getId() {
	return id;
}

 public String getNom() {
	return nom;
 }

 public String getPrenom() {
	return prenom;
 }

 @Override
 public String toString() {
	return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
 }
 
}
