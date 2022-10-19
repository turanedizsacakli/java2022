package homeworkProjectDayThree.dataAccess.concrete.Hibernate;

import java.util.List;

import homeworkProjectDayThree.dataAccess.absrtract.IInstructorDao;
import homeworkProjectDayThree.entities.concrete.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Added with Hibernate : " + instructor.getName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Delete with Hibernate : " + instructor.getName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Updated with Hibernate : " + instructor.getName());
		
	}

	@Override
	public Instructor get(int id) {

		return null;
	}

	@Override
	public List<Instructor> getAll() {

		return null;
	}

}
