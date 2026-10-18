package Project;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderId;
    private String orderTime;
    private List<OrderItem> orderItems = new ArrayList<>();
    private double totalPrice = 0;

	public Order() {
	}
	
    public Order(int orderId, String orderTime) {
        this.orderId = orderId;
        this.orderTime = orderTime;
    }

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
    
	/*method4 หาว่าเคยสั่งเมนูนี้ยัง*/
	public OrderItem findItem(String menuName) {
	    for (OrderItem item : orderItems) {
	        if (item.getMenu().getMenuName().equalsIgnoreCase(menuName)) {
	            return item;
	        }
	    }
	    return null;
	}
	
	/*method5*/
	public double calculateTotalPrice() {
        totalPrice = 0;
        for (OrderItem item : orderItems) {
            totalPrice += item.calculateSubTotal();
        }
        return totalPrice;
    }
	
	/*method6*/
	public boolean addItem(Menu menu, int quantity) {
        if (menu == null || quantity <= 0) {
            return false;
        }
        OrderItem oldItem = findItem(menu.getMenuName());
        if (oldItem != null) {
            oldItem.setQuantity(oldItem.getQuantity() + quantity);
        } else {
            orderItems.add(new OrderItem(menu, quantity));
        }
        calculateTotalPrice();
        return true;
    }
	
	/*method7*/
	public boolean removeItem(String menuName) {
        OrderItem item = findItem(menuName);
        if (item == null) {
            return false;
        }
        orderItems.remove(item);
        calculateTotalPrice();
        return true;
    }
	
	/*method8*/
	public void showOrder() {
        System.out.println("Order #" + orderId + " Time " + orderTime);
        for (OrderItem item : orderItems) {
            item.showItem();
        }
        System.out.println("   Total : " + totalPrice + " Bath");
    }

}
