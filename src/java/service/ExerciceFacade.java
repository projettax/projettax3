/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Exercice;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author yasser
 */
@Stateless
public class ExerciceFacade extends AbstractFacade<Exercice> {

    @PersistenceContext(unitName = "projettax2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExerciceFacade() {
        super(Exercice.class);
    }
    
}
