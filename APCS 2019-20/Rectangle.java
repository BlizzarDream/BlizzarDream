public class Rectangle
{
  private double length;
  private double width;
  
  public Rectangle(double l, double w)
  {
    length = l;
    width = w;
  }
  public double getArea() {
    return length*width;
  }
}