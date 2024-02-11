package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Subject;



public class PruebaListar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cl1");
		EntityManager em = factory.createEntityManager();
		
		Query query = em.createNamedQuery("Subject.findAll");
		
		List<Subject> subjectList = (List<Subject>) query.getResultList();
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());

	}
	}

}
