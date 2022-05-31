
public class CellTest {
	public static void main(String[] args) {

		Cell cell1 = new Cell();
		Cell cell2 = new Cell();
		Cell cell3 = new Cell();
		Cell cell4 = new Cell();
		Cell cell5 = new Cell();
		
		cell1.setCell("A",1,"50");
		cell2.setCell("A",2,"60");
		cell3.setCell("A",3,"70");
		cell4.setCell("A",4,"80");
		cell5.setCell("A",5,"90");
		
		cell1.printCell();
		cell2.printCell();
		cell3.printCell();
		cell4.printCell();
		cell5.printCell();
	}
}

class Cell
{
	String columnName;
	int rowNumber;
	String cellValue;
	
	void setCell(String col, int row, String value) {
		columnName = col;
		rowNumber = row;
		cellValue = value;
	}
	void printCell() {
		System.out.println(columnName+rowNumber+"="+cellValue);
	}
	void setValue(String newValue) {
		cellValue = newValue;
	}
}