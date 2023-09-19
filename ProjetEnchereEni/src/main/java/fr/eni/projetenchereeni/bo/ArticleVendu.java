package fr.eni.projetenchereeni.bo;

import java.io.Serializable;
import java.sql.Date;

public class ArticleVendu implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int numArticle;
	private String nomArticle;
	private String description;
	private Date dateDebutEnchere;
	private Date DateFinEnchere;
	private int prixInitial;
	private int prixVente;
	private int numUtilisateur;
	private int numCategorie;
	
	public int getNumArticle() {
		return numArticle;
	}
	
	public void setNumArticle(int numArticle) {
		this.numArticle = numArticle;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDebutEnchere() {
		return dateDebutEnchere;
	}
	public void setDateDebutEnchere(Date dateDebutEnchere) {
		this.dateDebutEnchere = dateDebutEnchere;
	}
	public Date getDateFinEnchere() {
		return DateFinEnchere;
	}
	public void setDateFinEnchere(Date dateFinEnchere) {
		DateFinEnchere = dateFinEnchere;
	}
	public int getPrixInitial() {
		return prixInitial;
	}
	public void setPrixInitial(int prixInitial) {
		this.prixInitial = prixInitial;
	}
	public int getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}
	public int getNumUtilisateur() {
		return numUtilisateur;
	}
	public void setNumUtilisateur(int numUtilisateur) {
		this.numUtilisateur = numUtilisateur;
	}
	public int getNumCategorie() {
		return numCategorie;
	}
	public void setNumCategorie(int numCategorie) {
		this.numCategorie = numCategorie;
	}
	
	public ArticleVendu() {
		super();
	}
	
	public ArticleVendu(int numArticle, String nomArticle, String description, Date dateDebutEnchere, Date dateFinEnchere,
			int prixInitial, int prixVente, int numUtilisateur, int numCategorie) {
		super();
		this.numArticle = numArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEnchere = dateDebutEnchere;
		DateFinEnchere = dateFinEnchere;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.numUtilisateur = numUtilisateur;
		this.numCategorie = numCategorie;
	}
	
	@Override
	public String toString() {
		return "Avis [numArticle=" + numArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEnchere=" + dateDebutEnchere + ", DateFinEnchere=" + DateFinEnchere + ", prixInitial="
				+ prixInitial + ", prixVente=" + prixVente + ", numUtilisateur=" + numUtilisateur + ", numCategorie="
				+ numCategorie + "]";
	} 
	
}
	
	
	
	
	
	