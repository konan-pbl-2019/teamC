package exercise;

import framework.game2D.Sprite;

public class Enemy1 extends BasePeople {

	public Enemy1(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition) {
		super(fimage, fsize, fradian, fposition);
		super.SetController(new EnemyController());

	}

	public void Run() {
		super.GetController().Run(this);
	}

}
