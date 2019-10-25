package exercise;

import java.util.ArrayList;

import framework.game2D.Sprite;

public class PeopleDamaged {
	public void Run(BasePeople people, ArrayList<BasePeople> opponents, ArrayList<BaseObject> bullets){
		for(BasePeople opponent : opponents) {
			if(isDamaged(people.GetImage(), opponent.GetImage())) {
				people.GetParameter().DecreaseHp(opponent.GetParameter().GetAtk());
				if(people.GetParameter().GetHp()<=0) {
					people.GetImage().setImage("data\\imagesTeamC\\bom.gif");
				}
				int moveValue = 10;
				if(people.GetImage().getPosition().getX()<=opponent.GetImage().getPosition().getX())people.GetImage().moveLeft(moveValue);
				else if(people.GetImage().getPosition().getX()>opponent.GetImage().getPosition().getX())people.GetImage().moveRight(moveValue);
				if(people.GetImage().getPosition().getY()<=opponent.GetImage().getPosition().getY())people.GetImage().moveDown(moveValue);
				else if(people.GetImage().getPosition().getY()>opponent.GetImage().getPosition().getY())people.GetImage().moveUp(moveValue);
			}
		}
		for(BaseObject bullet : bullets) {
			if(isDamaged(people.GetImage(), bullet.GetImage())) {
				people.GetParameter().DecreaseHp(bullet.GetParameter().GetAtk());
				if(people.GetParameter().GetHp()<=0) {
					people.GetImage().setImage("data\\imagesTeamC\\bom.gif");
				}
				int moveValue = 15;
				if(people.GetImage().getPosition().getX()<bullet.GetImage().getPosition().getX())people.GetImage().moveLeft(moveValue);
				if(people.GetImage().getPosition().getX()>bullet.GetImage().getPosition().getX())people.GetImage().moveRight(moveValue);
				if(people.GetImage().getPosition().getY()<bullet.GetImage().getPosition().getY())people.GetImage().moveDown(moveValue);
				if(people.GetImage().getPosition().getY()>bullet.GetImage().getPosition().getY())people.GetImage().moveUp(moveValue);
			}
		}
	}
	private boolean isDamaged(Sprite sprite1, Sprite sprite2) {
		if(sprite1.checkCollision(sprite2))return true;
		return false;
	}

}
