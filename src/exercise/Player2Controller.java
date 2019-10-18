package exercise;

import framework.RWT.RWTVirtualController;

public class Player2Controller {

	RWTVirtualController virtualController;
	public Player2Controller(RWTVirtualController fvirtualController) {
		virtualController = fvirtualController;
	}

	public void Run(RWTVirtualController virtualController, ExerciseGame exerciseGame) {
		if (virtualController.isKeyDown(1, RWTVirtualController.RIGHT2)) {
			System.out.println("RIGHT2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.LEFT2)) {
			System.out.println("LEFT2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.UP2)) {
			System.out.println("UP2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.DOWN2)) {
			System.out.println("DOWN2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.TURN_RIGHT2)) {
			System.out.println("TURN_RIGHT2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.TURN_LEFT2)) {
			System.out.println("TURN_LEFT2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.ATTACK_WEAPON2)) {
			System.out.println("ATTACK_WEAPON2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.USE_ITEM2)) {
			System.out.println("USE_ITEM2");
		}
	}
}
