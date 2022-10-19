package homeworkProjectDayThree.business.concrete;

import java.util.List;

import homeworkProjectDayThree.business.absrtract.IInstructorService;
import homeworkProjectDayThree.core.absrtract.ILogger;
import homeworkProjectDayThree.dataAccess.absrtract.IInstructorDao;
import homeworkProjectDayThree.entities.concrete.Instructor;

public class InstructorManager implements IInstructorService {

	private IInstructorDao instructorDao;
	private ILogger[] loggers;

	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (ILogger logger : loggers) {
			logger.log(instructor.getName() + instructor.getLastName());
		}

		return;
	}

	@Override
	public List<Instructor> getAll() {

		return null;
	}

}