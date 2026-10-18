package Project;

public class OrderItem {
	private int quantity;
	private Menu menu = new Menu();
	
	public OrderItem() {
    }

    public OrderItem(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
    }

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity > 0) {
			this.quantity = quantity;
		}else {
			System.out.println("กรุณากรอกจำนวนให้มากกว่า 0");
		}
		
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	/*method2*/
	public double calculateSubTotal() {
        return menu.getPrice() * quantity;
    }
    
	/*method3*/
	public void showItem() {
        System.out.println("   - " + menu.getMenuName() + " x" + quantity
                + " = " + calculateSubTotal() + " Bath");
    }

}
