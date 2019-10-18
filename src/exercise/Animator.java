package exercise;

public class Animator {
	// SE se
	private Timer timer;
	private IAnimation animation;
	private BasePeople people;

	public Timer GetTimer() {
		return timer;
	}
	public void SetTimer(Timer ftimer) {
		timer = ftimer;
	}

	public IAnimation GetAnimate() {
		return animation;
	}
	public void SetAnimate(IAnimation fanimate) {
		animation = fanimate;
	}

	public void Animation() {
		animation.animate(people, this);
	}

	public void Reset() {

	}
}
