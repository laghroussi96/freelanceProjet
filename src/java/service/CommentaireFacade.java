/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Commentaire;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fatima
 */
@Stateless
public class CommentaireFacade extends AbstractFacade<Commentaire> {

    @PersistenceContext(unitName = "freelanceProjetPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public List<Commentaire> findByMission(Long numero){
        return em.createQuery("SELECT com FROM Commentaire com WHERE com.mission.id='"+numero+"'").getResultList();
    }
    public int calculCommentaire(Long numero){
        return (int) em.createNativeQuery("SELECT count(*) FROM Commentaire com WHERE com.mission.id='"+numero+"'").getSingleResult();
    }
    public CommentaireFacade() {
        super(Commentaire.class);
    }
    
}
