package pruebas_CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Subject;

public class Crear {
	public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenLenguajeProgramacion_CL1");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        Subject subject = new Subject();
        subject.setIdsubject(3); 
        subject.setSubject("Prueba 02"); 
        subject.setCredits("07"); 
        em.persist(subject);

        em.getTransaction().commit();	        
        System.out.println("Subject fue creado exitosamente:");
        System.out.println("ID: " + subject.getIdsubject());
        System.out.println("Nombre: " + subject.getSubject());
        System.out.println("Créditos: " + subject.getCredits());	
	
}
}