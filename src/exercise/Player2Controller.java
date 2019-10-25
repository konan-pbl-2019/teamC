package exercise;

import framework.RWT.RWTVirtualController;

public class Player2Controller implements IController{
	RWTVirtualController virtualController;
	public Player2Controller(RWTVirtualController fvirtualController) {
		virtualController = fvirtualController;
	}
	public void Run(BasePeople people) {

	}

	public void Run2(BasePeople people, ExerciseGame exerciseGame) {
		if (virtualController.isKeyDown(1, RWTVirtualController.RIGHT2)) {
			people.MoveRight();
			System.out.println("RIGHT2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.LEFT2)) {
			people.MoveLeft();
			System.out.println("LEFT2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.UP2)) {
			people.MoveUp();
			System.out.println("UP2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.DOWN2)) {
			people.MoveDown();
			System.out.println("DOWN2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.TURN_RIGHT2)) {
			people.TurnRight();
			System.out.println("TURN_RIGHT2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.TURN_LEFT2)) {
			people.TurnLeft();
			System.out.println("TURN_LEFT2");
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.ATTACK_WEAPON2)) {
			people.Attack(exerciseGame);
			System.out.println("ATTACK_WEAPON2");
		}else {
			people.GetTimer().Reset();
			people.GetTimer().SetTimeOut(0);
		}
		if (virtualController.isKeyDown(1, RWTVirtualController.USE_ITEM2)) {
			System.out.println("USE_ITEM2");
		}
	}
}
