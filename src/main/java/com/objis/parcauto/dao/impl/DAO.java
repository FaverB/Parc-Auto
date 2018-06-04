/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.parcauto.dao.impl;

import java.sql.Connection;

import com.objis.parcauto.dao.ConnectionDAO;
import com.objis.parcauto.dao.IDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @param <T>
 * @param <PK>
 */
public abstract class DAO<T, PK> implements IDAO<T, PK> {

    protected Connection connection;
    PreparedStatement preparedStatement = null;

    public DAO() {
        super();
        connection = ConnectionDAO.getInstance();
    }

    public PreparedStatement createPreparedStatement(String statement) {
        try {
            preparedStatement = connection.prepareStatement(statement);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return preparedStatement;
    }

}
