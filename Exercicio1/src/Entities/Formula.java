package Entities;

public class Formula {
	
	public double width;
	public double height;
	
	//Calculando a área
	public double area() {
		return width * height;
	}
	
	//Calculando o Perímetro
	public double perimeter() {
		return 2 * (width + height);
	}
	
	//Calculando a Diagonal
	public double Diagonal() {
		return Math.sqrt(width * width + height * height);
	}
	

}
