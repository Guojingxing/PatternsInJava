package myClothes;

import client.*;
import clothing.*;
import clothingStore.*;
import clothingFactory.*;

public class Main {
	//程序主入口
	public static void main(String[] args) {
		//生成客户：小孩和女生
		Clients client = new ClientChildren();
		Clients client2 = new ClientGirl();
		//在日本服装厂中生产
		Factory f1 = new JapaneseFactory();
		Factory f2 = new EuropeanFactory();
		//服装店将订单交给日本服装厂
		ClothingStore store = new ClothingStore(f1);
		//客户生成订单
		store.orderClothing(client);
		//客户修改订单
		client.setColorOrder(new ColorBlue());
		client.setStyleOrder(new StyleTShirt());
		//制造服装
		Clothing myClothing = store.makeClothing();
		//客户穿衣服
		System.out.println(client.WearClothes(myClothing));
		
		//修改服装店的代理工厂
		store.SetFactory(f2);
		//客户2生成订单、服装店制造衣服
		store.orderClothing(client2);
		myClothing = store.makeClothing();
		System.out.println(client2.WearClothes(myClothing));
	}
}
