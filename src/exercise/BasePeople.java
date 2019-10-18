package exercise;

import framework.game2D.Sprite;
import framework.model3D.Universe;

public abstract class BasePeople {

	private Sprite image;
	private Vector2 size;
	private float radian;
	private Vector2 position;
	private IController baseController;
	//private IAct iact;
	private ActorParameter actorParameter;

	public BasePeople(Sprite fimage, Vector2 fsize, float fradian, Vector2 fposition) {
		image = fimage;
		size = fsize;
		radian = fradian;
		position = fposition;

		actorParameter = new ActorParameter(10,10,10,10,10);
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

	public abstract void Run();
}
