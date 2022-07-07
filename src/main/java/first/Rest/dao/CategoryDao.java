package first.Rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import first.Rest.Entities.Category;

@Repository
public class CategoryDao {
@Autowired
private JdbcTemplate jdbcTemplate;

//creating category in database
public Category createCategory(Category category) {
	String query="insert into category(category_title,category_desc) values(?,?)";
	int update = jdbcTemplate.update(query,category.getCatgoryTitle(),category.getCategoryDesc());
	System.out.println(update+" rows affected for save category");
	return category;
}

//Getting single category by given categoryId
public Category getCategory(int categoryId) {
	
	String query="select * from category where category_id=?";
	Category category = jdbcTemplate.queryForObject(query, (rs,rowNum)->{
	Category c=new Category();
	c.setCategoryId(rs.getInt("category_id"));
	c.setCatgoryTitle(rs.getString("category_title"));
	c.setCategoryDesc(rs.getString("category_desc"));
	return c;
	},categoryId);
	
	
	return category;
}

//Getting all categories
public List<Category> getAllCategory() {
	String query="select * from category";
	List<Category> categories = jdbcTemplate.query(query, (rs,rowNum)->{
		Category c=new Category();
		c.setCategoryId(rs.getInt("category_id"));
		c.setCatgoryTitle(rs.getString("category_title"));
		c.setCategoryDesc(rs.getString("category_desc"));
		return c;
	});
	System.out.println("fetched all categories ");
return categories;
}

//delete category by given categoryId
public void deleteCategory(int categoryId) {
String query="delete from category where category_id=?";
int update = jdbcTemplate.update(query,categoryId);
System.out.println(update+" rows affected for delete category");
}

//update category
public Category updateCategory(Category newCategory, int categoryId) {
String query="update category set category_title=?,category_desc=? where category_id=?";
int update = jdbcTemplate.update(query,newCategory.getCatgoryTitle(),newCategory.getCategoryDesc(),categoryId);
System.out.println(update+" rows affected for update category");	
newCategory.setCategoryId(categoryId);
return newCategory;	
}

}
