
package exercise;

import java.util.ArrayList;

import framework.game2D.Sprite;

public class Enemyspeed extends BasePeople {

	private boolean isInit = false;
	ExerciseGame exerciseGame;
	ArrayList<BasePeople> opponentPeoples = new ArrayList<BasePeople>();
	ArrayList<BaseObject> opponentObjects = new ArrayList<BaseObject>();

	public Enemyspeed(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition, ExerciseGame fexerciseGame) {
		super(fimage, fsize, fradian, fposition);
		super.SetController(new EnemyController());
		super.SetParameter(new ActorParameter(10, 10, 10, 10, 20));
		exerciseGame = fexerciseGame;
	}

	private void init() {
		// 攻撃されるプレイヤー、オブジェクトを定義
		opponentPeoples.add(exerciseGame.shelter);
		opponentObjects = exerciseGame.Knifes;

		isInit = true;
	}

	public void Run() {
		if(isInit == false)init();
		super.GetController().Run(this);
		super.GetPeopleDamaged().Run(this, opponentPeoples, opponentObjects);
	}

}
