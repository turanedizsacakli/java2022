package homeworkProjectDayThree.business.concrete;

import java.util.ArrayList;
import java.util.List;

import homeworkProjectDayThree.business.absrtract.ICourseService;
import homeworkProjectDayThree.core.absrtract.ILogger;

import homeworkProjectDayThree.dataAccess.absrtract.ICourseDao;
import homeworkProjectDayThree.entities.concrete.Course;

public class CourseManager implements ICourseService {

	private ICourseDao courseDao;
	private ILogger[] loggers;

	private List<Course> courses = new ArrayList<Course>();

	public CourseManager(ICourseDao courseDao, List<Course> courses, ILogger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	@Override
	public void add(Course course) throws Exception {
		if (course.getPrice() < 0) {
			System.out.println("Course price cannot be less than 0..." + course.getPrice());		
			}
		
		for (Course _course : courses) {
			if (_course.getName().equals(course.getName())) {
				System.out.println(" Course name cannot be same... : " + course.getName());
		
			}

		}

		courseDao.add(course);
		courses.add(course);
		for (ILogger logger : loggers) {
			logger.log(course.getName());
		}

	}

	@Override
	public List<Course> getAll() {

		return null;
	}

}