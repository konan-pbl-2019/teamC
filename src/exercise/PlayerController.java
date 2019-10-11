package exercise;

import framework.RWT.RWTVirtualController;

public class PlayerController {
	public void Run(RWTVirtualController virtualController) {
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
