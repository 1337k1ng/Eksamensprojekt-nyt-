/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import entities.Role;
import entities.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


/**
 *
 * @author Madsj
 */
public class TestUser {
   /* 
    static EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
    static EntityManager em = emf.createEntityManager();
    
    public static void main(String[] args) {
      User user1 = new User("Johndddd", "kimbodddd");
      user1.addRole(new Role("admin"));
      User user2 = new User("Isaddd", "itzaddd");
      user2.addRole(new Role("admin"));
      em.getTransaction().begin();
      em.persist(user1);
      em.persist(user2);
      em.getTransaction().commit();
      em.close();
      
    }
 */
}
