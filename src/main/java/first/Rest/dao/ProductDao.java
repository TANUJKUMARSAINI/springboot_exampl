package first.Rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import first.Rest.Entities.Product;
import first.Rest.Services.Product.ProductService;
import first.Rest.helper.ProductRowMapper;
@Repository
public class ProductDao{
@Autowired
private JdbcTemplate jdbcTemplate;

//creating product 
public Product createProduct(Product product) {
	String query="insert into product(product_id,name,price,descrip,stock) values(?,?,?,?,?)";
	int update = jdbcTemplate.update(query,product.getProductId(),product.getProductName(),product.getProductPrice(),product.getProductDesc(),product.isStock());
	System.out.println(update+"rows affected for save data");
	return product;
}

//getting all product from db
public List<Product> getAllProduct() {
	String query="select * from product";
	List<Product> products = jdbcTemplate.query(query, new ProductRowMapper());
	System.out.println("fetch all data from product");
	return products;
}

//getting single product from db
public Product getProduct(int productId) {
	String query="select * from product where product_id=?";
	Product product = jdbcTemplate.queryForObject(query,new ProductRowMapper(), productId);
	System.out.println("single data fetched from product");
	return product;
}

//delete product by given id in db
public void deleteProduct(int productId) {
String query="delete from product where product_id=?";
int update = jdbcTemplate.update(query,productId);

System.out.println(update+"rows affected for delete product");	
}

//update product in db
public Product updateProduct(Product newProduct, int productId) {
	String query="update product set name=?,price=?,descrip=?,stock=? where product_id=?";
	int update = jdbcTemplate.update(query,newProduct.getProductName(),newProduct.getProductPrice(),newProduct.getProductDesc(),newProduct.isStock(),productId);
	newProduct.setProductId(productId);

	System.out.println(update+"rows affected for update product");
	return newProduct;
}



}
