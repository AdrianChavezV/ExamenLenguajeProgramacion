package pruebas;

import java.util.Iterator;
import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class PruebaRegistrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubjectDao dao = new SubjectDaoImpl();
		
		Subject subject = new Subject();
		subject.setSubject("Lenguaje");
		subject.setCredits("3");
		
		dao.create(subject);
		
		List<Subject> subjectList = dao.findAll();
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}

	}

}
