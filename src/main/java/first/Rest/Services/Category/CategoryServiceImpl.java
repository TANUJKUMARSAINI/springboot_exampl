package first.Rest.Services.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import first.Rest.Entities.Category;
@Service
public class CategoryServiceImpl implements CategoryService{

	List<Category> list=new ArrayList<>();
	
	
	
	@Override
	public Category createCategory(Category category) {
		list.add(category);
		return category;
	}

	@Override
	public Category getCategory(int categoryId) {
	Category category=	list.stream().filter(c->c.getCategoryId()==categoryId).findFirst().get();
    return category;
	}

	@Override
	public List<Category> getAllCategory() {
		
		return list;	
				
	}

	@Override
	public void deleteCategory(int categoryId) {
		List<Category> newList = list.stream().filter(c->c.getCategoryId()!=categoryId).collect(Collectors.toList());
		list=newList;
	}

	@Override
	public Category updateCategory(Category newCategory, int categoryId) {
		List<Category> updatedCategory=list.stream().map(c->{
			if(c.getCategoryId()==categoryId) {
				c.setCatgoryTitle(newCategory.getCatgoryTitle());
				c.setCategoryDesc(newCategory.getCategoryDesc());
				return c;
			}
			else {
				return c;
			}
			
		}).collect(Collectors.toList());
		list=updatedCategory;
		newCategory.setCategoryId(categoryId);
		
		
		return newCategory;
	}

}
