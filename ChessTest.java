
public class ChessTest {
	public static void main(String[] args) {
		//Doctor x  = new Surgeon();
		
		//Chess c = new GraphicalChess();
		//c.moveBishop();
	}
}
/*
1 	ROOK  KNIGHT  BISHOP  KING  QUEEN  BISHOP  KNIGHT  ROOK
2 	PAWN  PAWN    PAWN	  PAWN  PAWN   PAWN    PAWN    PAWN
3
4
5
6 	
7 	PAWN  PAWN    PAWN	  PAWN  PAWN   PAWN    PAWN    PAWN
8 	ROOK  KNIGHT  BISHOP  KING  QUEEN  BISHOP  KNIGHT  ROOK
 	1	  2		  3		  4     5      6       7       8
 
 
 */
 class Chess // Vineet - 3months
{
	final int TOTAL_SQUARE=64;
	final void moveBishop() { //math logic here 
		System.out.println("cross bi-direction...of bishop...doing...math logic....");
		//math calculations written here
	}
	final void moveQueen() {
		System.out.println("horizonal/vertical/cross...bi-directional....math logic....");
	}
}
class GraphicalChess extends Chess //Karan
{
	void moveMyBishop() {
		super.moveBishop(); //using the math logic +
		System.out.println("my math logic  + graphically moving the bishop...in any direction.......");
	}
}
