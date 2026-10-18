package Project;

import java.util.ArrayList;
import java.util.List;

public class Table {
	private int tableNumber;
    private int seats;
    private List<Order> orders = new ArrayList<>();

	public Table() {
	}
	
	public Table(int tableNumber, int seats) {
        this.tableNumber = tableNumber;
        this.seats = seats;
    }

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	/*method9*/
	public boolean addOrder(Order order) {
        if (order == null || order.getOrderItems().isEmpty()) {
            return false;
        }
        orders.add(order);
        return true;
    }
	
	/*method10*/
	public double calculateTableTotal() {
        double total = 0;
        for (Order order : orders) {
            total += order.getTotalPrice();
        }
        return total;
    }
	
	/*method11*/
	public void showTable() {
        System.out.println("Table " + tableNumber + " (" + seats + " Seat, " + orders.size() + " Order) Total " + calculateTableTotal() + " Bath");
    }

}
