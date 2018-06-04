package com.objis.parcauto.gui.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.objis.parcauto.domain.Chauffeur;
import com.objis.parcauto.service.IChauffeurService;
import com.objis.parcauto.service.impl.ChauffeurService;

@SuppressWarnings("serial")
public class ChauffeurModel extends AbstractTableModel {

	public IChauffeurService service;
	List<Chauffeur> chauffeurs;
	String[] titre = { "NOM", "PRENOM" };

	public ChauffeurModel() {
		// TODO Auto-generated constructor stub
		service = new ChauffeurService();
		chauffeurs = service.getAll();

	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return titre[column];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return titre.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return chauffeurs.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {

		case 0:
			return chauffeurs.get(rowIndex).getNom();

		case 1:
			return chauffeurs.get(rowIndex).getPrenom();

		default:
			return null;
		}
	}

	// @Override
	// public boolean isCellEditable(int rowIndex, int columnIndex) {
	// // TODO Auto-generated method stub
	// return true;
	// }

	public void addChauffeur(Chauffeur chauffeur) {
		if (service.create(chauffeur)) {
			this.chauffeurs.add(service.find());
			fireTableRowsInserted(chauffeurs.size() - 1, chauffeurs.size() - 1);
		}
	}

	public void suprChauffeur(int rowSelected) {
		if(service.delete(service.findById((chauffeurs.get(rowSelected).getId())))){
		chauffeurs.remove(rowSelected);
		fireTableRowsDeleted(rowSelected, rowSelected);
	}
	}
	
	public void modifChauffeur(int rowSelected, String strNom, String strPrenom){		
		chauffeurs.get(rowSelected).setNom(strNom);
		chauffeurs.get(rowSelected).setPrenom(strPrenom);
		service.update(chauffeurs.get(rowSelected));						
			fireTableRowsUpdated(rowSelected, rowSelected);
	}

}
