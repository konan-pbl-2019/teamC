package exercise;

import javax.media.j3d.Transform3D;
import javax.vecmath.Vector3d;

import framework.game2D.Position2D;
import framework.game2D.Sprite;
import framework.model3D.Universe;

public abstract class BasePeople {
	//能力値
	private final int attackSpd = 50;// per frame;
	private float radian;

	//BasePeopleが内包しているクラス
	private Sprite image;
	private Vector2 size;
	private Vector2 position;
	private IController baseController;
	//private IAct iact;
	private ActorParameter actorParameter;
	private PeopleDamaged peopleDamaged;

	private Timer timer = new Timer();

	public BasePeople(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition) {
		image = fimage;
		size = fsize;
		radian = fradian;
		position = fposition;

		actorParameter = new ActorParameter(50,50,10,10,10);
		peopleDamaged = new PeopleDamaged();
	}

	// getter setter

	public Sprite GetImage() {
		return image;
	}
	public void SetImage(Sprite fimage) {
		image = fimage;
	}

	public Vector2 GetSize() {
		return size;
	}
	public void SetSize(Vector2 fsize) {
		size = fsize;
	}

	public float GetRadian() {
		return radian;
	}
	public void SetRadian(float fradian) {
		radian = fradian;
	}

	public Vector2 GetPosition() {
		return position;
	}
	public void SetPosition(Vector2 fposition) {
		position = fposition;
	}
	public IController GetController() {
		return baseController;
	}
	public void SetController(IController iController) {
		baseController = iController;
	}

	public void Display(Universe universe) {
		image.setPosition(position.x, position.y);
		universe.place(image);
	}
	public ActorParameter GetParameter() {
		return actorParameter;
	}
	public void SetParameter(ActorParameter factorParameter) {
		actorParameter = factorParameter;
	}
	public PeopleDamaged GetPeopleDamaged() {
		return peopleDamaged;
	}
	public void SetPeopleDamaged(PeopleDamaged fpeopleDamaged) {
		peopleDamaged = fpeopleDamaged;
	}
	public Timer GetTimer() {
		return timer;
	}

	//特殊機能
	public void Attack(ExerciseGame exerciseGame) {
		if(timer.IsTimeOver()) {
			BaseObject knife = new Knife1(new Sprite("data\\imagesTeamC\\knife.gif", 0.66f, 1f), new Vector2(1,1), 0, new Vector2(0,0), exerciseGame);
			knife.Display(exerciseGame.thisUniverse);
			exerciseGame.Knifes.add(knife);
			knife.GetImage().setPosition(new Position2D(GetImage().getPosition().getX() - GetImage().scaleX * Math.sin(radian)*2, GetImage().getPosition().getY() + GetImage().scaleY * Math.cos(radian)*2));
			timer.Reset();
			timer.SetTimeOut(attackSpd);
		}
		else {
			timer.IncreaseByOne();
		}
	}

	//スプライトを回転(BoxのTransformGroupを変更する)
	public void TurnRight() {
		//Transform3Dを生成
		Transform3D transform = new Transform3D();
		Transform3D transform2 = new Transform3D();

	    //Transform3Dに、Y軸を回転軸として45度（π/4ラジアン）の回転を登録
		transform.set(new Vector3d(GetImage().getPosition().getX(), GetImage().getPosition().getY(), 0));
		radian += -Math.PI/60;

	    transform2.rotZ(radian);

	    //合成
	    transform.mul(transform2);

	    //TransformGroupにTransform3Dを登録。
	    GetImage().getTransformGroupToPlace().setTransform(transform);
	}

	public void TurnLeft() {
		//Transform3Dを生成
		Transform3D transform = new Transform3D();
		Transform3D transform2 = new Transform3D();

	    //Transform3Dに、Y軸を回転軸として45度（π/4ラジアン）の回転を登録
		transform.set(new Vector3d(GetImage().getPosition().getX(), GetImage().getPosition().getY(), 0));
		radian += Math.PI/60;

	    transform2.rotZ(radian);

	    //合成
	    transform.mul(transform2);

	    //TransformGroupにTransform3Dを登録。
	    GetImage().getTransformGroupToPlace().setTransform(transform);
	}
	//スプライトを回転(BoxのTransformGroupを変更する)
		public void MoveRight() {
			//Transform3Dを生成
			Transform3D transform = new Transform3D();
			Transform3D transform2 = new Transform3D();
			GetImage().moveRight(3, true);

		    //Transform3Dに、Y軸を回転軸として45度（π/4ラジアン）の回転を登録
			transform.set(new Vector3d(GetImage().getPosition().getX(), GetImage().getPosition().getY(), 0));

		    transform2.rotZ(radian);

		    //合成
		    transform.mul(transform2);

		    //TransformGroupにTransform3Dを登録。
		    GetImage().getTransformGroupToPlace().setTransform(transform);
		}

		public void MoveLeft() {
			//Transform3Dを生成
			Transform3D transform = new Transform3D();
			Transform3D transform2 = new Transform3D();
			GetImage().moveLeft(3, true);

		    //Transform3Dに、Y軸を回転軸として45度（π/4ラジアン）の回転を登録
			transform.set(new Vector3d(GetImage().getPosition().getX(), GetImage().getPosition().getY(), 0));
		    transform2.rotZ(radian);

		    //合成
		    transform.mul(transform2);

		    //TransformGroupにTransform3Dを登録。
		    GetImage().getTransformGroupToPlace().setTransform(transform);
		}
		//スプライトを回転(BoxのTransformGroupを変更する)
		public void MoveUp() {
			//Transform3Dを生成
			Transform3D transform = new Transform3D();
			Transform3D transform2 = new Transform3D();
			GetImage().moveUp(3, true);

		    //Transform3Dに、Y軸を回転軸として45度（π/4ラジアン）の回転を登録
			transform.set(new Vector3d(GetImage().getPosition().getX(), GetImage().getPosition().getY(), 0));

		    transform2.rotZ(radian);

		    //合成
		    transform.mul(transform2);

		    //TransformGroupにTransform3Dを登録。
		    GetImage().getTransformGroupToPlace().setTransform(transform);
		}

		public void MoveDown() {
			//Transform3Dを生成
			Transform3D transform = new Transform3D();
			Transform3D transform2 = new Transform3D();
			GetImage().moveDown(3, true);

		    //Transform3Dに、Y軸を回転軸として45度（π/4ラジアン）の回転を登録
			transform.set(new Vector3d(GetImage().getPosition().getX(), GetImage().getPosition().getY(), 0));
		    transform2.rotZ(radian);

		    //合成
		    transform.mul(transform2);

		    //TransformGroupにTransform3Dを登録。
		    GetImage().getTransformGroupToPlace().setTransform(transform);
		}
		public void Die() {
		}


	public abstract void Run();
}
