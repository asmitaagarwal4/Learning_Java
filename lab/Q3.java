package lab;


// Write a Java program to create a class called "Student" with a name, grade,    
// and courses attributes, and methods to add and remove courses.

class Student{
    String name;
    char grade;
    String[] courses= new String[3];
    int i=0;

    public Student(String name, char grade ){
        this.name= name;
        this.grade=grade;
        return;
     }
    public void display(){
        System.out.println("name:" + name + "grade" + grade);
        return; 
    }

    public void addCourse(String  course){
        if(i>2){
            System.out.println("cannot add more courses");
        }else{
            courses[i]= course;
            i++; 
        } return;
    }

    public void removeCourse(){
        if(i>=0){
            i--;
            System.out.println("course removed is: "+ courses[i]);
            
        }else{
            System.out.println("no course to remove");
        }
    }
}

public class Q3 {
    public static void main(String[] args){
        String name= "Asmita";
        char grade='A';
        Student s1= new Student(name, grade);
        s1.addCourse("java");
        s1.addCourse("cpp");
        s1.addCourse("os");
        s1.addCourse("eng");
        s1.removeCourse();
    }
}
