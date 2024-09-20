public class stringTry {
    public static void main(String []args){
        String s="java";
        String s2="";
        String s1=s.toUpperCase();
        System.out.println(s1);
        System.out.println(s1.substring(1,3));
        System.out.println(s.replace('j','J'));
        System.out.println(s1.replaceAll("A","a"));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(0,3).concat(s.substring(3)));
        for(int i=s1.length()-1;i>=0;i--){
            s2= s2.concat(s1.substring(i,i+1));
        }
        System.out.println(s2);

        String a="Raj143"; // convert to 1rAJ34
        // char[] ch=a.toCharArray();
        // char[] ch1;
        String a1= ((a.substring(0, 3)).toUpperCase()).replace('R','r');
        System.out.println(a.substring(3,4 ).concat(a1).concat(a.substring(5).concat(a.substring(4,5 ))));
    }
}
