package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll(); //Tüm ürünleri döndürelim.
	
	//Ekleme işlemini gerçekleştir.
	// Döndüreceğimiz base Result'ın kendisidir.
	
	Result add(Product product);
}
