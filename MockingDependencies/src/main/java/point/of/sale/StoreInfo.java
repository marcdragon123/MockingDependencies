package point.of.sale;

public class StoreInfo {

	private static StoreInfo instance = null;
	private String storeName = "No Name";
	
	private StoreInfo() {
		
	}
	
	public static StoreInfo getInstance() {
		if (instance == null) {
			instance = new StoreInfo();
		}
		return instance;
	}
	
	public String getName() {
		return storeName;
	}
	
	public void setName(String storeName) {
		this.storeName = storeName;
	}
}
