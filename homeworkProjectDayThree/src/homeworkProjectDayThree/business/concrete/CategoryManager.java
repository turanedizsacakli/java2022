package homeworkProjectDayThree.business.concrete;

import java.util.ArrayList;
import java.util.List;

import homeworkProjectDayThree.business.absrtract.ICategoryService;
import homeworkProjectDayThree.core.absrtract.ILogger;
import homeworkProjectDayThree.dataAccess.absrtract.ICategoryDao;
import homeworkProjectDayThree.entities.concrete.Category;

public class CategoryManager implements ICategoryService{
	
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	private List<Category> categories = new ArrayList<Category>();
	
	

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	@Override
	public void add(Category category) throws Exception {
		for (Category _category : categories) {
			if (_category.getName().equals(category.getName())) {
				System.out.println(new Exception("Category cannot be same... : " + category.getName()));
			}
		}
		categoryDao.add(category);
		categories.add(category);
		for (ILogger logger : loggers) {
			logger.log(category.getName());
		}

	}

	@Override
	public List<Category> getAll() {
		return null;
	}


}
