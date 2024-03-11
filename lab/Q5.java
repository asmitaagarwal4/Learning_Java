package lab;

// Write a Java program to create a base class Shape with a method called 
// calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override 
// the calculateArea() method in each subclass to calculate and return the shape's 
// area. Write a Program to call base class constructor and method using super keyword 
// in java.

class shape{
    shape(){
        System.out.print("This shape is: ");
    }
    shape(int a){
        System.out.println("Shapes are: \n circle \n rectangle \n traiangle "+ a);
    }
    public void calculateArea(){
        System.out.println("To calculate area of a shape");
    }
}

class circle extends shape{
    private int radius;
    circle(int radius){
        super();
        System.out.println("circle");
        this.radius=radius;
    }
    public void calculateArea(){
        super.calculateArea();
        System.out.println("Area of circle is:" +2*radius*3.14);
    }
}

class rectangle extends shape{
    private int length ; 
    private int bredth;
    rectangle(int length , int bredth){
        super();
        System.out.println("rectangle");
        this.length=length;
        this.bredth= bredth;
    }
    public void calculateArea(){
        super.calculateArea();
        System.out.println("Area of rectagle is:" + length*bredth);
    }
}

class triangle extends shape{
    private int base ; 
    private int height;
     triangle(int base , int height){
        super();
        System.out.println("triangle");
        this.base=base;
        this.height= height;
    }
    public void calculateArea(){
        super.calculateArea();
        System.out.println("Area of triangle is:" + 0.5*base*height);
    }
}

public class Q5 {
    public static void main(String[] args){
        circle c= new circle(3);
        rectangle r= new rectangle(3, 4);
        triangle t = new triangle(4, 6);
        c.calculateArea();
        r.calculateArea();
        t.calculateArea();  
    }
}
