/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.List;
 
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;

import entity.*;
/**
 *
 * @author wookie
 */
public class test_crud {
    
    public void deleteById(Class<?> type, Serializable id) {
        //Create session factory object  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();  
        //getting session object from session factory  
        Session session = sessionFactory.openSession();  
        session.beginTransaction();
            
        Object persistentInstance = session.load(type, id);
        if (persistentInstance != null) {
            session.delete(persistentInstance);
            session.getTransaction().commit();  
            //return true;
        }
        //return false;    
        session.close();  
    }
    
    public void Add(Class<?> type, String cpu, String video)
    {
        //Create student entity object  
        Computer computer = new Computer();    
        computer.setCpu(cpu);  
        computer.setVideo(video);  
    
        //Create session factory object  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();  
        //getting session object from session factory  
        Session session = sessionFactory.openSession();  
        //getting transaction object from session object  
        session.beginTransaction();  
    
        Object persistentInstance = session.load(type, cpu);
        if (persistentInstance != null) {
            session.delete(persistentInstance);
            session.getTransaction().commit();  
            //return true;
        }
        
        session.save(computer);  
        //System.out.println("Inserted Successfully");  
        session.close();  
        //sessionFactory.close(); 
    }
}
