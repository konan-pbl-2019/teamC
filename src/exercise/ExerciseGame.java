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
import framework.game2D.Sprite;
import framework.gameMain.SimpleShootingGame;
import framework.model3D.BackgroundBox;
import framework.model3D.Universe;

public class ExerciseGame extends SimpleShootingGame {
	Sprite myShip;
	private ArrayList<BaseObject>baseObject = new ArrayList<BaseObject>();
//	private Universe universe2;
	@Override
	public void init(Universe universe) {
		// 平行光源を配置する
        DirectionalLight dirlight = new DirectionalLight(
        		true,                           //光のON/OFF
                new Color3f(1.0f, 1.0f, 1.0f),  //光の色
                new Vector3f(0.0f, -1.0f, -0.5f) //光の方向ベクトル
        );
        dirlight.setInfluencingBounds(new BoundingSphere(new Point3d(), 10000.0));
        universe.placeLight(dirlight);

		// 環境光を配置する
		AmbientLight amblight = new AmbientLight(new Color3f(0.5f, 0.5f, 0.5f));
		amblight.setInfluencingBounds(new BoundingSphere(new Point3d(), 10000.0));
		universe.placeLight(amblight);

		// 背景を作成する
		//buildSkyBox(universe);

		myShip = new Sprite("data\\images\\MyShip.gif");
		universe.place(myShip);

		setViewRange(30, 30);

		myShip.setPosition(10, 0);
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

		BaseObject guishelter = new BaseObject(new Sprite("data\\ImagesTeamC\\shelter.png",3.0f, 3.0f), new Vector2(0,0), 0, new Vector2(0,1));
		guishelter.Display(universe);
		
		BaseObject guiKnife1 = new BaseObject(new Sprite("data\\ImagesTeamC\\knife.png", 1.0f, 1.3f), new Vector2(0,0), 0, new Vector2(-4.0f,-12));
		guiKnife1.Display(universe);
		BaseObject guiKnife2 = new BaseObject(new Sprite("data\\ImagesTeamC\\knife.png", 1.0f, 1.3f), new Vector2(0,0), 0, new Vector2(11,-12));
		guiKnife2.Display(universe);
		
		

		baseObject.add(gui1P);
		baseObject.add(gui2P);
		baseObject.add(guiKnife1);
		baseObject.add(guiKnife2);
		baseObject.add(guiHP1base);
		baseObject.add(guiHP1full);
		baseObject.add(guiHP2base);
		baseObject.add(guiHP2full);
		baseObject.add(guishelter);

	}

	@Override
	public void progress(RWTVirtualController virtualController, long interval) {
	}

	@Override
	public RWTFrame3D createFrame3D() {
		RWTFrame3D f = new RWTFrame3D();
		f.setSize(1024, 768);
		f.setTitle("Sample");
		return f;
	}

	/**
	 * 背景を作成する
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
