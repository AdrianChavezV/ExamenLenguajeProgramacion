package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class PruebaEditar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
SubjectDao dao = new SubjectDaoImpl();
		
		Subject subject = new Subject();
		subject.setIdSubject(1);
		subject.setSubject("Fisica");
		subject.setCredits("3");
		
		dao.update(subject);
		

		List<Subject> subjectList = dao.findAll();
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}

	}

}
