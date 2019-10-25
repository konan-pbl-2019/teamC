package exercise;

import java.util.ArrayList;

import framework.RWT.RWTVirtualController;
import framework.game2D.Sprite;

public class Player1 extends BasePeople {

	private boolean isInit = false;
	ExerciseGame exerciseGame;
	ArrayList<BasePeople> opponentPeoples = new ArrayList<BasePeople>();

	public Player1(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition, RWTVirtualController fvirtualController, ExerciseGame fexerciseGame) {
		super(fimage, fsize, fradian, fposition);
		super.SetController(new Player1Controller(fvirtualController));
		super.SetParameter(new ActorParameter(1000, 1000, 10, 10, 10));
		exerciseGame = fexerciseGame;
	}
	private void init() {
		// �U�������v���C���[�A�I�u�W�F�N�g���`
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
