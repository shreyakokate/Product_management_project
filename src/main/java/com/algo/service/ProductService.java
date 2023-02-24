package com.algo.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algo.dao.ProductDao;
import com.algo.entity.Product;
import com.algo.entity.ProductFinal;
import com.algo.entity.Taxes;

@Service
public class ProductService {

	@Autowired
	ProductDao pd;

	Taxes t = new Taxes();

	ProductFinal pf = new ProductFinal();

	public List<ProductFinal> getProduct() {

		List<ProductFinal> list = pd.getProduct();

		return list;
	}

	public String insertProduct(Product p) {

		String msg = pd.insertProduct(p);
		return msg;
	}

	public String updateProduct(Product p) {
		String msg = pd.updateProduct(p);
		return msg;
	}

	public String DeleteData(int productid) {
		String msg = pd.DeleteData(productid);
		return msg;
		
		
	}
}
