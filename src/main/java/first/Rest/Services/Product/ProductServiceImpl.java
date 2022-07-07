package first.Rest.Services.Product;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import first.Rest.Entities.Product;

/**
 * This class provide the implementation to all the methods of ProductService interface
 * @since 1.0
 * @see first.Rest.Services.ProductService
 */
@Service
public class ProductServiceImpl implements ProductService{
private List<Product> list=new ArrayList<>();
	
    //creating product
	public Product createProduct(Product product) {
		list.add(product);
		return product;
	}
	
	//getting all product
    public  List<Product> getAllProduct(){
    	return list;
    }
	
	//get single product
    public Product getProduct(int productId) {
    	Product product=list.stream().filter(p->p.getProductId()==productId).findFirst().get();
    	return product;
    }
    
    //deleting product
    public void deleteProduct(int productId) {
    	List<Product> newList=list.stream().filter(p->p.getProductId()!=productId).collect(Collectors.toList());
    	list=newList;
    }
    
    //update product
    public Product updateProduct(Product newProduct,int productId) {
    	List<Product> updatedProduct=list.stream().map(p ->{
    		if(p.getProductId()==productId) {
    			//updated p return
    			p.setProductName(newProduct.getProductName());
    			p.setProductPrice(newProduct.getProductPrice());
    			p.setProductDesc(newProduct.getProductDesc());
    			p.setStock(newProduct.isStock());
    			return p;
    			}
    		else {
    			return p;
    		}
               		
    		}).collect(Collectors.toList());
    	list=updatedProduct;
    	newProduct.setProductId(productId);
    	
    	return newProduct;
    }
    
	
}
