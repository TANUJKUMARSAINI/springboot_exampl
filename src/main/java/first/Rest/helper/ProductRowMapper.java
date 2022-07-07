package first.Rest.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import first.Rest.Entities.Product;

public class ProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p=new Product();
		p.setProductId(rs.getInt("product_id"));
		p.setProductName(rs.getString("name"));
		p.setProductPrice(rs.getDouble("price"));
		p.setProductDesc(rs.getString("descrip"));
		p.setStock(rs.getBoolean("stock"));
		return p;
	}


}
