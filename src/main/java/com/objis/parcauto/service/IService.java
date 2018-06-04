/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.parcauto.service;

import java.util.List;

/**
 *
 * @author komi
 */
public interface IService<T,PK> {
    public boolean create(T t);
    public boolean update(T t);
    public boolean delete(T t); 
    public List<T> getAll();
}
