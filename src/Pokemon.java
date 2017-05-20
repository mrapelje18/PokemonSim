import java.util.concurrent.ThreadLocalRandom;

public class Pokemon {
	private String name;
	private int level;
	private String type;
	private String type2;
	private int hp;
	private int df;
	private int at;
	private int sd;
	private int sa;
	private int speed;
	private Attacks[] attacks;
	
	public Pokemon(String name, int level, String type, String type2) {
		this.name = name;
		this.level = level;
		this.type = type;
		this.type2 = type2;
		hp = 0;
		df = 0;
		at = 0;
		sd = 0;
		sa = 0;
		speed = 0;
		attacks = new Attacks[4];
	}
	
	public int randomStats(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	public void sethp(int min, int max) {
		hp = randomStats(min, max);
	}
	public void setat(int min, int max) {
		at = randomStats(min, max);
	}
	public void setdf(int min, int max) {
		df = randomStats(min, max);
	}
	public void setsd(int min, int max) {
		sd = randomStats(min, max);
	}
	public void setsa(int min, int max) {
		sa = randomStats(min, max);
	}
	public void sets(int min, int max) {
		speed = randomStats(min, max);
	}
	public void setattacks(Attacks at1, Attacks at2, Attacks at3, Attacks at4) {
		at1 = attacks[1];
		at2 = attacks[2];
		at3 = attacks[3];
		at4 = attacks[4];
	}

	public String getName() {
		return name;
	}
	public int gethp() {
		return hp;
	}
	public int getat() {
		return at;
	}
	public int getdef() {
		return df;
	}
	public int getsa() {
		return sa;
	}
	public int getsd() {
		return sd;
	}
	public int gets() {
		return speed;
	}
	public int getlvl() {
		return level;
	}
	public String getType1() {
		return type;
	}
	public String getType2() {
		return type2;
	}
	
	
}
