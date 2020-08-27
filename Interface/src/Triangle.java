class Triangle extends Circle
{
    int b ,a,c;
    double ar,p,r,g;
    public void input()
    {
        super.input();
        a = 6;
        b = 4;
        c = 4;
    }
    public void area()
    {
        super.area();
        ar = a * b /2;
        System.out.println("Area of Triangle:"+ar);
        p = a + b+ c;
        System.out.println("Perimeter of Triangle:"+p);
        r = a * b/a+b+c;
        System.out.println("Radius of Triangle:"+r);
        g = c/2;
        System.out.println("Circumcircle Triangle:"+g);
        
    }
}