package fr.eni.projetenchereeni.bo;

import java.io.Serializable;

public class Categories implements Serializable {

	private static final long serialVersionUID = 1L;
	private int numCategories;
	private String lib; 
	
	
	public int getNumCategories() {
		return numCategories;
	}

	public void setNumCategories(int numCategories) {
		this.numCategories = numCategories;
	}

	public String getLib() {
		return lib;
	}

	public void setLib(String lib) {
		this.lib = lib;
	}
	
	
	public Categories() {
		super();
	}

	public Categories(int numCategories, String lib) {
		super();
		this.numCategories = numCategories;
		this.lib = lib;
	}

	@Override
	public String toString() {
		return "Categories [numCategories=" + numCategories + ", lib=" + lib + "]";
	}

}
