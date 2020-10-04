import java.util.ArrayList;

public class EyeOfSauron implements Subject {
	private ArrayList observers;
	 private int hobbits, elves, dwarfs, men;
	 
	 public EyeOfSauron() {
		 observers = new ArrayList();
		 }
	 
	 public void registerObserver(Observer o) {
		 	observers.add(o);
		}

		public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
			}
		}

		public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(hobbits, elves, dwarfs, men);
		 	}
		}
		
		public void enemiesChanged() { // tells when a new number of enemies are seen
			 notifyObservers();
		}

		 public void setEnemies(int hobbits, int elves, int dwarfs, int men) {	//takes in how many certain enemies the eye sees
			 this.hobbits = hobbits;
			 this.elves = elves;
			 this.dwarfs = dwarfs;
			 this.men = men;
			 enemiesChanged();
			 }
		 
}
