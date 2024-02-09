package pruebas_CRUD;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Subject;

public class Listar {
	 public static void main(String[] args) {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenLenguajeProgramacion_CL1");
	        EntityManager em = factory.createEntityManager();

	        Query query = em.createNamedQuery("Subject.findAll");

	        List<Subject> subjectList = query.getResultList();

	        if (!subjectList.isEmpty()) {
	            System.out.println("Lista de Subjects:");
	            for (Subject subject : subjectList) {
	                System.out.println("ID: " + subject.getIdsubject() + ", Subject: " + subject.getSubject() + ", Créditos: " + subject.getCredits());
	            }
	        } else {
	            System.out.println("No se encontraron Subjects registrados.");
	        }
	    }

}
