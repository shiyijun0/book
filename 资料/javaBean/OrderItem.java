package cn.itcast.estore.domain;

/**
 * ������һ��
 * 
 * 
 * 
 */
public class OrderItem {
	private String order_id; // ������
	private String product_id; // ��Ʒ��
	private int buynum; // ��������

	// ���product�����ƺ͵���
	private String name;
	private double price;

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String orderId) {
		order_id = orderId;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String productId) {
		product_id = productId;
	}

	public int getBuynum() {
		return buynum;
	}

	public void setBuynum(int buynum) {
		this.buynum = buynum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
