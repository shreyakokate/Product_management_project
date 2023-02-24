package com.algo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algo.entity.Product;
import com.algo.entity.ProductFinal;
import com.algo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService ps;
	
	  
		@GetMapping("/fetch")
		public List<ProductFinal> getProduct()
		{
			List<ProductFinal> list = ps.getProduct();
			return list;		
		}
	  @PostMapping("/insert")
	  public String insertProduct(@RequestBody Product p )
	  {	  
	  String msg = ps.insertProduct(p);
	  return msg;
	  }
	  @PostMapping("/update")
	  public String updateProduct(@RequestBody Product p )
	  {	  
	 String msg= ps.updateProduct(p); 
	 return msg;
	  }

	  @DeleteMapping("/delete/{productid}")
	  public String DeleteData(@PathVariable int productid)
	  {
		  String msg = ps.DeleteData(productid);
		  return msg;
	  }
}
