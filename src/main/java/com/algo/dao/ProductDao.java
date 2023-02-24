package com.algo.dao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.algo.entity.Product;
import com.algo.entity.ProductFinal;
import com.algo.entity.Taxes;

@Repository
public class ProductDao {

	@Autowired
	SessionFactory sf;
	ProductFinal pf = new ProductFinal();
	

	public String insertProduct(Product p) {
	
		  Session session = sf.openSession();
		  Transaction tr = session.beginTransaction();
		  ProductFinal pf=new ProductFinal(); 
		  Taxes Electronics = session.get(Taxes.class,"Electronics");
		  Taxes Clothing = session.get(Taxes.class,"Clothing");
		  Taxes Furniture = session.get(Taxes.class,"Furniture");
		  Taxes Home= session.get(Taxes.class,"Home Appliances");
		  
		     if (p.getCategory().equals(Electronics.getCategory())) 
		     {	
			double discount = (p.getBasePrice() * Electronics.getDiscount()) / 100;
			double deliverycharge = Electronics.getDeliverycharge();
			double AfterDiscount = (p.getBasePrice() - discount);
			double gst = (AfterDiscount * Electronics.getGST()/ 100);
			double finalamount = ((p.getBasePrice() + Electronics.getDeliverycharge() + gst) - discount);
			pf.setProductid(p.getProductid());
			pf.setName(p.getName());
			pf.setProductType(p.getProductType());
			pf.setCategory(p.getCategory());
			pf.setBasePrice(p.getBasePrice());
			pf.setDiscount(discount);
			pf.setGst(gst);	
			pf.setDelivery(deliverycharge);
			pf.setFinalprice(finalamount);	
			session.save(p);
			session.save(pf);
			tr.commit();	
		} 
             if (p.getCategory().equals(Clothing.getCategory())) 
		     {
			double discount = (p.getBasePrice() * Clothing.getDiscount()) / 100;
			double deliverycharge = Clothing.getDeliverycharge();
			double AfterDiscount = (p.getBasePrice() - discount);
			double gst = (AfterDiscount * Clothing.getGST()/ 100);
			double finalamount = ((p.getBasePrice() + Clothing.getDeliverycharge() + gst) - discount);
			
			pf.setProductid(p.getProductid());
			pf.setName(p.getName());
			pf.setProductType(p.getProductType());
			pf.setCategory(p.getCategory());
			pf.setBasePrice(p.getBasePrice());
			pf.setDiscount(discount);
			pf.setGst(gst);	
			pf.setDelivery(deliverycharge);
			pf.setFinalprice(finalamount);	
			session.save(p);
			session.save(pf);
			tr.commit();	
		}
		     if (p.getCategory().equals(Furniture.getCategory())) 
		     {
			double discount = (p.getBasePrice() * Furniture.getDiscount()) / 100;
			double deliverycharge = Furniture.getDeliverycharge();
			double AfterDiscount = (p.getBasePrice() - discount);
			double gst = (AfterDiscount * Furniture.getGST()/ 100);
			double finalamount = ((p.getBasePrice() + Furniture.getDeliverycharge() + gst) - discount);
			pf.setProductid(p.getProductid());
			pf.setName(p.getName());
			pf.setProductType(p.getProductType());
			pf.setCategory(p.getCategory());
			pf.setBasePrice(p.getBasePrice());
			pf.setDiscount(discount);
			pf.setGst(gst);	
			pf.setDelivery(deliverycharge);
			pf.setFinalprice(finalamount);	
			session.save(p);
			session.save(pf);
			tr.commit();	
		}  
		     if (p.getCategory().equals(Home.getCategory())) 
		     {
			double discount = (p.getBasePrice() * Home.getDiscount()) / 100;
			double deliverycharge = Home.getDeliverycharge();
			double AfterDiscount = (p.getBasePrice() - discount);
			double gst = (AfterDiscount * Home.getGST()/ 100);
			double finalamount = ((p.getBasePrice() + Home.getDeliverycharge() + gst) - discount);
			pf.setProductid(p.getProductid());
			pf.setName(p.getName());
			pf.setProductType(p.getProductType());
			pf.setCategory(p.getCategory());
			pf.setBasePrice(p.getBasePrice());
			pf.setDiscount(discount);
			pf.setGst(gst);	
			pf.setDelivery(deliverycharge);
			pf.setFinalprice(finalamount);	
			session.save(p);
			session.save(pf);
			tr.commit();	
		}  
		     return "Data inserted Successfully";
	}
	public List<ProductFinal> getProduct() {
	   Session session=sf.openSession();
	   Criteria criteria=session.createCriteria(ProductFinal.class);   
	   List<ProductFinal> list = criteria.list();
		return list;
	}
	
