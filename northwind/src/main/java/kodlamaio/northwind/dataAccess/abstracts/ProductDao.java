package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository <Product,Integer> {

		//Bir alana göre datayı getirme;
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategoryId(String productName, int categoryId);
	
	List<Product>getByProductNameOrCategoryId(String productName, int categoryId);
	 
	List<Product> getByCategorIdIn(List<Integer>categories);
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith (String productName);
	
	
	//select* from products where product_name = x and categoryId = x
	@Query("From Product where productName=:productName and categoryId =: categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);
	
}
