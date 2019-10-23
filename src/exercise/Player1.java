package exercise;

import java.util.ArrayList;

import framework.RWT.RWTVirtualController;
import framework.game2D.Sprite;

public class Player1 extends BasePeople {

	ExerciseGame exerciseGame;

	public Player1(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition, RWTVirtualController fvirtualController, ExerciseGame fexerciseGame) {
		super(fimage, fsize, fradian, fposition);
		super.SetController(new Player1Controller(fvirtualController));
		super.SetParameter(new ActorParameter(10, 10, 10, 10, 10));
		exerciseGame = fexerciseGame;
	}

	public void Run() {
		super.GetPeopleDamaged().Run(this, exerciseGame.enemies, new ArrayList<BaseObject>() {});
		super.GetController().Run(this, exerciseGame);
	}

}
