package first.Rest.Entities;


/**
 * This is  a model class to store and fetch the data of a product
 * @since 1.0
 * @author admin
 *
 */
public class Product {
private int productId;
private String productName;
private String productDesc;
private double productPrice;
private boolean stock;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int productId, String productName, String productDesc, double productPrice, boolean stock) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productDesc = productDesc;
	this.productPrice = productPrice;
	this.stock = stock;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDesc() {
	return productDesc;
}
public void setProductDesc(String productDesc) {
	this.productDesc = productDesc;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
public boolean isStock() {
	return stock;
}
public void setStock(boolean stock) {
	this.stock = stock;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
			+ ", productPrice=" + productPrice + ", stock=" + stock + "]";
}

}
