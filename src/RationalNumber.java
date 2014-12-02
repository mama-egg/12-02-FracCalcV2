//RationalNumber represents a fraction with an integer numerator and denominator
public class RationalNumber {
  
  public RationalNumber() { //Constructs a new rational number to represent the ratio (0/1)
    int[] rnarray = new int[2];
  }
  
  public RationalNumber(int numerator, int denominator) { //Constructs a new rational # to represent reduced ratio
    rnarray[0] = numerator;
    rnarray[1] = denominator;
  }
  
  public int getDenominator() {
    return rnarray[1];
  }
  
  public int getNumerator() {
    return rnarray[0];
  }
  
  // Euclid's algorithm - http://en.wikipedia.org/wiki/Euclidean_algorithm
  public int GreatestCommonDivisor(int first, int second) {
    int temp;
    while (second != 0) {
      temp = second;
      second = first % second;
      first = temp;
    }
    return first;
  }
  
  public String toString() {
    return rnarray[0] + "/" + rnarray[1];
  }
  
  public void add(RationalNumber frac) {
    
  }
  
  public void subtract(RationalNumber frac) {
    
  }
  
  public void multiply(RationalNumber frac) {
    
  }
  
  public void divide(RationalNumber frac) {
    
  }
}
