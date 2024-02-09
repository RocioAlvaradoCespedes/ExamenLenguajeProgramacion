package daos;

import java.util.List;

public interface SubjectDao {
	public void create(SubjectDao subject);

	public void update(SubjectDao subject);

	public void delete(Integer id);

	public SubjectDao find(Integer id);

	public List<SubjectDao> findAll();
}
