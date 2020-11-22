package myClothes;

import client.*;
import clothing.*;
import clothingStore.*;
import clothingFactory.*;

public class Main {
	//���������
	public static void main(String[] args) {
		//���ɿͻ���С����Ů��
		Clients client = new ClientChildren();
		Clients client2 = new ClientGirl();
		//���ձ���װ��������
		Factory f1 = new JapaneseFactory();
		Factory f2 = new EuropeanFactory();
		//��װ�꽫���������ձ���װ��
		ClothingStore store = new ClothingStore(f1);
		//�ͻ����ɶ���
		store.orderClothing(client);
		//�ͻ��޸Ķ���
		client.setColorOrder(new ColorBlue());
		client.setStyleOrder(new StyleTShirt());
		//�����װ
		Clothing myClothing = store.makeClothing();
		//�ͻ����·�
		System.out.println(client.WearClothes(myClothing));
		
		//�޸ķ�װ��Ĵ�����
		store.SetFactory(f2);
		//�ͻ�2���ɶ�������װ�������·�
		store.orderClothing(client2);
		myClothing = store.makeClothing();
		System.out.println(client2.WearClothes(myClothing));
	}
}
