import java.awt.Frame;

public class CellTest {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setSize(500, 200); //using
		f.setTitle("MyNotepad");
		f.setLocation(250, 50);
		f.setVisible(true);
		
		Cell cell1 = new Cell("A",1,"50");
		Cell cell2 = new Cell("A",2,"60");
		Cell cell3 = new Cell("A",3,"70");
		Cell cell4 = new Cell("A",4,"80");
		Cell cell5 = new Cell("A",5,"90");
		Cell cell6 = new Cell();
		cell6.setCell("B", 1, "67");
		
		cell1.printCell();
		cell2.printCell();
		cell3.printCell();
		cell4.printCell();
		cell5.printCell();
		cell6.printCell();
	}
}

class Cell
{
	String columnName;
	int rowNumber;
	String cellValue;
	
	Cell() {
		System.out.println("explicit no-arg constructor....");
	}
	
	Cell(String col, int row, String value) {
		System.out.println("explicit fully-parameterized constructor....");
		columnName = col;
		rowNumber = row;
		cellValue = value;
	}
	
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