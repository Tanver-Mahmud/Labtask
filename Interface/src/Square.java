
class Square extends Circle
{
    int a;
    double sr ,sb;
    public void input()
    {
        super.input();
        a = 2;
        
    }
    public void area()
    {
        super.area();
        sr = a * a;
        System.out.println("Area of Square:"+sr);
       
       System.out.println("Diagonal of a Square=" + a * Math.sqrt(2));
    }
}