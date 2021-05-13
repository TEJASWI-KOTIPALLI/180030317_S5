package student1;

public class CobOne {

    double h,w,d;

     CobOne(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
    CobOne bc = new CobOne(8.5,80.3,9.6);
    System.out.println(bc.volume());

    }

}