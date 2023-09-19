package fr.eni.projetenchereeni.bo;

import java.io.Serializable;
import java.util.Date;


public class Encheres implements Serializable {

	private static final long  serialVersionUID = 1L;
	private int numUtilisateur;
	private int numArticle;
	private Date dateEnchere;
	private int montantEnchere;
	
	
	public int getNumUtilisateur() {
		return numUtilisateur;
	}
	public void setNumUtilisateur(int numUtilisateur) {
		this.numUtilisateur = numUtilisateur;
	}
	public int getNumArticle() {
		return numArticle;
	}
	public void setNumArticle(int numArticle) {
		this.numArticle = numArticle;
	}
	public Date getDateEnchere() {
		return dateEnchere;
	}
	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	public int getMontantEnchere() {
		return montantEnchere;
	}
	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}
	
	public Encheres() {
		super();
	}
	public Encheres(int numUtilisateur, int numArticle, Date dateEnchere, int montantEnchere) {
		super();
		this.numUtilisateur = numUtilisateur;
		this.numArticle = numArticle;
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}
	@Override
	public String toString() {
		return "Encheres [numUtilisateur=" + numUtilisateur + ", numArticle=" + numArticle + ", dateEnchere="
				+ dateEnchere + ", montantEnchere=" + montantEnchere + "]";
	}

	
	
	
	
	
	

	
}
