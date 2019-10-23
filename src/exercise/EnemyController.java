package exercise;

public class EnemyController implements IController {
	Vector2 center = new Vector2(0, 0);
	public void Run(BasePeople people, ExerciseGame exerciseGame) {
		if(people.GetImage().getPosition().getY() > center.y) {
			if(people.GetImage().getPosition().getX() < center.x) {
				people.GetImage().moveRight(1);
				System.out.println(people.GetImage().getPosition().getX());
			}
			if(people.GetImage().getPosition().getX()>center.x) {
				people.GetImage().moveLeft(1);
			}
			if(people.GetImage().getPosition().getX()>center.x) {
				if(people.GetImage().getPosition().getY()>center.y) {
					people.GetImage().moveDown(people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX());
				}
				if(people.GetImage().getPosition().getY()<center.y) {
					people.GetImage().moveUp(people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX());
				}
			}else {
				if(people.GetImage().getPosition().getY()>center.y) {
					people.GetImage().moveDown(people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX()*(-1));
				}
				if(people.GetImage().getPosition().getY()<center.y) {
					people.GetImage().moveUp(people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX()*(-1));
				}
			}
		}else {
			if(people.GetImage().getPosition().getX() < center.x) {
				people.GetImage().moveRight(1);
				System.out.println(people.GetImage().getPosition().getX());
			}
			if(people.GetImage().getPosition().getX()>center.x) {
				people.GetImage().moveLeft(1);
			}
			if(people.GetImage().getPosition().getX()>center.x) {
				if(people.GetImage().getPosition().getY()>center.y) {
					people.GetImage().moveDown((-1)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX());
				}
				if(people.GetImage().getPosition().getY()<center.y) {
					people.GetImage().moveUp((-1)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX());
				}
			}else {
				if(people.GetImage().getPosition().getY()>center.y) {
					people.GetImage().moveDown((-1)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX()*(-1));
				}
				if(people.GetImage().getPosition().getY()<center.y) {
					people.GetImage().moveUp((-1)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX()*(-1));
				}
			}
		}
	}

}
