package kodlamaio.northwind.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll(); //Tüm ürünleri döndürelim.
	
	//Ekleme işlemini gerçekleştir.
	// Döndüreceğimiz base Result'ın kendisidir.
	
	Result add(Product product);
	
	
	//Hepsi data döneceği için;
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>>getByProductNameOrCategoryId(String productName, int categoryId);
	 
	DataResult<List<Product>> getByCategorIdIn(List<Integer>categories);
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith (String productName);
	
	
	//select* from products where product_name = x and categoryId = x
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
}
