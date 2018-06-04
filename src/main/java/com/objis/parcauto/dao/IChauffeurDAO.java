/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.parcauto.dao;

import com.objis.parcauto.domain.Chauffeur;

/**
 *
 * @author komi
 */
public interface IChauffeurDAO extends IDAO<Chauffeur, Long>{
	public Chauffeur find();
	 public Chauffeur findById(Long lg);
}
