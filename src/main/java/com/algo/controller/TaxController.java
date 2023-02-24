package com.algo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algo.entity.Product;
import com.algo.entity.Taxes;
import com.algo.service.TaxService;

@RestController
public class TaxController {

	@Autowired
	TaxService ts;

	@GetMapping("/fetchTaxData")
	public List<Taxes> getTax() {
		List<Taxes> taxdata = ts.getTax();
		return taxdata;

	}

	@PostMapping("/inserttax")
	public String insertTax(@RequestBody Taxes t) {
		String msg = ts.insertTax(t);
		return msg;
	}

	@PostMapping("/updateTax")
	public String updateTax(@RequestBody Taxes t) {
		String msg = ts.updateTax(t);
		return msg;
	}

}
