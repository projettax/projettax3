/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.BultinIr;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author yasser
 */
@Stateless
public class BultinIrFacade extends AbstractFacade<BultinIr> {

    @PersistenceContext(unitName = "projettax2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BultinIrFacade() {
        super(BultinIr.class);
    }
    
}
