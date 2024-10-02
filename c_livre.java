package ex4;

public class c_livre {
	private String titre, auteur;
	private double prix=0;
	private double tva = 0.18;
	private boolean verif = false;
	private float nbPages;
	
	public c_livre (String auteur, String titre,double prix) {
		this.auteur = auteur;
		this.titre = titre;
		this.prix=prix;
	}
	
	public c_livre() {
		// TODO Auto-generated constructor stub
	}

	public String getAuteur() {
		return this.auteur;
	}
	public String getTitre() {
		return this.titre;
	}
	public double getprix() {
		return (this.prix*tva)+this.prix;
	}
	public float getnbPages() {
		return this.nbPages;
	}
	public void setprix(int prix) {
		if(this.verif == false) {
			this.prix = prix;
			verif = true;
		}
	}
	public void setNbPages (int nb) {
		if(nb>20)
			this.nbPages = nb;
		else
			System.out.println("le nombre indiqué est faible.");
	}
	public void setauteur (String aut) {
		this.auteur = aut;
	}
	public void settitre (String tit) {
		this.titre = tit;
	}
	public String toString() {
		return("Livre intitulé " + this.titre + " de " + this.auteur + " contenant " + this.nbPages + " pages avec prix : "+this.prix);  
	}
	public void decrire() {
		System.out.println(toString());
	}
	
	public boolean testPrix() {
		return(this.prix >0);
	}	
	
	
	
	
}
