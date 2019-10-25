package exercise;

import framework.game2D.Sprite;
import framework.model3D.Universe;

public class BaseObject {
	private Sprite image;
	private Vector2 size;
	private float radian;
	private Vector2 position;
	private ActorParameter actorParameter;

	public BaseObject(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition) {
		image = fimage;
		size = fsize;
		radian = fradian;
		position = fposition;
	}

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
		image.moveRight((double)fposition.x);
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

	public void Run() {

	}

	public void Run(BasePeople people, ExerciseGame exerciseGame) {
		float size = people.GetParameter().GetHp() / people.GetParameter().GetMaxHp();
		System.out.println("asdf"+size);
		size *= 3.0f;

		exerciseGame.thisUniverse.displace(GetImage());
		GetImage().SetScale(size, 0.5f);
		Display(exerciseGame.thisUniverse);
		GetImage().moveLeft((3- size)*100);

	}
}
