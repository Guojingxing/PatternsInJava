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
		
		//�����˽��˿ͻ���Ȼ��ѿͻ�����Ϣ֪ͨ�����еĹ۲���
		manager.GetClient(client);
		manager.notifyObservers();
		
		c = factory.CreateClothing(client);
		return c;
	}
}
