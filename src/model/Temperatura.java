package model;

public class Temperatura {
	
	private double celsius;


public double getCelsius() {
	return celsius;
}

public void setCelsius(double celsius) {
	this.celsius = celsius;
}
	
public double converterParaKelvin() {
	double kelvin = (celsius + 273);
	return celsius;
}

public double converterParaFahreinheit() {
	return celsius;
}


}



