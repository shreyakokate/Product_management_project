package com.algo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algo.dao.TaxDao;
import com.algo.entity.Product;
import com.algo.entity.Taxes;

@Service
public class TaxService {

	@Autowired
	TaxDao td;
	
	public List<Taxes> getTax() {
		
		List<Taxes> tax = td.getTax();
		
		return tax;
	}

	public String insertTax(Taxes t) {
		 
	String msg = td.insertTax(t); 
		  
		 return msg;
	}

	public String updateTax(Taxes t)
	{
		String msg = td.updateTax(t);
	    return msg;
	}

}
