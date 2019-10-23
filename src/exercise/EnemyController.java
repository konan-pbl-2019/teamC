package exercise;

public class EnemyController implements IController {
	Vector2 center = new Vector2(0, 0);
	public void Run(BasePeople people) {
		double moveValue = 0;
		if(people.GetImage().getPosition().getY() > center.y) {
			if(people.GetImage().getPosition().getX() < center.x) {
				people.GetImage().moveRight(1);
				if(Math.abs(people.GetImage().getPosition().getX())>=0.05) {
					moveValue = (-1)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX();
					people.GetImage().moveDown((-1)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX());
				}
			}
			if(people.GetImage().getPosition().getX()>center.x) {
				people.GetImage().moveLeft(1);
				if(Math.abs(people.GetImage().getPosition().getX())>=0.05) {
					moveValue = (-1)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX()*(-1);
					people.GetImage().moveDown((-1)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX()*(-1));
				}
			}
		}else {
			if(people.GetImage().getPosition().getX() < center.x) {
				people.GetImage().moveRight(1);
				if(Math.abs(people.GetImage().getPosition().getX())>=0.05) {
					moveValue = (-1)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX();
					people.GetImage().moveDown((-1)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX());
				}
			}
			if(people.GetImage().getPosition().getX()>center.x) {
				people.GetImage().moveLeft(1);
				if(Math.abs(people.GetImage().getPosition().getX())>=0.05) {
					moveValue = people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX()*(-1);
					people.GetImage().moveUp(people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX()*(-1));
				}
			}
		}
	}
	@Override
	public void Run2(BasePeople people, ExerciseGame exerciseGame) {
		// TODO 自動生成されたメソッド・スタブ
		return;
	}

}
