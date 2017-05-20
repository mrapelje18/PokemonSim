import java.util.concurrent.ThreadLocalRandom;
import processing.core.PApplet;

public class Battle extends PApplet{
	private Pokemon op;
	private Pokemon self;
	
	public Battle(Pokemon op, Pokemon sf) {
		this.op = op;
		self = sf;
	}
	
	public void battlesim(Pokemon opponent, Pokemon self) {
		while ((opponent.gethp() > 0) && (self.gethp() > 0)) {
			if (opponent.gets() > self.gets()) {
				
			}
		}
	}
	public double type1gWeak(Attacks at) {
		if (at.getType().equals("fire")) {
			if (op.getType1().equals("water")||op.getType1().equals("fire")||op.getType1().equals("rock")||op.getType1().equals("dragon"))
				return 0.5;
			else if (op.getType1().equals("grass")||op.getType1().equals("ice")||op.getType1().equals("bug")||op.getType1().equals("iron"))
				return 2;
		} else if (at.getType().equals("water")) {
			if (op.getType1().equals("fire")||op.getType1().equals("ground")||op.getType1().equals("rock"))
				return 2;
			else if (op.getType1().equals("water")||op.getType1().equals("grass")||op.getType1().equals("dragon"))
				return 0.5;
		} else if (at.getType().equals("grass")) {
			if (op.getType1().equals("fire")||op.getType1().equals("grass")||op.getType1().equals("poison")||op.getType1().equals("flying")||op.getType1().equals("bug")||op.getType1().equals("dragon")||op.getType1().equals("iron"))
				return 0.5;
			else if (op.getType1().equals("water")||op.getType1().equals("ground")||op.getType1().equals("rock"))
				return 2;
		} else if (at.getType().equals("normal")) {
			if (op.getType1().equals("rock")||op.getType1().equals("iron"))
				return 0.5;
		} else if (at.getType().equals("electric")) {
			if (op.getType1().equals("water")||op.getType1().equals("flying"))
				return 2;
			else if (op.getType1().equals("electric")||op.getType1().equals("grass")||op.getType1().equals("dragon"))
				return 0.5;
		} else if (at.getType().equals("ice")) {
			if (op.getType1().equals("fire")||op.getType1().equals("water")||op.getType1().equals("ice")||op.getType1().equals("iron"))
				return 0.5;
			else if (op.getType1().equals("grass")||op.getType1().equals("ground")||op.getType1().equals("flying")||op.getType1().equals("dragon"))
				return 2;
		} else if (at.getType().equals("fighting")) {
			if (op.getType1().equals(""))
		}
	}
	public int damage(Attacks at) { //damage to opponent
		if (at.getType().equals(self.getType1())||(at.getType().equals(self.getType2()))) {
			double hi = 1.5;
		}
		if (at.getCat().equals("physical")) {
			return (int) (hi*(((self.getlvl()*2/5+2)*at.getPower()*self.getat()/op.getdef()/50+2)*ThreadLocalRandom.current().nextInt(85, 101)/100);
		}
	}
}
