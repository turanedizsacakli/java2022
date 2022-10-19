package homeworkProjectDayThree.dataAccess.concrete.Hibernate;

import java.util.List;

import homeworkProjectDayThree.dataAccess.absrtract.ICategoryDao;
import homeworkProjectDayThree.entities.concrete.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Added with Hibernate : " + category.getName());

	}

	@Override
	public void update(Category category) {
		System.out.println("Delete with Hibernate : " + category.getName());

	}

	@Override
	public void delete(Category category) {
		System.out.println("Updated with Hibernate :" + category.getName());

	}

	@Override
	public Category get(int id) {

		return null;
	}

	@Override
	public List<Category> getAll() {

		return null;
	}

}
