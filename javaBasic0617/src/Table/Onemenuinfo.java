package Table;

public class Onemenuinfo {
	private int oneMenuFlag = -1;
	private String menuName = null;
	private int cnt = 0;
	private int menuPrice = 0;
	
	public void prt() {
		System.out.println("주문하신 메뉴 번호 :"+oneMenuFlag);
		System.out.println("주문하신 메뉴 이름 :"+menuName);
		System.out.println("주문하신 메뉴 가격 :"+menuPrice);
		System.out.println("주문하신 메뉴 수량 :"+cnt);
	}
	
	public int getOneMenuFlag() {
		return oneMenuFlag;
	}
	public void setOneMenuFlag(int oneMenuFlag) {
		this.oneMenuFlag = oneMenuFlag;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}

}
