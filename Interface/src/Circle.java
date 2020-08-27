class Circle implements MyShape
{
    int r = 0;
    double pi = 3.14,ar, cr,dr ;
    
    public void input()
    {
        r = 5;
    }
   
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
        cr = 2 * pi * r;
        System.out.println("Circumference of a Circle:"+cr);
        dr = 2 * r;
        System.out.println("Diameter of a Circle:"+dr);
        
        
    }
}