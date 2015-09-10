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

import entity.*;
/**
 *
 * @author wookie
 */
//@Service("personService")
//@Transactional
public class Computer_crud {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    
    /**
    * Retrieves all persons
    *
    * @return a list of persons 
    */
    public List<Computer> ShowAll()   
    {  
        //Create session factory object  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();  
        //getting session object from session factory  
        Session session = sessionFactory.openSession();  
        //getting transaction object from session object  
        session.beginTransaction();  
        Query query = session.createQuery("from Computer");  
        List<Computer> computers = query.list();  
        /*for(Computer computer : computers)  
        {  
            System.out.println("Computer Id: "+computer.getId()+", CPU: "+computer.getCpu()+", Video: "+computer.getVideo());  
        }*/   
        session.getTransaction().commit();  
       // sessionFactory.close();  
        
        return computers;
    }
    
    public void Add(String cpu, String video)
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
        
        session.save(computer);  
        //System.out.println("Inserted Successfully");  
        session.getTransaction().commit();  
        session.close();  
        //sessionFactory.close(); 
    }
}

