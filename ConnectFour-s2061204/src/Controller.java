/**
 * This file is to be completed by you.
 *
 * @author <Please enter your matriculation number, not your name>
 */
public final class Controller
{
	private final Model model;
	private final TextView view;
	
	public Controller(Model model, TextView view)
	{
		this.model = model;
		this.view = view;
	}

	public void startSession() {
		Boolean game = true;
		while (game) {
			view.displayNewGameMessage();
			model.setDimensions();
			while (!(model.win)) {
				System.out.println("player " + model.userTurn + "'s move:");
				model.makeMove(InputUtil.readIntFromUser());
				if (!(model.win)) {
					view.displayBoard(model);
				}
			}
			System.out.println("Player " + model.userTurn + " wins!\nNew game? [Y/N]:");
			if (InputUtil.readCharFromUser() == 'Y') {
				model.restart();
			} else {
				game = false;
			}
		}
		System.out.println("Thanks for playing!");
	}
}
