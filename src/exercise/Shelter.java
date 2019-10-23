package exercise;

import java.util.ArrayList;

import framework.game2D.Position2D;
import framework.game2D.Sprite;

public class Shelter extends BasePeople {


	ExerciseGame exerciseGame;

	public Shelter(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition, ExerciseGame fexerciseGame) {
		super(fimage, fsize, fradian, fposition);
		super.SetParameter(new ActorParameter(10, 10, 0, 10, 0));
		exerciseGame = fexerciseGame;
	}

	public void Run() {
		super.GetPeopleDamaged().Run(this, exerciseGame.enemies, new ArrayList<BaseObject>() {});
		GetImage().setPosition(new Position2D(0, 0));
	}

}
