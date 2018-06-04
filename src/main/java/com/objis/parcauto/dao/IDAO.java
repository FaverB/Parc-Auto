/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.parcauto.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author komi
 * @param <T>
 * @param <PK>
 */
public interface IDAO<T,PK> {
    public Boolean create(T t);
    public Boolean update(T t);
    public Boolean delete(T t); 
    public List<T> getAll();
}
