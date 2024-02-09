package pruebas_CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Subject;

public class Editar {
	public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenLenguajeProgramacion_CL1");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        
        Subject subject = em.find(Subject.class, 2); 
        if (subject != null) {
            
            subject.setSubject("Prueba 01"); 
            subject.setCredits("15"); 

            em.merge(subject);

            em.getTransaction().commit();
 
           
            System.out.println("Subject editado");
            System.out.println("ID: " + subject.getIdsubject());
            System.out.println("Nombre: " + subject.getSubject());
            System.out.println("Créditos: " + subject.getCredits());
        } else {
            System.out.println("no se encontraron datos con el Id requerido.");
        } 
    }
}
