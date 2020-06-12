package cn.itcast.itcaststore.domain;

public class OrderItem {

	private Order order;
	private Product p;
	private int buynum;
    private String category;
    private int userid;
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public String getcategory()
	{
		return category;
	}
	
	public void setcategory(String category)
	{
		this.category=category;
	}
	
	public int getuserid()
	{
		return userid;
	}
	
	public void setuserid(int userid)
	{
		this.userid=userid;
	}
	
	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public int getBuynum() {
		return buynum;
	}

	public void setBuynum(int buynum) {
		this.buynum = buynum;
	}

}
