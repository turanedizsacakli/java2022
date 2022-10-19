package homeworkProjectDayThree.business.absrtract;

import java.util.List;

import homeworkProjectDayThree.entities.concrete.Category;

public interface ICategoryService {

	void add(Category category) throws Exception;
	
	List<Category> getAll();
}
