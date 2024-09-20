package lab;

// Write a Java program to create an abstract class GeometricShape with abstract 
// methods area() and perimeter(). Create subclasses Triangle and Square that extend 
// the GeometricShape class and implement the respective methods to calculate the 
// area and perimeter of each shape. 

abstract class geometricShape {
    abstract double area();
    abstract double perimeter();
}

class Triangle extends geometricShape{
    private double base,height;
    private double s1,s2,s3;
    public Triangle(double base,double height,double s1,double s2,double s3){
        this.base=base;
        this.height=height;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    double area(){
        return (0.5*base*height);
    }
    double perimeter(){
        return(s1+s2+s3);
    }
}

class square extends geometricShape {
    private int s;

    public square(int s) {
        this.s = s;
    }

    public double area() {
        return s * s;
    }

    public double perimeter() {
        return 4 * s;
    }
}


public class Q7 {
        public static void main(String[] args){
        Triangle t= new Triangle(2, 4, 7, 6,6);
        square s= new square(4);
        System.out.println(t.area());
        System.out.println(s.perimeter()); 
    }
}
