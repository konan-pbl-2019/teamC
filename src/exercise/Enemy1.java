package exercise;

import framework.game2D.Sprite;

public class Enemy1 extends BasePeople {

	public Enemy1(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition) {
		super(fimage, fsize, fradian, fposition);
		super.SetController(new EnemyController());
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	public void Run() {
		//super.GetController().Run(this, ExerciseGame exerciseGame);
	}

}
