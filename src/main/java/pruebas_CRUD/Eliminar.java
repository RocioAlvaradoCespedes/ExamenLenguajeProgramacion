package pruebas_CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Subject;

public class Eliminar {

	 public static void main(String[] args) {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenLenguajeProgramacion_CL1");
	        EntityManager em = factory.createEntityManager();

	        em.getTransaction().begin();

	        Subject subject = em.find(Subject.class, 1); // Suponiendo que el Subject que quieres eliminar tiene ID = 1
	        if (subject != null) {
	            em.remove(subject);

	            em.getTransaction().commit();

	            System.out.println("Subject eliminado satisfactoriamente.");
	        } else {
	            System.out.println("no se encontraron datos con el Id requerido.");
	        }
	    }
}
