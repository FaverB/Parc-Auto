/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.parcauto.service.impl;

import com.objis.parcauto.dao.IChauffeurDAO;
import com.objis.parcauto.service.*;
import com.objis.parcauto.dao.impl.*;
import com.objis.parcauto.domain.Chauffeur;

import java.util.List;

/**
 *
 * @author komi
 */
public class ChauffeurService implements IChauffeurService{

    IChauffeurDAO chauffeurDAO=null;

    public ChauffeurService() {
        this.chauffeurDAO=new ChauffeurDAO();
    }
    
    
    @Override
    public boolean create(Chauffeur t) {
        return chauffeurDAO.create(t);
    }

    @Override
    public boolean update(Chauffeur t) {
        return chauffeurDAO.update(t);
    }

    @Override
    public boolean delete(Chauffeur t) {
        return chauffeurDAO.delete(t);
    }

    @Override
    public List<Chauffeur> getAll() {
        return chauffeurDAO.getAll();
    }


	@Override
	public Chauffeur find() {
		return chauffeurDAO.find();
	}


	@Override
	public Chauffeur findById(Long lg) {
		return chauffeurDAO.findById(lg);
	}
    
}
