/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Operation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fatima
 */
@Stateless
public class OperationFacade extends AbstractFacade<Operation> {

    @PersistenceContext(unitName = "freelanceProjetPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OperationFacade() {
        super(Operation.class);
    }
    
}
