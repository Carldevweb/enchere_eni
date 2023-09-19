package fr.eni.projetenchereeni.bo;

import java.io.Serializable;

public class Retrait implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int numArticle;
	private String rue;
	private String codePostal;
	private String ville;
		
	public void setNumArticle(int numArticle) {
		this.numArticle = numArticle;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	

	public int getNumArticle() {
		return numArticle;
	}
	

	public Retrait() {
		super();
	}
	
	public Retrait(int numArticle, String rue, String codePostal, String ville) {
		super();
		this.numArticle = numArticle;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	
	@Override
	public String toString() {
		return "Retrait [numArticle=" + numArticle + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville
				+ "]";
	}
	
}
