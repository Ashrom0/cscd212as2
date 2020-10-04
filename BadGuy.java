public class BadGuy implements Observer {
	private int hobbits, elves, dwarfs, men;
	private String string;
	private Subject eye;
	
	public BadGuy(Subject eye, String string) {	//add this to the observalbe object that will be observed and observer's name
		this.eye = eye;
		eye.registerObserver(this);
		this.string = string;
		}
	
	public void update(int hobbits, int elves, int dwarfs, int men) {	
		this.hobbits = hobbits;
		this.elves = elves;
		this.dwarfs = dwarfs;
		this.men = men;
		display();
		}
	
	public void display() {	//prints out who saw the enemy and how many enemies are seen
		System.out.println(string + " knows about -");
		System.out.println("   Hobbits: " + hobbits);
		System.out.println("   Elves: " + elves);
		System.out.println("   Dwarfs: " + dwarfs);
		System.out.println("   Humans: " + men);
		System.out.println();
		}

	public void defeated() {	//will no longer register observer from observable list
		System.out.println(string + " was defeated");
		System.out.println();
		eye.removeObserver(this);
	 }

}
