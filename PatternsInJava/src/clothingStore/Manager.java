package clothingStore;

import client.Clients;

public class Manager implements Observable{
	private Clients client;
	//饿汉单例设计模式：经理只有一个
	private static Manager manager = new Manager();
	private Manager() {}
	public static Manager GetInstance() {
		return manager;
	}
	public void GetClient(Clients client) {
		this.client = client;
	}
	@Override
	public void registerObservers(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeObservers(Observer o) {
		observers.remove(o);
	}
	@Override
	public void notifyObservers() {
		for(Observer o:observers) {
			o.update(client.styleOrder.Style(),
					client.sizeOrder.Size(),
					client.colorOrder.Color(),
					client.patternOrder.Pattern());
		}
	}
}
