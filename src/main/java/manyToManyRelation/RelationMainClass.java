package manyToManyRelation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RelationMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		List<Movies> listOfMovies = new ArrayList<Movies>();
		List<People> listOfPeople = new ArrayList<People>();

		Movies movie = new Movies();
		movie.setName("Done");
		movie.setMainRole("Shahrukh khan");
		listOfMovies.add(movie);

		People people = new People();
		people.setCount("100");
		listOfPeople.add(people);

		Movies movie1 = new Movies();
		movie1.setName("Done2");
		movie1.setMainRole("Shahrukh Khan");
		listOfMovies.add(movie1);

		People people1 = new People();
		people1.setCount("100");
		listOfPeople.add(people1);

		Movies movie2 = new Movies();
		movie2.setName("Pyarr");
		movie2.setMainRole("Shahrukh Khan");
		listOfMovies.add(movie2);

		People people2 = new People();
		people2.setCount("200");
		listOfPeople.add(people2);

		people.setMovies(listOfMovies);
		movie.setPeople(listOfPeople);

		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		
		session.save(movie);
		session.save(movie1);
		session.save(movie2);
		
		session.save(people);
		session.save(people1);
		session.save(people2);
		tran.commit();
		session.close();

	}

}
