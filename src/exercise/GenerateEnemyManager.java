package exercise;

import java.util.Random;

import framework.game2D.Position2D;
import framework.game2D.Sprite;
import framework.model3D.Universe;

public class GenerateEnemyManager {
	private float topY = 10;
	private float bottomY;
	public int randamnam;
	Universe universe;
	ExerciseGame exerciseGame;
	Timer timer = new Timer();
	Random randomx = new Random();
	randomx.nextInt(-20);
	public GenerateEnemyManager(Universe funiverse, ExerciseGame fexerciseGame) {
		universe = funiverse;
		exerciseGame = fexerciseGame;
		timer.SetTimeOut(60);
	}
	public void Run() {
		timer.IncreaseByOne();
		if(timer.IsTimeOver()) {
			BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\knife.png"), new Vector2(1,1), 0, new Vector2(-10,0));
			enemy.Display(universe);
			exerciseGame.enemies.add(enemy);
			enemy.GetImage().setPosition(new Position2D(randomtop.nextInt(-20), 10));
			timer.Reset();
		}
	}
}
