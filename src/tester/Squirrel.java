package tester;

import interfaces.Comparator;




public class Squirrel implements Comparable<Squirrel>{
	private boolean amorphous;
	private Colors color;
	private int size;
	private String name;
	private int weight;
	private boolean sex;
	
	
	
	
	public Squirrel(boolean amorphous, Colors color, int size, String nickname,
			int weight, boolean sex) {
		super();
		this.amorphous = amorphous;
		this.color = color;
		this.size = size;
		this.name = nickname;
		this.weight = weight;
		this.sex = sex;
	}
	


	
	
	public boolean isAmorphous() {
		return amorphous;
	}
	public void setAmorphous(boolean amorphous) {
		this.amorphous = amorphous;
	}
	public Colors getColor() {
		return color;
	}
	public void setColor(Colors color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String nickname) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public int compareTo(Squirrel o) {
		if(this.size<o.size) return -1;
		if(this.size>o.size) return 1;
			return 0;
	}





	@Override
	public String toString() {
		return  name + ", S: " + size;
	}



	
	
	
	
}

	