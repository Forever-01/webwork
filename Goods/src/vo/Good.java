package vo;
/**
 * 商品名称列表
 * @author FOREVER
 *
 */
public class Good {
	private int id;
	private String name;
	private int pId;
	
	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Good(int id, String name, int pId) {
		super();
		this.id = id;
		this.name = name;
		this.pId = pId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ", pId=" + pId + "]";
	}
	
}
