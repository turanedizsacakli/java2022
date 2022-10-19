package homeworkProjectDayThree.dataAccess.absrtract;

import java.util.List;

import homeworkProjectDayThree.entities.concrete.Instructor;

public interface IInstructorDao {
	
	void add(Instructor instructor);
	void update(Instructor instructor);
	void delete(Instructor instructor);
	Instructor get(int id);
	List<Instructor> getAll();
}
