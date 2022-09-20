public class Complex {

  /*
  * Create private variables in Complex class
  */
  private double real;
  private double imag;

  /*
  * Default Constructor + Constructor variable
  */

  public Complex(){}
  public Complex (double r, double i) {
    real = r;
    imag = i;
  }

  /*
  * Getter methods
  */
  public double getReal() {
    return real;
  }

  public double getImag() {
    return imag;
  }

  /*
  * Setter methods
  * @param r the new value for the real number

  */
  public void setReal (double r) {
    real = r;
  }

  public void setImag (double i) {
    imag = i;
  }

  /*
  * Adding two complex numbers by taking an object as a parameter 
  * Making sure to only add real with real and imag with imag
  */
  
  public void addComplex (Complex c) {
    real += c.real;
    imag += c.imag;
  }

  /*
  * Subtracting an object parameter from the object we are in
  * Making sure to only sub real with real and imag with imag
  */
  public void subtractComplex (Complex c) {
    real -= c.real;
    imag -= c.imag;
  }

  /*
  *FOIL Method: (a+b) * (c+d) = ac + ad + bc + bd
  */
  public void multiplyComplex (Complex c) {
    double ab = real * c.real;
    double ad = real * c.imag;
    double bc = imag * c.real;
    double bd = imag * c.imag;
    real = ab;
    imag = ad + bc + bd;
  }

  /*
  *
  */
  public void print() {
    if(imag < 0) {
      System.out.println(real + " " + imag + "i");
    }
    else {  
    System.out.println(real + "+" + imag + "i");
    }
  }
}