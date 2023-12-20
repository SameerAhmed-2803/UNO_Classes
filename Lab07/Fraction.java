public class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = Math.abs(numerator);
        this.numerator *= (numerator * denominator >= 0) ? 1 : -1;
        this.denominator = Math.abs(denominator);

    }
    public int getDenominator(){
        return this.denominator;
    }
    public int getNumerator(){
        return this.numerator;
    }
    public Fraction add(Fraction other){
        int newNumerator = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;
        int newDenominator = this.denominator * other.getDenominator();
        //simplify
        Fraction sum = this.simplify(newNumerator, newDenominator);
        return sum;
    }
    public Fraction subtract(Fraction other){
        int newNumerator = this.numerator * other.getDenominator() - other.getNumerator() * this.denominator;
        int newDenominator = this.denominator * other.getDenominator();
        Fraction difference = this.simplify(newNumerator, newDenominator);
        return difference;
    }
    public Fraction multiply(Fraction other){
        int newNumerator = this.numerator * other.getNumerator();
        int newDenominator = this.denominator * other.getDenominator();
        Fraction product = this.simplify(newNumerator, newDenominator);
        return product;
    }
    public Fraction divide(Fraction other){
        int newNumerator = this.numerator * other.getDenominator();
        int newDenominator = this.denominator * other.getNumerator();
        return this.simplify(newNumerator, newDenominator);
    }
    public Fraction simplify(int numerator, int denominator){
        for(int i = denominator; i > 0; i--){
            if(numerator % i == 0 && denominator % i == 0){
                numerator /= i;
                denominator /= i;
            }
        }
        return new Fraction(numerator, denominator);
    }
    @Override
    public String toString(){
        return String.format("(%d/%d)", numerator, denominator);
    }
}