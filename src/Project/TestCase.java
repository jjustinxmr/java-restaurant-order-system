package Project;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCase {

    // 1.Order.addItem()
    @Test
    void addSameMenuTwice() {
        Order order = new Order(1, "10:00");
        Menu padThai = new Menu("Pad Thai", 60, "Main");
        order.addItem(padThai, 2);
        order.addItem(padThai, 3);
        assertEquals(1, order.getOrderItems().size());
        assertEquals(5, order.findItem("Pad Thai").getQuantity());
        assertEquals(300.0, order.getTotalPrice());
    }

    @Test
    void addItemWithZeroQuantity() {
        Order order = new Order(1, "10:00");
        Menu padThai = new Menu("Pad Thai", 60, "Main");
        boolean result = order.addItem(padThai, 0);
        assertEquals(false, result);
    }
    
    @Test
    void addItemWithOneQuantity() {
    	Order order = new Order(1, "10:00");
    	Menu padThai = new Menu("Pad Thai", 60, "Main");
    	order.addItem(padThai, 1);
    	assertEquals(1, order.findItem("Pad Thai").getQuantity());
    }
    
    @Test
    void addItemWithMinusFiveQuantity() {
        Order order = new Order(1, "10:00");
        Menu padThai = new Menu("Pad Thai", 60, "Main");
        boolean result = order.addItem(padThai, -5);
        assertEquals(false, result);
    }
    
    @Test
    void addItemWithNullMenu() {
        Order order = new Order(1, "10:00");
        boolean result = order.addItem(null, 2);
        assertEquals(false, result);
    }
    
    // 2.Order.removeItem()
    @Test
    void removeItem() {
        Order order = new Order(1, "10:00");
        Menu padThai = new Menu("Pad Thai", 60, "Main");
        Menu tomYum = new Menu("Tom Yum", 120, "Main");
        order.addItem(padThai, 2);
        order.addItem(tomYum ,1);
        boolean result = order.removeItem("tom yum");
        assertEquals(true, result);
        assertEquals(120.0, order.getTotalPrice());
    }
    
    @Test
    void removeItemToNull() {
        Order order = new Order(1, "10:00");
        Menu padThai = new Menu("Pad Thai", 60, "Main");
        order.addItem(padThai, 2);
        boolean result = order.removeItem("pad thai");
        assertEquals(true, result);
        assertEquals(0, order.getTotalPrice());
    }
    
    @Test
    void removeItemTwice() {
        Order order = new Order(1, "10:00");
        Menu padThai = new Menu("Pad Thai", 60, "Main");
        order.addItem(padThai, 2);
        order.removeItem("pad thai");
        boolean result = order.removeItem("pad thai");
        assertEquals(false, result);
        assertEquals(0, order.getTotalPrice());
    }

    @Test
    void removeNonItem() {
        Order order = new Order(1, "10:00");
        Menu padThai = new Menu("Pad Thai", 60, "Main");
        order.addItem(padThai, 1);
        boolean result = order.removeItem("Green Curry");
        assertEquals(false, result);
        assertEquals(60, order.getTotalPrice());
    }
    
    @Test
    void removeItemWithNullMenu() {
        Order order = new Order(1, "10:00");
        boolean result = order.removeItem(null);
        assertEquals(false, result);
    }

    // 3.Table.addOrder()
    @Test
    void addOrderToTable() {
    	Table table = new Table(1, 4);
    	Order order = new Order(1, "10:00");
    	Menu padThai = new Menu("Pad thai", 60, "Main");
    	Menu TomYum = new Menu("Tom Yum", 120, "Main");
    	order.addItem(padThai, 2);
    	order.addItem(TomYum, 1);
    	boolean result = table.addOrder(order);
    	assertEquals(true, result);
    	assertEquals(1, table.getOrders().size());
    	
    }
    
    @Test
    void addTwoOrderToTable() {
    	Table table = new Table(1, 4);
    	Order order = new Order(1, "10:00");
    	Order order2 = new Order(2, "10:30");
    	Menu padThai = new Menu("Pad thai", 60, "Main");
    	Menu TomYum = new Menu("Tom Yum", 120, "Main");
    	order.addItem(padThai, 2);
    	order.addItem(TomYum, 1);
    	order2.addItem(padThai, 1);
    	boolean result = table.addOrder(order);
    	boolean result2 = table.addOrder(order2);
    	assertEquals(true, result);
    	assertEquals(true, result2);
    	assertEquals(2, table.getOrders().size());
    	
    }
    
    @Test
    void addOneOrderItemToTable() {
    	Table table = new Table(1, 4);
    	Order order = new Order(1, "10:00");
    	Menu padThai = new Menu("Pad thai", 60, "Main");
    	order.addItem(padThai, 1);
    	boolean result = table.addOrder(order);
    	assertEquals(true, result);
    	assertEquals(1, table.getOrders().size());
    	
    }
    
    @Test
    void addEmptyOrderToTable() {
        Table table = new Table(1, 4);
        Order order = new Order(1, "10:00");
        boolean result = table.addOrder(order);
        assertEquals(false, result);
        assertEquals(0, table.getOrders().size());
    }

    @Test
    void addNullToTable() {
    	Table table = new Table(1, 4);
    	boolean result = table.addOrder(null);
    	assertEquals(false, result);
    	assertEquals(0, table.getOrders().size());
    }
    
    @Test
    void addAndRemoveOrderItemToTable() {
    	Table table = new Table(1, 4);
    	Order order = new Order(1, "10:00");
    	Menu padThai = new Menu("Pad thai", 60, "Main");
    	order.addItem(padThai, 1);
    	order.removeItem("pad thai");
    	boolean result = table.addOrder(order);
    	assertEquals(false, result);
    	assertEquals(0, table.getOrders().size());
    	
    }
    
    // 4.Restaurant.addTable()
    @Test
    void addNewTable() {
        Restaurant r = new Restaurant("Baan Suan");
        Table table = new Table(1, 4);
        boolean result = r.addTable(table);
        assertEquals(true, result);
        assertEquals(1, r.getTables().size());
    }
    
    @Test
    void addTwoTable() {
        Restaurant r = new Restaurant("Baan Suan");
        Table table = new Table(1, 4);
        Table table2 = new Table(2, 6);
        boolean result = r.addTable(table);
        boolean result2 = r.addTable(table2);
        assertEquals(true, result);
        assertEquals(true, result2);
        assertEquals(2, r.getTables().size());
    }
    
    @Test
    void addDuplicateTableNumber() {
        Restaurant r = new Restaurant("Baan Suan");
        Table table = new Table(1, 4);
        r.addTable(table);
        boolean result = r.addTable(table);
        assertEquals(false, result);
        assertEquals(1, r.getTables().size());
    }
    
    @Test
    void addSameTable() {
        Restaurant r = new Restaurant("Baan Suan");
        Table table = new Table(1, 4);
        Table table2 = new Table(2, 6);
        Table table3 = new Table(3, 4);
        r.addTable(table);
        r.addTable(table2);
        r.addTable(table3);
        boolean result = r.addTable(table3);
        assertEquals(false, result);
        assertEquals(3, r.getTables().size());
    }
    
    @Test
    void addNullTable() {
    	Restaurant r = new Restaurant("Baan Suan");
    	boolean result = r.addTable(null);
    	assertEquals(false, result);
    	assertEquals(0, r.getTables().size());
    }
}