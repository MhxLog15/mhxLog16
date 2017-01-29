package user;

public class Spot {

	private String address = "", number = "", decription = "", category = "";
	private int id = -1, x = -1, y = -1;

	public void SetId(int id) {
		this.id = id;
	}

	public int GetId() {
		return id;
	}

	public void SetX(int x) {
		this.x = x;
	}

	public int GetX() {
		return x;
	}

	public void SetY(int y) {
		this.y = y;
	}

	public int GetY() {
		return y;
	}

	public void SetCategory(String category) {
		this.category = category;
	}

	public String GetCategory() {
		return category;
	}

	public void SetAddress(String address) {
		this.address = address;
	}

	public String GetAddress() {
		return address;
	}

	public void SetNumber(String number) {
		this.number = number;
	}

	public String GetNumber() {
		return number;
	}

	public void SetDecription(String decription) {
		this.decription = decription;
	}

	public String GetDecription() {
		return decription;
	}
}
