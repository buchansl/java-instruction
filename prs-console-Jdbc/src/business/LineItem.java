package business;

public class LineItem {

	private String id;
	private String requestId;
	private String productId;
	private double quantity;

	public LineItem() {
		super();
	}

	public LineItem(String id, String requestId, String productId, double quantity) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "lineItem [id=" + id + ", requestId=" + requestId + ", productId=" + productId + ", quantity=" + quantity
				+ "]";
	}

}
