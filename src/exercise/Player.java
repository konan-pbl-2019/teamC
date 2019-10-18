package exercise;

import java.util.ArrayList;

import framework.game2D.Sprite;

public class Player extends BasePeople {

	public Player(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition) {
		super(fimage, fsize, fradian, fposition);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void Run() {
		super.peopleDamaged.Run(this, new ArrayList<BasePeople>() {}, new ArrayList<BaseObject>() {});

	}

}