	public String updateProduct(Product p) {

		  Session session = sf.openSession();
		  Transaction tr = session.beginTransaction();
		  ProductFinal pf=new ProductFinal(); 
		  Taxes Electronics = session.get(Taxes.class,"Electronics");
		  Taxes Clothing = session.get(Taxes.class,"Clothing");
		  Taxes Furniture = session.get(Taxes.class,"Furniture");
		  Taxes Home= session.get(Taxes.class,"Home Appliances");
		  
		     if (p.getCategory().equals(Electronics.getCategory())) 
		     {	
			double discount = (p.getBasePrice() * Electronics.getDiscount()) / 100;
			double deliverycharge = Electronics.getDeliverycharge();
			double AfterDiscount = (p.getBasePrice() - discount);
			double gst = (AfterDiscount * Electronics.getGST()/ 100);
			double finalamount = ((p.getBasePrice() + Electronics.getDeliverycharge() + gst) - discount);
			pf.setProductid(p.getProductid());
			pf.setName(p.getName());
			pf.setProductType(p.getProductType());
			pf.setCategory(p.getCategory());
			pf.setBasePrice(p.getBasePrice());
			pf.setDiscount(discount);
			pf.setGst(gst);	
			pf.setDelivery(deliverycharge);
			pf.setFinalprice(finalamount);	
			session.update(p);
			session.update(pf);
			tr.commit();	
		} 
           if (p.getCategory().equals(Clothing.getCategory())) 
		     {
			double discount = (p.getBasePrice() * Clothing.getDiscount()) / 100;
			double deliverycharge = Clothing.getDeliverycharge();
			double AfterDiscount = (p.getBasePrice() - discount);
			double gst = (AfterDiscount * Clothing.getGST()/ 100);
			double finalamount = ((p.getBasePrice() + Clothing.getDeliverycharge() + gst) - discount);

			
			pf.setProductid(p.getProductid());
			pf.setName(p.getName());
			pf.setProductType(p.getProductType());
			pf.setCategory(p.getCategory());
			pf.setBasePrice(p.getBasePrice());
			pf.setDiscount(discount);
			pf.setGst(gst);	
			pf.setDelivery(deliverycharge);
			pf.setFinalprice(finalamount);	
			session.update(p);
			session.update(pf);
			tr.commit();	
		}
		     if (p.getCategory().equals(Furniture.getCategory())) 
		     {
			double discount = (p.getBasePrice() * Furniture.getDiscount()) / 100;
			double deliverycharge = Furniture.getDeliverycharge();
			double AfterDiscount = (p.getBasePrice() - discount);
			double gst = (AfterDiscount * Furniture.getGST()/ 100);
			double finalamount = ((p.getBasePrice() + Furniture.getDeliverycharge() + gst) - discount);
			pf.setProductid(p.getProductid());
			pf.setName(p.getName());
			pf.setProductType(p.getProductType());
			pf.setCategory(p.getCategory());
			pf.setBasePrice(p.getBasePrice());
			pf.setDiscount(discount);
			pf.setGst(gst);	
			pf.setDelivery(deliverycharge);
			pf.setFinalprice(finalamount);	
			session.update(p);
			session.update(pf);
			tr.commit();	
		}  
		     if (p.getCategory().equals(Home.getCategory())) 
		     {
			double discount = (p.getBasePrice() * Home.getDiscount()) / 100;
			double deliverycharge = Home.getDeliverycharge();
			double AfterDiscount = (p.getBasePrice() - discount);
			double gst = (AfterDiscount * Home.getGST()/ 100);
			double finalamount = ((p.getBasePrice() + Home.getDeliverycharge() + gst) - discount);
			pf.setProductid(p.getProductid());
			pf.setName(p.getName());
			pf.setProductType(p.getProductType());
			pf.setCategory(p.getCategory());
			pf.setBasePrice(p.getBasePrice());
			pf.setDiscount(discount);
			pf.setGst(gst);	
			pf.setDelivery(deliverycharge);
			pf.setFinalprice(finalamount);	
		    session.update(p);
			session.update(pf);
			tr.commit();	
		}  
		     return "Data Updated Successfully";
	}

	public String DeleteData(int productid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		ProductFinal procid = session.get(ProductFinal.class, productid);
		Product id = session.get(Product.class, productid);
		
		session.delete(procid);
		session.delete(id);
		
		tr.commit();
		session.close();
		return "Data Deleted Successfully";

	}
}

