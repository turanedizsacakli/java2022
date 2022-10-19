package homeworkProjectDayThree.dataAccess.concrete.Hibernate;

import java.util.List;

import homeworkProjectDayThree.dataAccess.absrtract.ICourseDao;
import homeworkProjectDayThree.entities.concrete.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Added with Hibernate : " + course.getName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Delete with Hibernate : " + course.getName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Updated with Hibernate : " + course.getName());
		
	}

	@Override
	public Course get(int id) {

		return null;
	}

	@Override
	public List<Course> getAll() {

		return null;
	}

}
