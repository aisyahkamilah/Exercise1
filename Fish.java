//Author : Maslita Abd Aziz
public class Fish {

	//Atttribute or data member or fields
	private String color = "blue"; //default valueS

	//Method
	public void Swim () {
		System.out.println(color + " fish swim");
	}

	//Setter / Mutator method
	public void SetColor(String warna) {
		color = warna;

	}

	//Getter / Accessor method
	public String GetColor() {
		return color;
	}
}