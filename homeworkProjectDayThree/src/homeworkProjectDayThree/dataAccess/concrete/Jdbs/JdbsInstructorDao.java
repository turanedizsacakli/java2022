package homeworkProjectDayThree.dataAccess.concrete.Jdbs;

import java.util.List;

import homeworkProjectDayThree.dataAccess.absrtract.IInstructorDao;
import homeworkProjectDayThree.entities.concrete.Instructor;

public class JdbsInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Added with Jdbs : " + instructor.getName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Delete with Jdbs : " + instructor.getName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Updated with Jdbs : " + instructor.getName());
		
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
