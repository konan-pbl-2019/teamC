package exercise;

public class ActorParameter {
	private float hp;
	private float maxHp;
	private float atk;
	private float def;
	private float speed;

	public ActorParameter(float fhp, float fmaxHp, float fatk, float fdef, float fspeed) {
		hp = fhp;
		maxHp = fmaxHp;
		atk = fatk;
		def = fdef;
		speed = fspeed;
	}

	public float GetHp() {
		return hp;
	}
	public void SetHp(float fhp) {
		hp = fhp;
	}
	public void DecreaseHp(float value) {
		hp -= value;
	}
	public float GetMaxHp() {
		return maxHp;
	}
	public void SetMaxHp(float fmaxHp) {
		maxHp = fmaxHp;
	}
	public float GetAtk() {
		return atk;
	}
	public void SetAtk(float fatk) {
		atk = fatk;
	}
	public float GetDef() {
		return def;
	}
	public void SetDef(float fdef) {
		def = fdef;
	}

	public float GetSpeed() {
		return speed;
	}
	public void SetSpeed(float fspeed) {
		speed = fspeed;
	}



}
