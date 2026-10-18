package Project;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private String name;
    private List<Table> tables = new ArrayList<>();

	public Restaurant() {
	}
	
	public Restaurant(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Table> getTables() {
		return tables;
	}

	public void setTables(List<Table> tables) {
		this.tables = tables;
	}
	
	/*method12*/
	public Table findTable(int tableNumber) {
        for (Table t : tables) {
            if (t.getTableNumber() == tableNumber) {
                return t;
            }
        }
        return null;
    }
	
	/*method13*/
	public boolean addTable(Table table) {
        if (table == null || findTable(table.getTableNumber()) != null) {
            return false;
        }
        tables.add(table);
        return true;
    }
	
	/*method14*/
	public double calculateRestaurantTotal() {
        double total = 0;
        for (Table t : tables) {
            total += t.calculateTableTotal();
        }
        return total;
    }
	
	/*method15*/
	public void showAllTables() {
        System.out.println("=== " + name + " ===");
        for (Table t : tables) {
            t.showTable();
        }
        System.out.println("Total store sales: " + calculateRestaurantTotal() + " Bath");
    }

}
