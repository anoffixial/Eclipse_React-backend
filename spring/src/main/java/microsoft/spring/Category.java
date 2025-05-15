package microsoft.spring;

public class Category {
	private int cid;
	private String cname;
	private Product product;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Category(int cid, String cname, Product product) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.product = product;
	}

	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", product=" + product + "]";
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

}
