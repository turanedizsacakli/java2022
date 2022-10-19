package homeworkProjectDayThree;

import java.util.ArrayList;
import java.util.List;

import homeworkProjectDayThree.business.absrtract.ICategoryService;
import homeworkProjectDayThree.business.absrtract.ICourseService;
import homeworkProjectDayThree.business.absrtract.IInstructorService;
import homeworkProjectDayThree.business.concrete.CategoryManager;
import homeworkProjectDayThree.business.concrete.CourseManager;
import homeworkProjectDayThree.business.concrete.InstructorManager;
import homeworkProjectDayThree.core.absrtract.ILogger;
import homeworkProjectDayThree.core.concrete.DatabaseLogger;
import homeworkProjectDayThree.core.concrete.EmailLogger;
import homeworkProjectDayThree.core.concrete.FileLogger;
import homeworkProjectDayThree.dataAccess.concrete.Hibernate.HibernateCourseDao;
import homeworkProjectDayThree.dataAccess.concrete.Jdbs.JdbsCategoryDao;
import homeworkProjectDayThree.dataAccess.concrete.Jdbs.JdbsInstructorDao;
import homeworkProjectDayThree.entities.concrete.Category;
import homeworkProjectDayThree.entities.concrete.Course;
import homeworkProjectDayThree.entities.concrete.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		List<Category> categoryDb = new ArrayList<>();
		List<Course> courseDb = new ArrayList<>();
		ILogger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

		ICourseService courseService = new CourseManager(new HibernateCourseDao(), courseDb, loggers);
		ICategoryService categoryService = new CategoryManager(new JdbsCategoryDao(), loggers, categoryDb);
		IInstructorService instructorService = new InstructorManager(new JdbsInstructorDao(), loggers);
		
		Course courseOne=new Course(1,"Python", 1 , "develop",1 , "Turan Ediz Saçaklı",10,10);
		
		Category categoryOne=new Category(1,"develop",10);
		
		Instructor instructorOne = new Instructor(1, "Turan Ediz", "Saçaklı",10);
		
		courseService.add(courseOne);
		
		categoryService.add(categoryOne);
		
		instructorService.add(instructorOne);
		
		
		
		
		
	}

}
