package b2.beans.appContextTester;

public class B1Fruit {
	private String name;
	private String season;
	
	private B1Fruit(String name, String season){
		this.setName(name);
		this.setSeason(season);
	}
	
	//Default fruit is Mango
	private B1Fruit(){
		this.name = "Mango";
		this.season = "Summer";
	}
	
	public void fruitTest(){
		System.out.println("Greeting from Fruit");
		System.out.println("I am " + this.name + " and I can be found in " + this.season);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

}
