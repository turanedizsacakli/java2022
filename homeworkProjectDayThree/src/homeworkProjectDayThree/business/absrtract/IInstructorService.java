package homeworkProjectDayThree.business.absrtract;

import java.util.List;

import homeworkProjectDayThree.entities.concrete.Instructor;

public interface IInstructorService {
	
	void add(Instructor instructor) throws Exception;
	
	List<Instructor> getAll();

}
