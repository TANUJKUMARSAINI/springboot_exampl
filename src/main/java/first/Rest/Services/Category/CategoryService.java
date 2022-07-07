package first.Rest.Services.Category;

import java.util.List;

import first.Rest.Entities.Category;

public interface CategoryService {
public Category createCategory(Category category);
public Category getCategory(int categoryId);
public List<Category> getAllCategory();
public void deleteCategory(int categoryId);
public Category updateCategory(Category category,int categoryId);
}
