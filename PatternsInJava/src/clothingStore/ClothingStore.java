package clothingStore;

import client.Clients;
import clothing.*;
import clothingFactory.*;

public class ClothingStore /*implements Observable*/{
	private Factory factory;
	private Waiter waiter;
	private static Manager manager = Manager.GetInstance();
	public ClothingStore(Factory factory) {
		this.factory = factory;
		waiter = new Waiter();
		
		manager.registerObservers(factory.tailor);
		manager.registerObservers(waiter);
	}
	public Clothing orderClothing(Clients client) {
		Clothing c = null;
		
		//经理了解了客户，然后把客户的消息通知给所有的观察者
		manager.GetClient(client);
		manager.notifyObservers();
		
		c = factory.CreateClothing(client);
		return c;
	}
}
