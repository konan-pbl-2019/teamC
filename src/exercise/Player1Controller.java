package exercise;

import framework.RWT.RWTVirtualController;

public class Player1Controller implements IController{
	RWTVirtualController virtualController;
	public Player1Controller(RWTVirtualController fvirtualController) {
		virtualController = fvirtualController;
	}
	public void Run(BasePeople people) {

	}
	public void Run2(BasePeople people, ExerciseGame exerciseGame) {
		if (virtualController.isKeyDown(0, RWTVirtualController.RIGHT)) {
			people.GetImage().moveRight(3);
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.LEFT)) {
			people.GetImage().moveLeft(3);
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.UP)) {
			people.GetImage().moveUp(3);
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.DOWN)) {
			people.GetImage().moveDown(3);
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.TURN_RIGHT)) {
			//people.GetImage().getTransformGroupToPlace().set
			people.TurnRight();
			System.out.println("TURN_RIGHT");
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.TURN_LEFT)) {
			people.TurnLeft();
			System.out.println("TURN_LEFT");
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.ATTACK_WEAPON)) {
			people.Attack(exerciseGame);
			System.out.println("ATTACK_WEAPON");
		}
		else {
			people.GetTimer().Reset();
			people.GetTimer().SetTimeOut(0);
		}
		if (virtualController.isKeyDown(0, RWTVirtualController.USE_ITEM)) {
			System.out.println("USE_ITEM");
		}
	}
}
