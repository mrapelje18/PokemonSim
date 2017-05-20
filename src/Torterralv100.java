
public class Torterralv100 extends Pokemon {

	public Torterralv100() {
		super("Torterra", 100, "grass", "ground");
		sethp(300,394);
		setat(200,348);
		setdf(193,339);
		setsa(139,273);
		setsd(157,295);
		sets(105,232);
		setattacks(new Attacks("Earthquake", "ground", "physical", 100, 10, false, 100), new Attacks("Wood Hammer", "grass", "physical", 120, 15, false, 100), new Attacks("Giga Drain", "grass", "special", 75, 10, false, 100), new Attacks("Leaf Storm", "grass", "special", 130, 5, false, 90));
	}

}
