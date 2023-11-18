package Entidades;

public class Triangulo {
	
	public double a;
	public double b;
	public double c;



public double area () {
	double p = (a + b + c) /2.0;
	double Result = Math.sqrt((p - a) * (p - b) * (p - c));
	return Result;
}
	
}