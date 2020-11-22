package myClothes;

import client.*;
import clothing.*;
import clothingStore.*;
import clothingFactory.*;

public class MyClothes {
	//���������
	public static void main(String[] args) {
		Clients client = new ClientChildren();
		Factory f = new JapaneseFactory();
		ClothingStore store = new ClothingStore(f);
		Clothing myClothing = store.orderClothing(client);
		System.out.println(client.WearClothes(myClothing));
	}
}
