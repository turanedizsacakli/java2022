package homeworkProjectDayThree.dataAccess.absrtract;

import java.util.List;

import homeworkProjectDayThree.entities.concrete.Category;

public interface ICategoryDao {
	
	void add(Category category);
	void update(Category category);
	void delete(Category category);
	Category get(int id);
	List<Category> getAll();

}
