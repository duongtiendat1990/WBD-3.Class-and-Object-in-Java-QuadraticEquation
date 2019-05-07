public class QuadraticEquation {
  private double a;
  private double b;
  private double c;
  QuadraticEquation(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public double getDiscriminant(){
    double  delta = b*b - 4*a*c;
    return delta;
  }
  private double  getRoot1(double delta){
    double root1 = (-b+Math.sqrt(delta))/(2*a);
    return root1;
  }
  private double  getRoot2(double delta){
    double root2 = (-b-Math.sqrt(delta))/(2*a);
    return root2;
  }
  public void getRoot(){
    if (a!=0&&b!=0){
      double delta = getDiscriminant();
      if (delta<0) System.out.println("No solution\n");
      else {
        double root1= getRoot1(delta);
        double root2 = getRoot2(delta);
        System.out.printf("The equation has two root: %f and %f\n",root1,root2);
      }
    }
    if (a == 0) linearEquationResolver(b,c);
  }
  private void linearEquationResolver(double a, double b) {
    if (a != 0) {
      double answer = -b / a;
      System.out.printf("The equation has one root is %f\n",answer);
    }
    else {
      if (b == 0) {
        System.out.print("The solution is all x!\n");
      }
      else {
        System.out.print("No solution!\n");
      }
    }
  }
}
