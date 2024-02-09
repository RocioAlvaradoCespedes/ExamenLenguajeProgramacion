package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SubjectDaoImple implements SubjectDao {

	EntityManagerFactory factory;
	EntityManager em;
	
	public SubjectDaoImple() {
		 factory = Persistence.createEntityManagerFactory("ExamenLenguajeProgramacion_CL1");
		 em= factory.createEntityManager();
	}

	@Override
	public void create(SubjectDao subject) {
		em.getTransaction().begin();
		em.persist(subject);
		em.getTransaction().commit();

	} 

	@Override
	public void update(SubjectDao subject) {
		try {
			em.getTransaction().begin();
			em.merge(subject);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}

	} 

	@Override
	public void delete(Integer id) {
		SubjectDao subject = find(id);
		em.getTransaction().begin();
		em.remove(subject);
		em.getTransaction().commit();

	}

	@Override
	public SubjectDao find(Integer id) {
		// TODO Auto-generated method stub
		return em.find(SubjectDao.class, id);
	}

	@Override
	public List<SubjectDao> findAll() {
		Query query = em.createNamedQuery("Subject.findAll");
		List<SubjectDao> lista = query.getResultList();
		return lista;
	}

}


