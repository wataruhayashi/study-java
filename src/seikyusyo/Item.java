package seikyusyo;

public class Item {

	Shohin[] items = new Shohin[3];

	public Item() {
		items[0] = new Shohin(1,"鉛筆",80);
		items[1] = new Shohin(2,"ペン",100);
		items[2] = new Shohin(3,"筆箱",200);
	}
	public Shohin getShohin(int c) {
		for(Shohin s : items) {
			if(s.code == c) {
				Shohin sho = new Shohin(c,s.name,s.tanka);
				return sho;
			}
		}
		return null;
	}
	public void list() {
		for(Shohin s : items){
			System.out.println(s.code + "\t" + s.name + "\t" + s.tanka + "\t");
		}
	}
}