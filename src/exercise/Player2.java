package exercise;

import java.util.ArrayList;

import framework.RWT.RWTVirtualController;
import framework.game2D.Sprite;

public class Player2 extends BasePeople {

	private boolean isInit = false;
	ExerciseGame exerciseGame;
	ArrayList<BasePeople> opponentPeoples = new ArrayList<BasePeople>();

	public Player2(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition, RWTVirtualController fvirtualController, ExerciseGame fexerciseGame) {
		super(fimage, fsize, fradian, fposition);
		super.SetController(new Player2Controller(fvirtualController));
		super.SetParameter(new ActorParameter(10, 10, 10, 10, 10));
		exerciseGame = fexerciseGame;
	}
	private void init() {
		// 攻撃されるプレイヤー、オブジェクトを定義
		opponentPeoples = exerciseGame.enemies;
		opponentPeoples.add(exerciseGame.shelter);

		isInit = true;
	}

	public void Run() {
		if(isInit == false)init();
		super.GetPeopleDamaged().Run(this, opponentPeoples, new ArrayList<BaseObject>() {});
		super.GetController().Run2(this, exerciseGame);
	}

}
