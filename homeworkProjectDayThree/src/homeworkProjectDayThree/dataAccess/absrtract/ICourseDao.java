package homeworkProjectDayThree.dataAccess.absrtract;

import java.util.List;

import homeworkProjectDayThree.entities.concrete.Course;

public interface ICourseDao {

	void add(Course course);
	void delete(Course course);
	void update(Course course);
	Course get(int id);
	List<Course> getAll();
	
}
