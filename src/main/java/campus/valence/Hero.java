package campus.valence;

public class Hero {
	
	private String name;
	private int force;
	private int life;
	
	public Hero(String name, int force, int life) throws IllegalLifePointsException {
		this.name = name;
		this.force = force;
		this.life = life;
		if (life >= 100) {
			throw new IllegalLifePointsException(life);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", force=" + force + ", life=" + life + "]";
	}
	
}