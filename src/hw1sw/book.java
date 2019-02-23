package hw1sw;

import java.util.ArrayList;

public class book {
	ArrayList <product> ruba = new ArrayList();
	
	public int getcount() {
		// TODO Auto-generated method stub
		return ruba.size();
	}

	public int getprice() {
		int pr=0;
		
for (int i = 0;i<ruba.size();i++)	{
	pr+=ruba.get(i).price;
	
}
return pr;
	}

	public void add(product p) {
		// TODO Auto-generated method stub
		ruba.add(p);
		
	}

}
