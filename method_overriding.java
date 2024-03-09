class test{
    public void happy(int a){
        System.out.println("test"+a);
    }
}
class test1 extends test{
    public void happy(int a){
        System.out.println("test1"+a);
    }
}
class test2 extends test{
    public void happy(int a){
        System.out.println("test2"+a);
    }
}
class method_overriding {
    public static void main(String[] args){
        test1 o1= new test1();
        o1.happy(4);
        test2 o2= new test2();
        o2.happy(5);
        test o3= new test();
        o3.happy(8);
    }
}
