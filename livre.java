package ex3;

class livre {
	private String titre, auteur;
	private float nbPages;
	
	public livre (String auteur, String titre) {
		this.auteur = auteur;
		this.titre = titre;
	}
	
	public livre() {
		// TODO Auto-generated constructor stub
	}

	public String getAuteur() {
		return this.auteur;
	}
	public String getTitre() {
		return this.titre;
	}
	public float getnbPages() {
		return this.nbPages;
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
		return("Livre intitulé " + this.titre + " de " + this.auteur + " contenant " + this.nbPages + " pages.");  
	}
	public void decrire() {
		System.out.println(toString());
	}
	
}
