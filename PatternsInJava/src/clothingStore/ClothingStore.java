package clothingStore;

import client.Clients;
import clothing.*;
import clothingFactory.*;

public class ClothingStore /*implements Observable*/{
	private Factory factory;
	private Waiter waiter;
	private Clients client;
	private static Manager manager = Manager.GetInstance();
	public ClothingStore(Factory factory) {
		this.factory = factory;
		waiter = new Waiter();
		
		manager.registerObservers(factory.tailor);
		manager.registerObservers(waiter);
	}
	public void orderClothing(Clients client) {
		this.client = client;
		//经理了解了客户，然后把客户的消息通知给所有的观察者
		manager.GetClient(client);
		manager.notifyObservers();
	}
	public Clothing makeClothing() {
		Clothing c = null;
		c = factory.CreateClothing(client);
		return c;
	}
	public void SetFactory(Factory factory) {
		this.factory = factory;
	}
}
