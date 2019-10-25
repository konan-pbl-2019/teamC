package exercise;

import framework.game2D.Sprite;
import framework.model3D.Universe;

public class BaseItem {
	private Sprite image;
	private Vector2 size;
	private Vector2 position;

	public BaseItem(Sprite fimage, Vector2 fsize, Vector2 fposition) {
		image = fimage;
		size = fsize;
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

	public Vector2 GetPosition() {
		return position;
	}
	public void SetPosition(Vector2 fposition) {
		position = fposition;
	}

	public void HitPlayer() {

	}

	public void Display(Universe universe) {
		image.setPosition(position.x, position.y);
		universe.place(image);
	}

	public void Run() {

	}
}
