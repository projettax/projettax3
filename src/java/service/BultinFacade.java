/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Bultin;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author yasser
 */
@Stateless
public class BultinFacade extends AbstractFacade<Bultin> {

    @PersistenceContext(unitName = "projettax2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BultinFacade() {
        super(Bultin.class);
    }
    
}
