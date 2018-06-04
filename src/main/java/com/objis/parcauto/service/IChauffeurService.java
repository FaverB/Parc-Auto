/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.parcauto.service;

import com.objis.parcauto.domain.Chauffeur;

/**
 *
 * @author komi
 */
public interface IChauffeurService extends IService<Chauffeur, Long> {
    public Chauffeur find();
    public Chauffeur findById(Long lg);
}
