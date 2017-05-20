
public class Infernapelv100 extends Pokemon {
	
	public Infernapelv100() {
		super("Infernape", 100, "fire", "fighting");
		sethp(262,356);
		setat(191,337);
		setdf(132,265);
		setsa(191,337);
		setsd(132,265);
		sets(198,346);
		setattacks(new Attacks("Mach Punch", "fighting", "physical", 40, 30, true, 100), new Attacks("Flare Blitz", "fire", "physical", 120, 15, false, 100), new Attacks("Flame Wheel", "fire", "physical", 60, 25, false, 100), new Attacks("Acrobatics", "flying", "physical", 55, 15, false, 100));
	}

}
