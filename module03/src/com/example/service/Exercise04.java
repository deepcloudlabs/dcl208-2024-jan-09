package com.example.service;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Calculator {
	double add(double x, double y);

	double subtract(double x, double y);

	double multiple(double x, double y);

	double divide(double x, double y);

	double power(double x, double y);

	double log(double base, double x);

	double sin(double x);

	double cos(double x);

	double tan(double x);

	double asin(double x);

	double acos(double x);

	double atan(double x);

	double km2mile(double length);

	double kg2pound(double length);
}

interface ArithmeticCalculator {
	double add(double x, double y);

	double subtract(double x, double y);

	double multiple(double x, double y);

	double divide(double x, double y);
}

interface TrigonometricCalculator {
	double sin(double x);

	double cos(double x);

	double tan(double x);

	double asin(double x);

	double acos(double x);

	double atan(double x);
}

interface LogarithmicCalculator {
	double power(double x, double y);

	double e(double x);

	double log(double base, double x);
}

interface UnitCalculator {
	double km2mile(double length);

	double kg2pound(double length);
}

@SuppressWarnings("unused")
class Client {
	private UnitCalculator unitCalculator;
}

class StandardCalculator implements ArithmeticCalculator, TrigonometricCalculator {

	@Override
	public double sin(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double cos(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tan(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double asin(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double acos(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double atan(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double add(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double subtract(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double multiple(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divide(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class ScientificCalculator
		implements ArithmeticCalculator, TrigonometricCalculator, LogarithmicCalculator, UnitCalculator {

	@Override
	public double km2mile(double length) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double kg2pound(double length) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double power(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double e(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double log(double base, double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sin(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double cos(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tan(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double asin(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double acos(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double atan(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double add(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double subtract(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double multiple(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divide(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}
}
