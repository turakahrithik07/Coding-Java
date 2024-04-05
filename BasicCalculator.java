public class BasicCalculator
{
    public double add(double a, double b){
        return a+b;
    }

    public double subtract(double a, double b){
        return a-b;
    } 

    public double multiply(double a, double b){
        return a*b;
    }

    public double divide(double a, double b){
        if(b!=0){
            return a/b;
        } else{
            System.out.println("Can't divide " + a + " with 0");
        }
      return -1; 
    }
  public static void main(String[] args){ 
    BasicCalc Calculation = new BasicCalc();
    System.out.println(Calculation.add(5,5));
    System.out.println(Calculation.subtract(5,5));
    System.out.println(Calculation.multiply(5,5));
    System.out.println(Calculation.divide(7,6));
    System.out.println(Calculation.divide(7,0));
  }
}
