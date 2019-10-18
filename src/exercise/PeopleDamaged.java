package exercise;

import java.util.ArrayList;

import framework.game2D.Sprite;

public class PeopleDamaged {
	public void Run(BasePeople people, ArrayList<BasePeople> opponents, ArrayList<BaseObject> bullets){
		for(BasePeople opponent : opponents) {
			if(isDamaged(people.GetImage(), opponent.GetImage())) {
				people.GetParameter().DecreaseHp(opponent.GetParameter().GetAtk());
			}
		}
		for(BaseObject bullet : bullets) {
			if(isDamaged(people.GetImage(), bullet.GetImage())) {
				people.GetParameter().DecreaseHp(bullet.GetParameter().GetAtk());
			}
		}
	}
	private boolean isDamaged(Sprite sprite1, Sprite sprite2) {
		if(sprite1.checkCollision(sprite2))return true;
		return false;
	}

}
