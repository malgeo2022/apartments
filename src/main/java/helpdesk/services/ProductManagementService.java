package com.itbulls.learnit.javacore.finaltask.helpdesk.services;

import java.util.List;

import com.itbulls.learnit.javacore.finaltask.enteties.Product;

public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
