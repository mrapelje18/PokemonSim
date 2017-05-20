
public class Empoleonlv100 extends Pokemon {
	
	
	public Empoleonlv100() {
		super("Empoleon", 100, "water", "steel");
		sethp(278,372);
		setat(159,298);
		setdf(162,302);
		setsa(204,353);
		setsd(186,331);
		sets(112,240);
		setattacks(new Attacks("Aqua Jet", "water", "physical", 40, 20, true, 100), new Attacks("Ice Beam", "ice", "special", 90, 10, false, 100), new Attacks("Hydro Pump", "water", "special", 110, 5, false, 80), new Attacks("Metal Claw", "steel", "physical", 50, 35, false, 95));
	}
}
