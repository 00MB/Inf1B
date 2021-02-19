/**
 * This file is to be completed by you.
 *
 * @author <Please enter your matriculation number, not your name>
 */
public final class Model
{
	// ===========================================================================
	// ================================ CONSTANTS ================================
	// ===========================================================================
	// The most common version of Connect Four has 7 rows and 6 columns.
	public static final int DEFAULT_NR_ROWS = 6;
	public static final int DEFAULT_NR_COLS = 7;
	
	// ========================================================================
	// ================================ FIELDS ================================
	// ========================================================================
	// The size of the board.
	private int nrRows;
	private int nrCols;
	public int nrNeededForWin;
	public int userTurn;
	public boolean win;
	public String[][] board;

	// =============================================================================
	// ================================ CONSTRUCTOR ================================
	// =============================================================================
	public Model()
	{
		// Initialise the board size to its default values.
		nrRows = DEFAULT_NR_ROWS;
		nrCols = DEFAULT_NR_COLS;
		nrNeededForWin = 4;
		userTurn = 1;
		win = false;
		board = new String[nrCols][nrRows];
	}
	
	// ====================================================================================
	// ================================ MODEL INTERACTIONS ================================
	// ====================================================================================
	public boolean isMoveValid(int move) {
		if ((move < 0) || (move > nrCols) || (getRow(move) > nrRows)) {
			return false;
		}
		return true;
	}

	public boolean isBoardFull() {
		for (int row=nrRows; row > 0; row--) { // Loop for Rows 6 to 1
			for (int col = 0; col < nrCols; col++) { // Loop for each collum in the row
				if (board[col][row - 1] == null) { // If the square is empty
					return false;
				}
			}
		}
		return true;
	}

	public boolean isWin(int move) {
		if ((move == 0) || (isBoardFull())) {
			return true;
		}
		// horizontalCheck
		for (int j = 0; j<nrCols-3 ; j++ ){
			for (int i = 0; i<nrCols; i++){
				if (board[i][j] == "X" && board[i][j+1] == "X" && board[i][j+2] == "X" && board[i][j+3] == "X"){
					return true;
				} else if (board[i][j] == "O" && board[i][j+1] == "O" && board[i][j+2] == "O" && board[i][j+3] == "O") {
					return true;
				}
			}
		}
		// verticalCheck
		for (int i = 0; i<nrCols-3 ; i++ ){
			for (int j = 0; j<nrRows; j++){
				if (board[i][j] == "X" && board[i+1][j] == "X" && board[i+2][j] == "X" && board[i+3][j] == "X") {
					return true;
				} else if (board[i][j] == "O" && board[i+1][j] == "O" && board[i+2][j] == "O" && board[i+3][j] == "O") {
					return true;
				}
			}
		}
		// ascendingDiagonalCheck
		for (int i= 3; i<nrCols; i++){
			for (int j=0; j<nrRows- 3; j++){
				if (board[i][j] == "X" && board[i-1][j+1] == "X" && board[i-2][j+2] == "X" && board[i-3][j+3] == "X") {
					return true;
				} else if (board[i][j] == "O" && board[i-1][j+1] == "O" && board[i-2][j+2] == "O" && board[i-3][j+3] == "O") {
					return true;
				}
			}
		}
		// descendingDiagonalCheck
		for (int i= 3; i<nrCols; i++) {
			for (int j = 3; j < nrRows; j++) {
				if (board[i][j] == "X" && board[i - 1][j - 1] == "X" && board[i - 2][j - 2] == "X" && board[i - 3][j - 3] == "X") {
					return true;
				} else if (board[i][j] == "O" && board[i - 1][j - 1] == "O" && board[i - 2][j - 2] == "O" && board[i - 3][j - 3] == "O") {
					return true;
				}
			}
		}
		return false;
	}

	public int getRow(int move) {

		if (board[move - 1][nrRows - 1] != null) {
			return nrRows + 1;
		}
		int row = 1;
		while (board[move - 1][row - 1] != null) {
			row++;
		}
		return row;
	}

	public void makeMove(int move)
	{
		if (isWin(move)) {
			win = true;
		} else if (isMoveValid(move)) {
			if (userTurn == 1) {
				board[move - 1][getRow(move) - 1] = "X";
				userTurn++;
			} else {
				board[move - 1][getRow(move) - 1] = "O";
				userTurn--;
			}
		}
	}

	public void restart()
	{
		nrRows = DEFAULT_NR_ROWS;
		nrCols = DEFAULT_NR_COLS;
		userTurn = 1;
		win = false;
		board = new String[nrCols][nrRows];
	}

	public void setDimensions() {
		int rows = 0;
		int cols = 0;
		int neededForWin = 0;
		while (rows < 1) {
			System.out.print("Input the number of rows: ");
			rows = InputUtil.readIntFromUser();
		}
		nrRows = rows;
		while (cols < 1) {
			System.out.print("Input the number of columns: ");
			cols = InputUtil.readIntFromUser();
		}
		nrCols = cols;
		while ((neededForWin < 1) || !((neededForWin <= cols) && (neededForWin <= rows))) {
			System.out.print("Input the number of connected to win: ");
			neededForWin = InputUtil.readIntFromUser();
		}
		nrNeededForWin = neededForWin;
	}
	
	// =========================================================================
	// ================================ GETTERS ================================
	// =========================================================================
	public int getNrRows()
	{
		return nrRows;
	}
	
	public int getNrCols()
	{
		return nrCols;
	}
}
