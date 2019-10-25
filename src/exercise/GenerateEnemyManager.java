package exercise;

import java.util.Random;

import framework.game2D.Position2D;
import framework.game2D.Sprite;
import framework.model3D.Universe;

public class GenerateEnemyManager {
	private int stage1=2000,stage2=4800,stage3=13000,stage4;
	private float topY = 10;
	private float bottomY;
	private int randomenemyselect;
	private float randomnumx;
	private double randomnumy;
	private int randomnumside;
	private int randomnumheight;
	private int maxEnemy = 20;
	Random randomx = new Random(-1);
	Random randomy = new Random();
	Random randomside =new Random();
	Random randomheight =new Random();
	Random randomenemy = new Random();
	Universe universe;
	ExerciseGame exerciseGame;
	Timer timer = new Timer();
	Timer timercount =new Timer();
	Timer timerdiflevel=new Timer();
	Timer timerdiflevel2=new Timer();
	Timer timerdiflevel3=new Timer();
	//randomx.nextInt(-20);
	public GenerateEnemyManager(Universe funiverse, ExerciseGame fexerciseGame) {
		universe = funiverse;
		exerciseGame = fexerciseGame;
		timer.SetTimeOut(300);
	}
	public void Run() {
		timer.IncreaseByOne();
		timercount.IncreaseByOne();
		randomnumx=randomx.nextInt(3);
		randomnumy=randomy.nextDouble();
		randomnumside=randomside.nextInt(5);
		randomnumheight=randomheight.nextInt(5);
		randomenemyselect=randomenemy.nextInt();
		System.out.println(randomnumx);
		if(timercount.GetTimeElapsed()<=stage1) {
			if(randomnumx>1) {
				if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
					System.out.println("num="+exerciseGame.enemies.size());
					BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\franken.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
					enemy.Display(universe);
					exerciseGame.enemies.add(enemy);
					enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
					timer.Reset();
				}
			}else if(randomnumx<1) {
				if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
					System.out.println(exerciseGame.enemies.size());
					BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\franken.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
					enemy.Display(universe);
					exerciseGame.enemies.add(enemy);
					enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
					timer.Reset();
				}
			}
		}else if(timercount.GetTimeElapsed()<=stage2) {
			System.out.println("asdfadsf"+stage2);
			System.out.println(stage3);
			timerdiflevel.IncreaseByOne();
			if(randomenemyselect<=80-(int)timerdiflevel.GetTimeElapsed()) {
				if(randomnumx>1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println("num="+exerciseGame.enemies.size());
						BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\franken.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}else if(randomnumx<1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println(exerciseGame.enemies.size());
						BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\franken.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}
			}else {
				if(randomnumx>1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println("num="+exerciseGame.enemies.size());
						BasePeople enemy = new Enemyspeed(new Sprite("data\\imagesTeamC\\bone_ape.png"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}else if(randomnumx<1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println(exerciseGame.enemies.size());
						BasePeople enemy = new Enemyspeed(new Sprite("data\\imagesTeamC\\bone_ape.png"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}
			}
		}else if(timercount.GetTimeElapsed()<=stage3) {
			System.out.println("stage3");
			timerdiflevel2.IncreaseByOne();
			if(randomenemyselect<=40-(int)(timerdiflevel2.GetTimeElapsed()*(2/3))) {
				if(randomnumx>1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println("num="+exerciseGame.enemies.size());
						BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\franken.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}else if(randomnumx<1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println(exerciseGame.enemies.size());
						BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\franken.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}
			}else if(randomenemyselect<=80-(int)(timerdiflevel2.GetTimeElapsed()*(1/3))) {
				if(randomnumx>1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println("num="+exerciseGame.enemies.size());
						BasePeople enemy = new Enemyspeed(new Sprite("data\\imagesTeamC\\bone_ape.png"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}else if(randomnumx<1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println(exerciseGame.enemies.size());
						BasePeople enemy = new Enemyspeed(new Sprite("data\\imagesTeamC\\bone_ape.png"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}
			}else {
				if(randomnumx>1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println("num="+exerciseGame.enemies.size());
						BasePeople enemy = new Enemypower(new Sprite("data\\imagesTeamC\\zombie.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}else if(randomnumx<1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println(exerciseGame.enemies.size());
						BasePeople enemy = new Enemypower(new Sprite("data\\imagesTeamC\\zombie.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}
			}
		}else if(timercount.GetTimeElapsed()>stage3) {
			timerdiflevel3.IncreaseByOne();
			if(randomenemyselect<=50-(int)timerdiflevel2.GetTimeElapsed()) {
				if(randomnumx>1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println("num="+exerciseGame.enemies.size());
						BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\knife.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}else if(randomnumx<1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println(exerciseGame.enemies.size());
						BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\knife.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}
			}else if(randomenemyselect<=80-(int)timerdiflevel2.GetTimeElapsed()) {
				if(randomnumx>1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println("num="+exerciseGame.enemies.size());
						BasePeople enemy = new Enemyspeed(new Sprite("data\\imagesTeamC\\knife.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}else if(randomnumx<1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println(exerciseGame.enemies.size());
						BasePeople enemy = new Enemyspeed(new Sprite("data\\imagesTeamC\\knife.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}
			}else if(randomenemyselect<=95-(int)timerdiflevel2.GetTimeElapsed()){
				if(randomnumx>1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println("num="+exerciseGame.enemies.size());
						BasePeople enemy = new Enemypower(new Sprite("data\\imagesTeamC\\knife.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}else if(randomnumx<1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println(exerciseGame.enemies.size());
						BasePeople enemy = new Enemypower(new Sprite("data\\imagesTeamC\\knife.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}
			}else {
				if(randomnumx>1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println("num="+exerciseGame.enemies.size());
						BasePeople enemy = new Enemyboss(new Sprite("data\\imagesTeamC\\knife.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}else if(randomnumx<1) {
					if(timer.IsTimeOver() && exerciseGame.enemies.size() < maxEnemy) {
						System.out.println(exerciseGame.enemies.size());
						BasePeople enemy = new Enemyboss(new Sprite("data\\imagesTeamC\\knife.gif"), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
						enemy.Display(universe);
						exerciseGame.enemies.add(enemy);
						enemy.GetImage().setPosition(new Position2D((randomnumx-1)*20, (randomnumy-0.5)*(40+randomnumheight)));
						timer.Reset();
					}
				}
			}
		}
	}
}
