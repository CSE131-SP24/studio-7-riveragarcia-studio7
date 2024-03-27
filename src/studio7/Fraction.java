package studio7;

public class Fraction {
	public int numerator;
	public int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator()  {
		return this.denominator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public Fraction add(Fraction f1) {
		int numerator = this.numerator * f1.denominator + f1.numerator * this.denominator;
		int denominator = this.denominator * f1.denominator;
		Fraction f3 = new Fraction(numerator, denominator);
		return f3;
	}
	public Fraction multiply(Fraction f2) {
		int numerator = this.numerator * f2.numerator;
		int denominator = this.denominator * f2.denominator;
		Fraction f3 = new Fraction(numerator, denominator);
		return f3;
	}
	public Fraction reciprocal() {
		int numerator = this.denominator;
		int denominator = this.numerator;
		Fraction f3 = new Fraction(numerator, denominator);
		return f3;
	}
	public Fraction simplify(Fraction f5) {
		for (int i = (Math.max(numerator, denominator)); i > 1; i--) {
			if (numerator % i ==0 && denominator % i ==0) {
				Fraction f3 = new Fraction(numerator / i, denominator / i);
				return f3;
			}
		}
		Fraction f3 = new Fraction(numerator, denominator);
		return f3;
	}
	}
						
