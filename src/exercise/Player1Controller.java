package exercise;

import framework.RWT.RWTVirtualController;

public class Player1Controller {
	public void Run(RWTVirtualController virtualController, BasePeople people) {
		if (virtualController.isKeyDown(0, RWTVirtualController.RIGHT)) {
			System.out.println("RIGHT");
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.LEFT)) {
			System.out.println("LEFT");
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.UP)) {
			System.out.println("UP");
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.DOWN)) {
			System.out.println("DOWN");
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.TURN_RIGHT)) {
			System.out.println("TURN_RIGHT");
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.TURN_LEFT)) {
			System.out.println("TURN_LEFT");
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.ATTACK_WEAPON)) {
			System.out.println("ATTACK_WEAPON");
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.USE_ITEM)) {
			System.out.println("USE_ITEM");
		}
	}
}
