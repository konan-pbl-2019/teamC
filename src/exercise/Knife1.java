package exercise;

import java.util.ArrayList;

import framework.game2D.Sprite;

public class Knife1 extends BaseObject {

	private boolean isInit = false;
	ExerciseGame exerciseGame;
	ArrayList<BasePeople> opponentPeoples = new ArrayList<BasePeople>();

	public Knife1(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition, ExerciseGame fexerciseGame) {
		super(fimage, fsize, fradian, fposition);
		super.SetParameter(new ActorParameter(10, 10, 10, 10, 10));
		exerciseGame = fexerciseGame;
	}

	private void init() {
		// �U�������v���C���[�A�I�u�W�F�N�g���`
		//opponentPeoples = exerciseGame.enemies;

		isInit = true;
	}

	public void Run() {
		if(isInit == false)init();
		//�������Ȃ��̂ō폜
		//super.GetController().Run(this);
		//���U������Ȃ��̂ō폜
		//super.GetPeopleDamaged().Run(this, opponentPeoples, new ArrayList<BaseObject>() {});
	}

}
