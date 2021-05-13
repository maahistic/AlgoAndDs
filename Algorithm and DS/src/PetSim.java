import java.io.IOException;
import java.util.Scanner;

public class PetSim {
	private int hungerLevel;
	private int boredomLevel;
	private String name;
	int time = 1;

	public PetSim(int hungerLevel, int boredomLevel, String name) {
		this.hungerLevel = hungerLevel;
		this.boredomLevel = boredomLevel;
		this.name = name;

		this.toString();
	}

	@Override
	public String toString() {
		return "PetSim [hungerLevel=" + hungerLevel + ", boredomLevel=" + boredomLevel + ", name=" + name + "]";
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public void setHungerLevel(int hungerLevel) {
		if (hungerLevel <= 100 && hungerLevel >= 0)
			this.hungerLevel = hungerLevel;
		else {
			System.out.println("Hunger Levels Must be between 0 to 100");
		}
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public void setBoredomLevel(int boredomLevel) {
		if (boredomLevel <= 100 && boredomLevel >= 0)
			this.boredomLevel = boredomLevel;
		else {
			System.out.println("Hunger Levels Must be between 0 to 100");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int PetMood() {
		return this.hungerLevel + this.boredomLevel;
	}

	private String Talk() {
		String ret = "";
		int mood = PetMood();
		if (mood < 7)
			ret = "happy";
		else if (mood > 21)
			ret = "mad";
		else if (21 < mood && mood > 16)
			ret = "frustrated";
		else if (mood >= 7)
			ret = "Okay";

		DisplayPetBehaviour();
		return ret;
	}

	private void PassTime(int tim) {
		tim = tim == 0 ? 1 : time;
		this.hungerLevel += tim;
		this.boredomLevel += tim;

	}

	private void menu() {
		boolean q = true;
		while (q) {
			System.out.println("DO YOU WANT TO QUIT GAME ? PRESS Y OR N");
			Scanner s = new Scanner(System.in);
			String in = s.next();
			if ("Y".equals(in)) {
				System.out.println("Thanks to Play Game");
				q = false;
			} else {

				System.out.println("Please Choose you Activity with Pet");
				System.out.println("Listen : Press 1");
				System.out.println("Feed : Press 2");
				System.out.println("Play : Press 3");
				s.nextLine();
				String ac = s.nextLine();

				if ("1".equals(ac)) {
					Talk();
					continue;
				}
				if ("2".equals(ac)) {
					Feed();
					continue;
				}
				if ("3".equals(ac)) {
					Play();
				}
				continue;
			}
		}
	}

	public void Play() {
		// TODO Auto-generated method stub

		System.out.println("HOW MUCH YOU WANT TO PLAY WITH PET");
		Scanner in = new Scanner(System.in);
		String ac = in.next();
		if (Integer.parseInt(ac) <= 4 && (this.boredomLevel - Integer.parseInt(ac) > 0)) {
			this.boredomLevel = (this.boredomLevel) - Integer.parseInt(ac);
			System.out.println(this.name + " is very happy to play with you");
			PassTime(Integer.parseInt(ac));

		} else {
			System.out.println("ENTERED VALUE IS NOT ALLOWED");
		}
		DisplayPetBehaviour();
	}

	private void Feed() {
		System.out.println("HOW MUCH YOU WANT TO FEED PET");
		Scanner in = new Scanner(System.in);
		String ac = in.next();
		if (Integer.parseInt(ac) <= 4 && (this.hungerLevel - Integer.parseInt(ac) > 0)) {
			this.hungerLevel = (this.hungerLevel) - Integer.parseInt(ac);
			System.out.println(this.name + "'s Stomach is full now, Thanks to fed");
			PassTime(Integer.parseInt(ac));

		} else {
			System.out.println("ENTERED VALUE IS NOT ALLOWED");
		}
		// TODO Auto-generated method stub

		DisplayPetBehaviour();
	}

	private void DisplayPetBehaviour() {
		if (this.hungerLevel > 11) {
			System.out.println("Pet's Hunger level is " + this.hungerLevel + ", It's very hungry");
		} else if (this.hungerLevel <= 11 && this.hungerLevel >= 3) {
			System.out.println("Pet's Hunger level is " + this.hungerLevel + ", It's mordertely hungry");

		} else {
			System.out.println("Pet's Hunger level is " + this.hungerLevel + ", It's not hungry");

		}
		if (this.boredomLevel > 11) {
			System.out.println("Pet's BoreDom level is " + this.boredomLevel + ", It's very Bored");
		} else if (this.boredomLevel <= 11 && this.boredomLevel >= 3) {
			System.out.println("Pet's BoreDom level is " + this.boredomLevel + ", It's little Bored");

		} else {
			System.out.println("Pet's BoreDom level is " + this.boredomLevel + ", It's not Bored");

		}

	}

	public static void main(String args[]) throws IOException {

		Scanner s = new Scanner(System.in);

		System.out.println("ENter the Hunger Level");
		int hunger = s.nextInt();
		System.out.println("ENter the BoreDom Level");
		int Bore = s.nextInt();
		s.nextLine();
		System.out.println("ENter the Pet's Name");
		String name = s.nextLine();
		PetSim petSim = new PetSim(hunger, Bore, name);
		petSim.menu();
	}
}
