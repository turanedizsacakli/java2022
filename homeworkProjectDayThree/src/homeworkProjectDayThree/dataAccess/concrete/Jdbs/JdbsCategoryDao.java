package homeworkProjectDayThree.dataAccess.concrete.Jdbs;

import java.util.List;

import homeworkProjectDayThree.dataAccess.absrtract.ICategoryDao;
import homeworkProjectDayThree.entities.concrete.Category;

public class JdbsCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Added with Jdbs : " + category.getName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Delete with Jdbs : " + category.getName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Updated with Jdbs :" + category.getName());
		
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
