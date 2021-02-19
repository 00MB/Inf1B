/**
 * This file is to be completed by you.
 *
 * @author <Please enter your matriculation number, not your name>
 */
public final class TextView
{
	public TextView()
	{
	
	}
	
	public final void displayNewGameMessage()
	{
		System.out.println("---- NEW GAME STARTED ---- \n Enter 0 to concede!\n");
	}
	
	public final int askForMove()
	{
		System.out.print("Select a free column: ");
		return InputUtil.readIntFromUser();
	}
	
	public final void displayBoard(Model model)
	{
		int nrRows = model.getNrRows();
		int nrCols = model.getNrCols();
		// Get your board representation.
		
		// This can be used to print a line between each row.
		// You may need to vary the length to fit your representation.
		String rowDivider = "-".repeat(2 * nrCols + 1);
		
		// A StringBuilder is used to assemble longer Strings more efficiently.
		StringBuilder sb = new StringBuilder();


		// You can add to the String using its append method.
		sb.append("\n"+rowDivider+"\n");
		for (int row=nrRows; row > 0; row--) { // Loop for Rows 6 to 1
			for (int col=0; col < nrCols; col++) { // Loop for each collum in the row
				if (model.board[col][row-1] == null) { // If the square is empty
					sb.append("| ");
				}
				else { // If the square contains a move
					sb.append("|"+model.board[col][row-1]);
				}
			}
			sb.append("|\n"+rowDivider+"\n");
		}
		
		// Then print out the assembled String.
		System.out.println(sb);
	}
}
