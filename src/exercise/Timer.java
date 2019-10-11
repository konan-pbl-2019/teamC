package exercise;

public class Timer {
	private float timeElapsed;
	private float timeOut;

	public float GetTimeElapsed() {
		return timeElapsed;
	}
	public void SetTimeElapsed(float ftimeElapsed) {
		timeElapsed = ftimeElapsed;
	}

	public float GetTimeOut() {
		return timeOut;
	}
	public void SetTimeOut(float ftimeOut) {
		timeOut = ftimeOut;
	}

	public boolean IsTimeOver() {
		if(timeOut <= timeElapsed) {
			return true;
		}else {
			return false;
		}
	}

	public void IncreaseByOne() {
		timeElapsed++;
	}

	public void Reset() {
		timeElapsed = 0;
	}
}
