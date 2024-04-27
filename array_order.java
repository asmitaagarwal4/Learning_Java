public class array_order {
    public static void main(String[] args){
        int c=0;;
        int a[]={1,2,3,4,5};
        int b[]={5,4,3,2,1};
        for(int i=0; i<a.length-1;i++){
            if(a[i+1]>a[i]){
                c++;
            } else{
                break;
            }             
        }if(c==a.length-1){
            System.out.println("array is asending");
        }
        c=0;
        for(int i=0; i<b.length-1;i++){
            if(b[i+1]<b[i]){
                c++;
            } else{
                break;
            }             
        }if(c==a.length-1){
            System.out.println("array is descending");
        }
    }
}
