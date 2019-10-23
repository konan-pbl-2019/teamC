package exercise;

import java.util.ArrayList;

import framework.game2D.Sprite;

public class Player extends BasePeople {

	public Player(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition) {
		super(fimage, fsize, fradian, fposition);
	}

	public void Run() {
		super.GetPeopleDamaged().Run(this, new ArrayList<BasePeople>() {}, new ArrayList<BaseObject>() {});
	}

}
