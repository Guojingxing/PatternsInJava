package clothingStore;

import java.util.ArrayList;

public interface Observable {
	ArrayList<Observer> observers = new ArrayList<>();
	public void registerObservers(Observer o);
	public void removeObservers(Observer o);
	public void notifyObservers();
}
