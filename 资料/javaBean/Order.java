package cn.itcast.estore.domain;

import java.sql.Timestamp;
import java.util.List;

/**
 * ������
 * 
 * 
 * 
 */
public class Order {
	private String id; // ������
	private double money; // ���
	private String receiverinfo; // �ջ�����Ϣ
	private int paystate; // ֧��״̬
	private Timestamp ordertime; // �µ�ʱ��
	private int user_id; // �µ��û�

	// ������Ӧ���������
	private List<OrderItem> orderItems;

	// ����û��ǳƺ��û����ֶ�
	private String username;
	private String nickname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getReceiverinfo() {
		return receiverinfo;
	}

	public void setReceiverinfo(String receiverinfo) {
		this.receiverinfo = receiverinfo;
	}

	public int getPaystate() {
		return paystate;
	}

	public void setPaystate(int paystate) {
		this.paystate = paystate;
	}

	public Timestamp getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

}
