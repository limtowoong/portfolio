package gogogogo;

public class Medic {
	String name;
	int mp;
	
public Medic() {
	this("이름없음", 60);
//	this.name = "이름없음";
// 	this.mp = 60;
}
	
public Medic(String name, int mp) {
		this.name = name;
		this.mp = mp;
	}
}
