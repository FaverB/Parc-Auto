/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.parcauto.dao.impl;

import java.util.List;

import com.objis.parcauto.dao.IChauffeurDAO;
import com.objis.parcauto.domain.Chauffeur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ChauffeurDAO extends DAO<Chauffeur, Long> implements IChauffeurDAO {

	private final String createStatement = "insert into chauffeurs (nom,prenom) values (?,?)";
	private final String updateStatement = "update chauffeurs set nom=? ,prenom=? where id=?";
	private final String deleteStatement = "delete from chauffeurs where id=?";
	private final String readAllStatement = "select * from chauffeurs";
	private final String findLastStatement = "select * from chauffeurs order by id desc";
	private final String findByIdStatement = "select * from chauffeurs where id = ? ";

	@Override
	public Boolean create(Chauffeur t) {
		int executeUpdate = -1;
		this.createPreparedStatement(createStatement);
		try {
			preparedStatement.setString(1, t.getNom());
			preparedStatement.setString(2, t.getPrenom());
			executeUpdate = preparedStatement.executeUpdate();

		} catch (SQLException ex) {
			Logger.getLogger(ChauffeurDAO.class.getName()).log(Level.SEVERE, null, ex);
		}

		return executeUpdate > 0;
	}

	@Override
	public Boolean update(Chauffeur t) {
		int executeUpdate = -1;
		this.createPreparedStatement(updateStatement);
		try {
			preparedStatement.setString(1, t.getNom());
			preparedStatement.setString(2, t.getPrenom());
			preparedStatement.setLong(3, t.getId());
			executeUpdate = preparedStatement.executeUpdate();

		} catch (SQLException ex) {
			Logger.getLogger(ChauffeurDAO.class.getName()).log(Level.SEVERE, null, ex);
		}

		return executeUpdate > 0;
	}

	@Override
	public Boolean delete(Chauffeur t) {
		int executeUpdate = -1;
		this.createPreparedStatement(deleteStatement);
		try {
			preparedStatement.setLong(1, t.getId());
			executeUpdate = preparedStatement.executeUpdate();

		} catch (SQLException ex) {
			Logger.getLogger(ChauffeurDAO.class.getName()).log(Level.SEVERE, null, ex);
		}

		return executeUpdate > 0;
	}

	@Override
	public List<Chauffeur> getAll() {

		List<Chauffeur> chauffeurs = null;

		this.createPreparedStatement(readAllStatement);

		try {
			ResultSet rs = preparedStatement.executeQuery();
			chauffeurs = new LinkedList<>();
			while (rs.next()) {
				Long id = rs.getLong("id");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				chauffeurs.add(new Chauffeur(id, nom, prenom));
			}

		} catch (SQLException ex) {
			Logger.getLogger(ChauffeurDAO.class.getName()).log(Level.SEVERE, null, ex);
		}

		return chauffeurs;
	}

	public Chauffeur find() {
		Chauffeur chauffeur = null;
		this.createPreparedStatement(findLastStatement);
		try {
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.first()) {
				chauffeur = new Chauffeur(rs.getLong("id"), rs.getString("nom"), rs.getString("prenom"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(ChauffeurDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return chauffeur;
	}

	public Chauffeur findById(Long lg) {
		Chauffeur chauffeur = null;
		this.createPreparedStatement(findByIdStatement);
		try {
			preparedStatement.setLong(1, lg);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				chauffeur = new Chauffeur(rs.getLong("id"), rs.getString("nom"), rs.getString("prenom"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(ChauffeurDAO.class.getName()).log(Level.SEVERE, null, ex);

		}
		return chauffeur;
	}
}
