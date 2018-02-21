package org.autogen.autogenshoppingcart.dao;

import java.util.List;

import org.autogen.autogenshoppingcart.model.CartInfo;
import org.autogen.autogenshoppingcart.model.OrderDetailInfo;
import org.autogen.autogenshoppingcart.model.OrderInfo;
import org.autogen.autogenshoppingcart.model.PaginationResult;

public interface OrderDAO {
	public void saveOrder(CartInfo cartInfo);
	 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
}
