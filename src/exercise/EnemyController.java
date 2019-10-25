package exercise;

public class EnemyController implements IController {
	Vector2 center = new Vector2(0, 0);
	public void Run(BasePeople people) {
		double moveValue = 0;
		double spd = people.GetParameter().GetSpeed()/10;
		if(people.GetImage().getPosition().getY() > center.y) {
			if(people.GetImage().getPosition().getX() < center.x) {
				people.GetImage().moveRight(spd);
				if(Math.abs(people.GetImage().getPosition().getX())>=0.05) {
					moveValue = (-spd)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX();
					people.GetImage().moveDown(moveValue);
				}
			}
			if(people.GetImage().getPosition().getX()>center.x) {
				people.GetImage().moveLeft(spd);
				if(Math.abs(people.GetImage().getPosition().getX())>=0.05) {
					moveValue = (-spd)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX()*(-spd);
					people.GetImage().moveDown(moveValue);
				}
			}
		}else {
			if(people.GetImage().getPosition().getX() < center.x) {
				people.GetImage().moveRight(spd);
				if(Math.abs(people.GetImage().getPosition().getX())>=0.05) {
					moveValue = (-spd)*people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX();
					people.GetImage().moveDown(moveValue);
				}
			}
			if(people.GetImage().getPosition().getX()>center.x) {
				people.GetImage().moveLeft(spd);
				if(Math.abs(people.GetImage().getPosition().getX())>=0.05) {
					moveValue = people.GetImage().getPosition().getY()/people.GetImage().getPosition().getX()*(-spd);
					people.GetImage().moveUp(moveValue);
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
