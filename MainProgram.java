package Project;

public class MainProgram {

	public static void main(String[] args) {
		Restaurant r = new Restaurant("Jastin and Arm Restaurant");
		Table t1 = new Table(1, 4);
		Table t2 = new Table(2, 4);
		Table t3 = new Table(3, 4);
		Table t4 = new Table(4, 4);
		Table t5 = new Table(5, 4);
		Table t6 = new Table(6, 6);
		Table t7 = new Table(7, 6);
		Table t8 = new Table(8, 8);
		r.addTable(t1);
		r.addTable(t2);
		r.addTable(t3);
		r.addTable(t4);
		r.addTable(t5);
		r.addTable(t6);
		r.addTable(t7);
		r.addTable(t8);

		Menu padThai = new Menu("Pad Thai", 60, "Main");
		Menu tomYum = new Menu("Tom Yum", 120, "Soup");
		Menu greenCurry = new Menu("Green Curry", 90, "Main");
		Menu friedRice = new Menu("Fried Rice", 55, "Main");
		Menu padKraPao = new Menu("Pad Kra Pao", 65, "Main");
		Menu tomKhaGai = new Menu("Tom Kha Gai", 110, "Soup");
		Menu somTum = new Menu("Som Tum", 50, "Salad");
		Menu springRolls = new Menu("Spring Rolls", 70, "Appetizer");
		Menu chickenSatay = new Menu("Chicken Satay", 80, "Appetizer");
		Menu mangoStickyRice = new Menu("Mango Sticky Rice", 100, "Dessert");
		Menu coconutIceCream = new Menu("Coconut Ice Cream", 50, "Dessert");
		Menu buaLoy = new Menu("Bua Loy", 45, "Dessert");
		Menu khanomKrok = new Menu("Khanom Krok", 40, "Dessert");
		
		padThai.showMenu();
		friedRice.showMenu();
		
		Order od1 = new Order(1, "12:10");
		od1.addItem(padThai, 2);
		od1.addItem(friedRice, 1);
		
		Order od2 = new Order(2, "12:49");
		od2.addItem(khanomKrok, 3);
		
		t1.addOrder(od2);
		t1.addOrder(od1);
		t1.showTable();
		
		Order od3 = new Order(3, "12:55");
		od3.addItem(tomYum, 1);
		od3.addItem(greenCurry, 1);
		od3.addItem(padKraPao, 2);
		od3.addItem(somTum, 2);
		
		t8.addOrder(od3);
		t8.showTable();
		od3.showOrder();
		
		Order od4 = new Order(4, "13:15");
		od4.addItem(tomKhaGai, 1);
		od4.addItem(springRolls, 2);
		od4.addItem(chickenSatay, 1);
		
		Order od5 = new Order(5, "13:54");
		od5.addItem(mangoStickyRice, 2);
		od5.addItem(coconutIceCream, 1);
		od5.addItem(buaLoy, 1);
		
		t5.addOrder(od5);
		t5.addOrder(od4);
		t5.showTable();
		
		r.showAllTables();
	}

}
