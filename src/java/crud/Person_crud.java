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
public class Person_crud {
     @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    
    /**
    * Retrieves all persons
    *
    * @return a list of persons 
    */
    public List<Person> ShowAll()   
    {  
        //Create session factory object  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();  
        //getting session object from session factory  
        Session session = sessionFactory.openSession();  
        //getting transaction object from session object  
        session.beginTransaction();  
        Query query = session.createQuery("from Person");  
        List<Person> persons = query.list();  
        /*for(Person person : persons)  
        {  
            System.out.println("Person Id: "+person.getId()+", Name: "+person.getName()+", Surname: "+person.getSurname()+
                    ",Computer: "+person.getComputer().getId());  
        } */  
        session.getTransaction().commit();  
        sessionFactory.close();  
        
        return persons;
 }  
}
