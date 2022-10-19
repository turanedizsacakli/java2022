package homeworkProjectDayThree.business.absrtract;

import java.util.List;

import homeworkProjectDayThree.entities.concrete.Course;

public interface ICourseService {
	
	void add(Course course) throws Exception;
	
	List<Course> getAll();

}
