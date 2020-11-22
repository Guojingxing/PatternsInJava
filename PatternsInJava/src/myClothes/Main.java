package myClothes;

import client.*;
import clothing.*;
import clothingStore.*;
import clothingFactory.*;

public class Main {
	//程序主入口
	public static void main(String[] args) {
		//生成客户：小孩
		Clients client = new ClientChildren();
		//在日本服装厂中生产
		Factory f = new JapaneseFactory();
		//服装店将订单交给日本服装厂
		ClothingStore store = new ClothingStore(f);
		//客户生成订单
		store.orderClothing(client);
		//客户修改订单
		client.setColorOrder(new ColorBlue());
		client.setStyleOrder(new StyleTShirt());
		//制造服装
		Clothing myClothing = store.makeClothing();
		//客户穿衣服
		System.out.println(client.WearClothes(myClothing));
	}
}
