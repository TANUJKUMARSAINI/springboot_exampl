package first.Rest.Services.Category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import first.Rest.Entities.Category;
import first.Rest.dao.CategoryDao;
@Service
@Primary
public class CategoryDaoServiceImpl implements CategoryService{
@Autowired
private CategoryDao categoryDao;
	

   @Override
	public Category createCategory(Category category) {
		
		return categoryDao.createCategory(category);
	}

	@Override
	public Category getCategory(int categoryId) {
		
		return categoryDao.getCategory(categoryId);
	}

	@Override
	public List<Category> getAllCategory() {
	
		return categoryDao.getAllCategory();
	}

	@Override
	public void deleteCategory(int categoryId) {
		categoryDao.deleteCategory(categoryId);
		
	}

	@Override
	public Category updateCategory(Category category, int categoryId) {
		return categoryDao.updateCategory(category, categoryId);
	}

}
