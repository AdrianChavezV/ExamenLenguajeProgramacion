package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class PruebaEliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
SubjectDao dao = new SubjectDaoImpl();
		
		
		
		dao.delete(1);
		

		List<Subject> subjectList = dao.findAll();
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}

	}

}
