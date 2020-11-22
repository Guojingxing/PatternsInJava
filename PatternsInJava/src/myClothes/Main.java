package myClothes;

import client.*;
import clothing.*;
import clothingStore.*;
import clothingFactory.*;

public class Main {
	//���������
	public static void main(String[] args) {
		//���ɿͻ���С��
		Clients client = new ClientChildren();
		//���ձ���װ��������
		Factory f = new JapaneseFactory();
		//��װ�꽫���������ձ���װ��
		ClothingStore store = new ClothingStore(f);
		//�ͻ����ɶ���
		store.orderClothing(client);
		//�ͻ��޸Ķ���
		client.setColorOrder(new ColorBlue());
		client.setStyleOrder(new StyleTShirt());
		//�����װ
		Clothing myClothing = store.makeClothing();
		//�ͻ����·�
		System.out.println(client.WearClothes(myClothing));
	}
}
