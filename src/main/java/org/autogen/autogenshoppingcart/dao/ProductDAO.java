package org.autogen.autogenshoppingcart.dao;

import org.autogen.autogenshoppingcart.entity.Product;
import org.autogen.autogenshoppingcart.model.PaginationResult;
import org.autogen.autogenshoppingcart.model.ProductInfo;

public interface ProductDAO {
	public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
}
