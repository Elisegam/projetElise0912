package service;

import model.Eleve;
import persistance.EleveDAO;
import persistance.MemoryEleveDAO;

public class Serviceimp implements EleveService{

	private EleveDAO  dao = new MemoryEleveDAO();
	
	@Override
	public void addEleve(Eleve e) {
dao.save(e);

}
}
