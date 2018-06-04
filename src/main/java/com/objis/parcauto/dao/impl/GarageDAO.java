/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.parcauto.dao.impl;

import java.util.List;

import com.objis.parcauto.dao.IGarageDAO;
import com.objis.parcauto.domain.Garage;

public class GarageDAO extends DAO<Garage, Long> implements IGarageDAO {

	@Override
	public Boolean create(Garage t) {
		return false;
	}

	@Override
	public Boolean update(Garage t) {
		return false;
	}

	@Override
	public Boolean delete(Garage t) {
		return false;
	}

	@Override
	public List<Garage> getAll() {
		return null;
	}
    
}
