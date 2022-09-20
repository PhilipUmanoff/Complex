public class Distance {
    /**
    *We are only allowed to store
    *the meters the user will input
    */
    double meters;

    public Distance (double m) {
      meters = m;
    }
      /** 
      * Storing user input 
      */

      public void setMeters(double m) {
       meters = m;
      }
  
      /** 
      * Retrieve stored meter value
      */
      public double getMeters() {
        return meters;
      }
  
      /** Meters to Inches */
      public double getInches() {
        return (getMeters() * 39.37);
      }
  
      /** Meters to Feet */
      public double getFeet() {
        return (getInches() / 12);
      }
}