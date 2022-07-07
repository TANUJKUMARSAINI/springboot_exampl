package first.Rest.Services.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import first.Rest.Entities.Product;
import first.Rest.dao.ProductDao;

@Service
@Primary
public class ProductDaoServiceImpl implements ProductService{
@Autowired
private ProductDao productDao;


	@Override
	public Product createProduct(Product product) {
    return productDao.createProduct(product);
    
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productDao.getAllProduct();
	}

	@Override
	public Product getProduct(int productId) {
		
		return productDao.getProduct(productId);
	}

	@Override
	public void deleteProduct(int productId) {
		productDao.deleteProduct(productId);
		
	}

	@Override
	public Product updateProduct(Product newProduct, int productId) {
		return productDao.updateProduct(newProduct, productId);
		
	}

}
