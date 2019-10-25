package exercise;

import java.util.ArrayList;

import javax.media.j3d.AmbientLight;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Texture;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import com.sun.j3d.utils.image.TextureLoader;

import framework.RWT.RWTFrame3D;
import framework.RWT.RWTVirtualController;
import framework.game2D.Position2D;
import framework.game2D.Sprite;
import framework.gameMain.SimpleShootingGame;
import framework.model3D.BackgroundBox;
import framework.model3D.Universe;

public class ExerciseGame extends SimpleShootingGame {
	boolean isInit = false;
	Universe thisUniverse;
	Sprite myShip;
	private ArrayList<BaseObject>baseObject = new ArrayList<BaseObject>();
//	private Universe universe2;
	public ArrayList<BaseObject> objects = new ArrayList<BaseObject>();
	public ArrayList<BasePeople> enemies = new ArrayList<BasePeople>();
	public ArrayList<BasePeople> players = new ArrayList<BasePeople>();
	public ArrayList<BaseObject> Knifes = new ArrayList<BaseObject>();
	public BasePeople shelter;
	GenerateEnemyManager generateEnemyManager;
	@Override
	public void init(Universe universe) {
		thisUniverse = universe;
		// 蟷ｳ陦悟�画ｺ舌ｒ驟咲ｽｮ縺吶ｋ
        DirectionalLight dirlight = new DirectionalLight(
        		true,                           //蜈峨�ｮON/OFF
                new Color3f(1.0f, 1.0f, 1.0f),  //蜈峨�ｮ濶ｲ
                new Vector3f(0.0f, -1.0f, -0.5f) //蜈峨�ｮ譁ｹ蜷代�吶け繝医Ν
        );
        dirlight.setInfluencingBounds(new BoundingSphere(new Point3d(), 10000.0));
        universe.placeLight(dirlight);

		// 迺ｰ蠅�蜈峨ｒ驟咲ｽｮ縺吶ｋ
		AmbientLight amblight = new AmbientLight(new Color3f(0.5f, 0.5f, 0.5f));
		amblight.setInfluencingBounds(new BoundingSphere(new Point3d(), 10000.0));
		universe.placeLight(amblight);
		//buildSkyBox(universe);

		setViewRange(30, 30);
//		BaseObject guibar = new BaseObject(new Sprite("data\\ImagesTeamC\\knifeinv.png",20.0f,4.0f, -10), new Vector2(0,0), 0, new Vector2(0,-13));
//		guibar.Display(universe);

		// ---------------ui------------------

		BaseObject gui1P = new BaseObject(new Sprite("data\\ImagesTeamC\\1P.jpg"), new Vector2(10,10), 0, new Vector2(-13,-12));
		gui1P.Display(universe);
		BaseObject gui2P = new BaseObject(new Sprite("data\\ImagesTeamC\\2P1.jpg"), new Vector2(0,0), 0, new Vector2(2,-12));
		gui2P.Display(universe);

		BaseObject guiHP1base = new BaseObject(new Sprite("data\\ImagesTeamC\\zerohpgage.png", 3.0f, 0.5f), new Vector2(0,0), 0, new Vector2(-8.5f,-11.5f));
		guiHP1base.Display(universe);
		BaseObject guiHP1full = new BaseObject(new Sprite("data\\ImagesTeamC\\fullhpgage.png", 3.0f, 0.5f), new Vector2(0,0), 0, new Vector2(-8.5f,-11.5f));
		guiHP1full.Display(universe);
		guiHP1full.GetImage().SetScale(1.0f, 0.5f);

		BaseObject guiHP2base = new BaseObject(new Sprite("data\\ImagesTeamC\\zerohpgage.png", 3.0f, 0.5f), new Vector2(0,0), 0, new Vector2(6.5f,-11.5f));
		guiHP2base.Display(universe);
		BaseObject guiHP2full = new BaseObject(new Sprite("data\\ImagesTeamC\\fullhpgage.png", 3.0f, 0.5f), new Vector2(0,0), 0, new Vector2(6.5f,-11.5f));
		guiHP2full.Display(universe);
		guiHP2full.GetImage().SetScale(1.0f, 0.5f);

		BaseObject guiKnife1 = new BaseObject(new Sprite("data\\ImagesTeamC\\knifeinv.png", 1.0f, 1.3f), new Vector2(0,0), 0, new Vector2(-4.0f,-12));
		guiKnife1.Display(universe);
		BaseObject guiKnife2 = new BaseObject(new Sprite("data\\ImagesTeamC\\knifeinv.png", 1.0f, 1.3f), new Vector2(0,0), 0, new Vector2(11,-12));
		guiKnife2.Display(universe);




		//baseObject.add(guibar);
		baseObject.add(gui1P);
		baseObject.add(gui2P);
		baseObject.add(guiKnife1);
		baseObject.add(guiKnife2);
		baseObject.add(guiHP1base);
		baseObject.add(guiHP1full);
		baseObject.add(guiHP2base);
		baseObject.add(guiHP2full);

		// ---------------enemy------------------

		generateEnemyManager = new GenerateEnemyManager(universe, this);

		BasePeople enemy = new Enemy1(new Sprite("data\\imagesTeamC\\knife.jpg", 0.66f, 1.0f), new Vector2(1,1), 0, new Vector2(-10,0), this);
		enemy.Display(universe);
		enemy.GetImage().setPosition(new Position2D(-10, 0.1f));
		BasePeople enemy2 = new Enemy1(new Sprite("data\\imagesTeamC\\knife.gif", 0.66f, 1.0f), new Vector2(1,1), 0, new Vector2(-10,0), this);
		enemy2.Display(universe);
		enemy2.GetImage().setPosition(new Position2D(-20, -10));
		BasePeople enemy3 = new Enemy1(new Sprite("data\\imagesTeamC\\knife.gif", 0.66f, 1.0f), new Vector2(1,1), 0, new Vector2(-10,0), this);
		enemy3.Display(universe);
		enemy3.GetImage().setPosition(new Position2D(20, 1));
		BasePeople enemy4 = new Enemy1(new Sprite("data\\imagesTeamC\\knife.gif", 0.66f, 1.0f), new Vector2(1,1), 0, new Vector2(-10,0), this);
		enemy4.Display(universe);
		enemy4.GetImage().setPosition(new Position2D(20, 10));
		BasePeople enemy5 = new Enemy1(new Sprite("data\\imagesTeamC\\knife.gif", 0.66f, 1.0f), new Vector2(1,1), 0, new Vector2(-10,0), this);
		enemy5.Display(universe);
		enemy5.GetImage().setPosition(new Position2D(-20, 10));
		enemies.add(enemy);
		enemies.add(enemy2);
		enemies.add(enemy3);
		enemies.add(enemy4);
		enemies.add(enemy5);

		// ---------------shelter------------------
		shelter = new Shelter(new Sprite("data\\ImagesTeamC\\shelter.png",2.5f, 3.0f), new Vector2(0,0), 0, new Vector2(0,1), this);
		shelter.Display(universe);
	}

