package com.hibernate;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Address;
import model.Student;
import model.Subjects;

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

        //first record
        Student s = new Student();
        s.setCity("peshawar");
        s.setName("wasif");
        
        Address ad = new Address();
        ad.setCity("KARACHI");
        ad.setStreet("Street1");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(79.475983);
        s.setAddress(ad);
        
        //second record
        Student s1 = new Student();
        s1.setCity("peshawar");
        s1.setName("Abid");
        
        Subjects sujects = new Subjects();
        sujects.setSubjectName("Biology");
        sujects.setStudent(s1);
        
        Subjects subjects1= new Subjects();
        subjects1.setSubjectName("Checmistery");
        subjects1.setStudent(s1);
        
        List<Subjects> studentList = new ArrayList<Subjects>();
        studentList.add(sujects);
        studentList.add(subjects1);
       // s1.setSubjects(studentList);
        
        
        Address ad1 = new Address();
        ad1.setCity("KARACHI");
        ad1.setStreet("Street1");
        ad1.setOpen(true);
        ad1.setAddedDate(new Date());
        ad1.setX(79.475983);
        
        s1.setAddress(ad1);
        
        //reading file
//        FileInputStream file = new FileInputStream("src/main/java/3rd class summary.PNG");
//        byte[] data = new  byte[file.available()];
//        file.read();
//        ad.setImage(data);
        
        Session session = factory.openSession();
        Transaction tran = session.beginTransaction();
        session.save(s);
        session.save(ad);
        //session.save(ad);
        session.save(s1);
        session.save(ad1);
        session.save(sujects);
        session.save(subjects1);
        tran.commit();
        session.close();
        //System.out.println("Session factory ::" + factory);
    }
}
