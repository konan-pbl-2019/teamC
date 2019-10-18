package exercise;

import java.util.Random;

import framework.game2D.Position2D;
import framework.game2D.Sprite;
import framework.model3D.Universe;

public class GenerateEnemyManager {
	private float topY = 10;
	private float bottomY;
	private float randomnumx;
	private double randomnumy;
	private int randomnumside;
	private int randomnumheight;
	private int maxEnemy = 20;
	Random randomx = new Random(-1);
	Random randomy = new Random();
	Random randomside =new Random();
	Random randomheight =new Random();
	Universe universe;
	ExerciseGame exerciseGame;
	Timer timer = new Timer();
//
	public GenerateEnemyManager(Universe funiverse, ExerciseGame fexerciseGame) {
		universe = funiverse;
		exerciseGame = fexerciseGame;
		timer.SetTimeOut(300);
	}
	public void Run() {
		timer.IncreaseByOne();
		randomnumx=randomx.nextInt(3);
		randomnumy=randomy.nextDouble();
		randomnumside=randomside.nextInt(5);
		randomnumheight=randomheight.nextInt(5);
		System.out.println(randomnumx);
		if(randomnumx>1) {
			if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
				System.out.println("num="+exerciseGame.enemies.size());
				BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\knife.png"), new Vector2(1,1), 0, new Vector2(0,0));
				enemy.Display(universe);
				exerciseGame.enemies.add(enemy);
				enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
				timer.Reset();
			}
		}else if(randomnumx<1) {
			if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
				System.out.println(exerciseGame.enemies.size());
				BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\knife.png"), new Vector2(1,1), 0, new Vector2(0,0));
				enemy.Display(universe);
				exerciseGame.enemies.add(enemy);
				enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
				timer.Reset();
			}
		}
	}
}