	private void initForPlayer(RWTVirtualController virtualController) {
		BasePeople player1 = new Player1(new Sprite("data\\imagesTeamC\\knife.gif", 0.66f, 1.0f), new Vector2(1,1), 0, new Vector2(0,0), virtualController, this);
		player1.Display(thisUniverse);
		player1.GetImage().setPosition(new Position2D(0, 0));
		players.add(player1);


		BasePeople player2 = new Player2(new Sprite("data\\imagesTeamC\\knife.gif", 0.66f, 1.0f), new Vector2(1,1), 0, new Vector2(0,0), virtualController, this);
		player2.Display(thisUniverse);
		player2.GetImage().setPosition(new Position2D(0, 0));
		players.add(player2);

		isInit = true;
	}

	@Override
	public void progress(RWTVirtualController virtualController, long interval) {
		if(isInit == false)initForPlayer(virtualController);
		generateEnemyManager.Run();
		for(int i=0; i<enemies.size(); i++) {
			enemies.get(i).Run();
			if(enemies.get(i).GetParameter().GetHp() == 0) {
				thisUniverse.displace(enemies.get(i).GetImage());
				enemies.remove(i);
			}
		}
		for(int i=0; i<players.size(); i++) {
			players.get(i).Run();
			if(players.get(i).GetParameter().GetHp() == 0) {
				thisUniverse.displace(players.get(i).GetImage());
				players.remove(i);
			}
		}
		for(int i=0; i<Knifes.size(); i++) {
			Knifes.get(i).Run();
			if(Knifes.get(i).GetParameter().GetHp() == 0) {
				Knifes.remove(i);
			}
		}

		shelter.Run();
	}

	@Override
	public RWTFrame3D createFrame3D() {
		RWTFrame3D f = new RWTFrame3D();
		f.setSize(1024, 768);
		f.setTitle("Sample");
		return f;
	}

	/**
	 * 閭梧勹繧剃ｽ懈�舌☆繧�
	 * @param universe
	 */
	private void buildSkyBox(Universe universe) {
		TextureLoader loaderTop = new TextureLoader("data\\texture\\top.jpg",
				TextureLoader.BY_REFERENCE | TextureLoader.Y_UP,
				null);
		Texture textureTop = loaderTop.getTexture();
		TextureLoader loaderBottom = new TextureLoader("data\\texture\\bottom.jpg",
				TextureLoader.BY_REFERENCE | TextureLoader.Y_UP,
				null);
		Texture textureBottom = loaderBottom.getTexture();
		TextureLoader loaderNorth = new TextureLoader("data\\texture\\north.jpg",
				TextureLoader.BY_REFERENCE | TextureLoader.Y_UP,
				null);
		Texture textureNorth = loaderNorth.getTexture();
		TextureLoader loaderSouth = new TextureLoader("data\\texture\\south.jpg",
				TextureLoader.BY_REFERENCE | TextureLoader.Y_UP,
				null);
		Texture textureSouth = loaderSouth.getTexture();
		TextureLoader loaderWest = new TextureLoader("data\\texture\\west.jpg",
				TextureLoader.BY_REFERENCE | TextureLoader.Y_UP,
				null);
		Texture textureWest = loaderWest.getTexture();
		TextureLoader loaderEast = new TextureLoader("data\\texture\\east.jpg",
				TextureLoader.BY_REFERENCE | TextureLoader.Y_UP,
				null);
		Texture textureEast = loaderEast.getTexture();

		BackgroundBox background = new BackgroundBox(textureNorth, textureWest,
				textureSouth, textureEast, textureTop, textureBottom);
		BoundingSphere bs = new BoundingSphere();
		bs.setRadius(1000);
		background.setApplicationBounds(bs);
		universe.place(background);
	}
}
