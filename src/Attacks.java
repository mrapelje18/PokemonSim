
public class Attacks {
	private String name;
	private String type;
	private String category;
	private int power;
	private int pp;
	private boolean priority;
	private int accuracy;
	
	public Attacks(String name, String type, String cat, int pwr, int pp, boolean pr, int ac) {
		this.setType(type);
		setCat(cat);
		setPower(pwr);
		this.pp = pp;
		this.setName(name);
		priority = pr;
		accuracy = ac;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getCat() {
		return category;
	}

	public void setCat(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
