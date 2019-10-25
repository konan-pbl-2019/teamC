package exercise;

import java.util.ArrayList;

import framework.game2D.Sprite;

public class Knife1 extends BaseObject {

	private boolean isInit = false;
	ExerciseGame exerciseGame;
	ArrayList<BasePeople> opponentPeoples = new ArrayList<BasePeople>();
	public Timer timer = new Timer();

	public Knife1(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition, ExerciseGame fexerciseGame) {
		super(fimage, fsize, fradian, fposition);
		super.SetParameter(new ActorParameter(10, 10, 10, 10, 10));
		exerciseGame = fexerciseGame;
		timer.SetTimeOut(10);
	}

	private void init() {
		// 攻撃されるプレイヤー、オブジェクトを定義
		//opponentPeoples = exerciseGame.enemies;

		isInit = true;
	}

	public void Run() {
		if(isInit == false)init();
		timer.IncreaseByOne();
		if(timer.IsTimeOver()) {
			exerciseGame.thisUniverse.displace(GetImage());
			super.GetParameter().SetHp(0);
		}
		//↓動かないので削除
		//super.GetController().Run(this);
		//↓攻撃されないので削除
		//super.GetPeopleDamaged().Run(this, opponentPeoples, new ArrayList<BaseObject>() {});
	}

}
