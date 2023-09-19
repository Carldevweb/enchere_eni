package fr.eni.projetenchereeni.dal;

import java.util.List;

import fr.eni.projetenchereeni.bo.Retrait;

public interface RetraitDAO {
	
	public List<Retrait> selectALL (Retrait retrait) throws BusinessExceptionDAL;;
}