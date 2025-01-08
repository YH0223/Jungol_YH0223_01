package LC_508;

public class Main {
	public static void main(String[]args) {
		Item[] items= {
				new Item("pen",20,100),
				new Item("note",5,95),
				new Item("eraser",110,97),
		};
		System.out.printf("%10s%10s%10s\n","item","count","price");
		for(int i=0;i<items.length;i++) {
			System.out.printf("%10s%10d%10d\n",items[i].getname(),items[i].getcount(),items[i].getprice());
		}
	}
	
	
}

class Item{
	private int count;
	private int price;
	private String name;
	
	public Item(String name,int count,int price) {
		this.name=name;
		this.count=count;
		this.price=price;
	}
	
	public String getname() {
		return name;
		
	}
	public int getcount() {
		return count;
		
	}
	
	public int getprice() {
		return price;
	}
}