package models;

public class Food {
	
	private Long foodId;
	private String foodname;
	private int foodqnt;
	private int foodcals;
	
	public Long getFoodId() {
		return foodId;
	}
	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getFoodqnt() {
		return foodqnt;
	}
	public void setFoodqnt(int foodqnt) {
		this.foodqnt = foodqnt;
	}
	public int getFoodcals() {
		return foodcals;
	}
	public void setFoodcals(int foodcals) {
		this.foodcals = foodcals;
	}

}
