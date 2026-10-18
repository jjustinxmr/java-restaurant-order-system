package Project;

public class Menu {
	private String menuName;
    private double price;
    private String category;
    
    public Menu() {
	}
    
	public Menu(String menuName, double price, String category) {
		super();
		this.menuName = menuName;
		this.price = price;
		this.category = category;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}else {
			System.out.println("กรุณากรอกราคาใหม่ที่มากกว่า 0");
		}
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	/*method1*/
	public void showMenu() {
        System.out.println(menuName + "(" + category + ")" + " price " + price + " Bath");
    }
}
