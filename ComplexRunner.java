import java.util.Scanner;

public class ComplexRunner {
  public static void main(String[] args) {
    /*
    * Create the first complex number, c1, and display
    */
    Complex c1 = new Complex(5.1, 8.3);
    c1.print();

    /*
    * Create the second complex number, c2, and display
    */
    Complex c2 = new Complex(12.4, 19.1);
    c2.print();

    /*
    * Testing all functions
    */
    c1.addComplex(c2);
    c1.print();
    
    c1.subtractComplex(c2);
    c1.print();
    
    c1.multiplyComplex(c2);
    c1.print();
    
  }
}