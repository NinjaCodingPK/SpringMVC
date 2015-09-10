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
import org.hibernate.*;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Stack;

import java.io.Serializable;

import entity.*;
import hibernate.NewHibernateUtil;  
/**
 *
 * @author wookie
 */
public class crud<T> {
    private T t;
    
    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    
    
    private Class getGenericParameterClass(Class actualClass, int parameterIndex) {
        return (Class) ((ParameterizedType) actualClass.getGenericSuperclass()).getActualTypeArguments()[parameterIndex];
    }
    
    public Class getEntityClass() {
        return this.getGenericParameterClass(this.getClass(), 0);
    }
 
    
    public void deleteById(Class<?> type, Serializable id) {
        //Create session factory object  
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();  
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
     
    public void Add(Object obj)
    {
        //Create session factory object  
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();  
        //getting session object from session factory  
        Session session = sessionFactory.openSession();  
        //getting transaction object from session object  
        session.beginTransaction();  
    
        session.save(obj);  
 
        session.getTransaction().commit();  
        session.close();  
    }
    
    public List<T> ShowAll(String table_name)   
    {  
        //Create session factory object  
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();  
        //getting session object from session factory  
        Session session = sessionFactory.openSession();  
        //getting transaction object from session object  
        session.beginTransaction();  
        //Query query = session.createQuery("from " + t.toString());  //PROBLEM!  
        Query query = session.createQuery("from " + table_name);
        return query.list();  
      
        /*for(Computer computer : computers)  
        {  
            System.out.println("Computer Id: "+computer.getId()+", CPU: "+computer.getCpu()+", Video: "+computer.getVideo());  
        }*/   
        
        //May be wrong--------------
        //session.getTransaction().commit();  
        //sessionFactory.close();  
        //--------------------------
        
        //return computers;
    }
    
    /*public String test()
    {
        FullTextSession fullTextSession = Search.getFullTextSession(session);
        Transaction tx = fullTextSession.beginTransaction();

        // create native Lucene query unsing the query DSL
        // alternatively you can write the Lucene query using the Lucene query parser
        // or the Lucene programmatic API. The Hibernate Search DSL is recommended though
        QueryBuilder qb = fullTextSession.getSearchFactory()
            .buildQueryBuilder().forEntity( Book.class ).get();
            org.apache.lucene.search.Query query = qb
            .keyword()
            .onFields("title", "subtitle", "authors.name", "publicationDate")
            .matching("Java rocks!");
            .createQuery();

        // wrap Lucene query in a org.hibernate.Query
        org.hibernate.Query hibQuery = 
            fullTextSession.createFullTextQuery(query, Book.class);

        // execute search
        List result = hibQuery.list();
  
        tx.commit();
        session.close();
    }*/
    
}
