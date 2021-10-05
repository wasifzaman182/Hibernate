package com.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Student s = new Student();
        s.setId(2);
        s.setCity("peshawar");
        s.setName("wasif");
        
        Session session = factory.openSession();
        
        Transaction tran = session.beginTransaction();
        session.save(s);
        tran.commit();
        session.close();
        //System.out.println("Session factory ::" + factory);
    }
}
