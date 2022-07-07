package first.Rest.Entities;

public class Category {
private int categoryId;
private String catgoryTitle;
private String categoryDesc;



public Category() {
	super();
	// TODO Auto-generated constructor stub
}


public Category(int categoryId, String catgoryTitle, String categoryDesc) {
	super();
	this.categoryId = categoryId;
	this.catgoryTitle = catgoryTitle;
	this.categoryDesc = categoryDesc;
}


public String getCatgoryTitle() {
	return catgoryTitle;
}
public void setCatgoryTitle(String catgoryTitle) {
	this.catgoryTitle = catgoryTitle;
}
public String getCategoryDesc() {
	return categoryDesc;
}
public void setCategoryDesc(String categoryDesc) {
	this.categoryDesc = categoryDesc;
}




public int getCategoryId() {
	return categoryId;
}


public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}


@Override
public String toString() {
	return "Category [categoryId=" + categoryId + ", catgoryTitle=" + catgoryTitle + ", categoryDesc=" + categoryDesc
			+ "]";
}

}
