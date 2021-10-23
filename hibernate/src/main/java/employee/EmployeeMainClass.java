package employee;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMainClass {
	public static void main(String[] args) throws Exception {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// ist employee record
		Employee emp = new Employee();
		emp.setName("Wasif");
		emp.setAddress("Peshawar");

		// ist employee details 1
		Details details = new Details();
		details.setPhoneNo("03379743972975");
		details.setBankAccount("450384053804583048");
	

		// ist employee details 2
		Details details2 = new Details();
		details2.setPhoneNo("03379743972975");
		details2.setBankAccount("450384053804583048");

		// ist employee details 3
		Details details3 = new Details();
		details3.setPhoneNo("03379743972975");
		details3.setBankAccount("450384053804583048");

		List<Details> deList = new ArrayList();
		deList.add(details);
		deList.add(details2);
		deList.add(details3);
		
		emp.setDetails(deList);
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();

		session.save(emp);
		session.save(details);
		session.save(details2);
		session.save(details3);
		
		tran.commit();
		session.close();
	}

}
