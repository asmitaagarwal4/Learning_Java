import java.lang.String;
public class microsoft1 {
 
public static void main(String[] args){
    
    System.out.println(solution3("NWWEWN"));
}

public static String solution3(String forth){
    int l= forth.length();
    int[][] arr=new int[l+1][2];
    arr[0][0]=0;
    arr[0][1]=0;
    int maxx=0,minx=0;
    StringBuilder ans=new StringBuilder();

    for(int i=1;i<=l;i++){
        char c= forth.charAt(i-1);
        if(c=='N'){
            arr[i][0]=arr[i-1][0];
            arr[i][1]=arr[i-1][1]+1;
        }
        else if(c=='E'){
            arr[i][0]=arr[i-1][0]+1;
            arr[i][1]=arr[i-1][1];
        }
        else if(c=='W'){
            arr[i][0]=arr[i-1][0]-1;
            arr[i][1]=arr[i-1][1];
        }
        System.out.println(arr[i][0]+" "+arr[i][1]); 
        maxx= arr[i][0]>maxx?arr[i][0]:maxx;
        minx= arr[i][0]<minx?arr[i][0]:minx;
    }
    int minD=(maxx-arr[l][0])<Math.abs(minx-arr[l][0])?maxx-arr[l][0]:minx-arr[l][0];
    System.out.println(minD +" "+maxx+ " "+ minx);

    for(int i=0;i<=Math.abs(minD);i++){
        if(minD<=0){
            ans.append('W');
        }else{
            ans.append('E');
        }
    }
    for(int i=0;i<arr[l][1];i++){
        ans.append('S');
    }

    for(int i=0;i<=Math.abs(minD+arr[l][0]);i++){
        if(minD<=0){
            ans.append('E');
        }else{
            ans.append('W');
        }
    }
    return ans.toString();
}

}

    //  public static String solution(String forth) {
    //     // Implement your solution here
    //     int n= forth.length();
    //     // String ans = "";
    //     StringBuilder ans= new StringBuilder();
        
    //     int cN=0;
    //     int cE=0;
    //     int cW=0;
    //     for(int i=0;i<n;i++){
    //         char c= forth.charAt(i);
    //         if(c=='N')
    //             cN++;
    //         if(c=='W')
    //             cW++;
    //         if(c=='E')
    //             cE++;
    //     }
    //     int cside;
    //     char side;
    //     if(cE>cW){
    //         cside=cE-cW;
    //         side='E';
    //     }else if (cW>cE){
    //         cside=cW-cE;
    //         side='W';
    //     }else{
    //         cside=0;
    //         side='A';
    //     }
    //     for(int i=0;i<cside+1;i++){
    //         if(side=='W'){
    //             ans.append('E');
    //         }if(side=='E'){
    //             ans.append('W');
    //         }
    //     }
    //     for(int i=0;i<cN;i++){
            
    //             ans.append('S');
    //     }
        
    //         if(side=='W'){
    //             ans.append('W');
    //         }if(side=='E'){
    //             ans.append('E');
    //         }
        
    //     if(cside==0){
    //         ans.insert(0,'E');
    //         ans.append('W');
    //     }
    //     return ans.toString();
    // }

    // public static String solution1(String forth) {
    //     int eastCount = 0;
    //     int westCount = 0;
    //     for (int i = 0; i < forth.length(); i++) {
    //         if (forth.charAt(i) == 'E') {
    //             eastCount++;
    //         } else if (forth.charAt(i) == 'W') {
    //             westCount++;
    //         }
    //     }

    //     StringBuilder sb = new StringBuilder();
    //     // Go west if there are more 'E' than 'W' in forth
    //     if (eastCount > westCount) {
    //         for (int i = 0; i < eastCount - westCount; i++) {
    //             sb.append('W');
    //         }
    //     }
    //     // Go east if there are more 'W' than 'E' in forth
    //     else if (westCount > eastCount) {
    //         for (int i = 0; i < westCount - eastCount; i++) {
    //             sb.append('E');
    //         }
    //     }
    //     // Go south
    //     for (int i = 0; i < forth.length() - 1; i++) {
    //         sb.append('S');
    //     }
    //     // Go east if we went west before, or go west if we went east before
    //     if (eastCount > westCount) {
    //         for (int i = 0; i < eastCount; i++) {
    //             sb.append('E');
    //         }
    //     } else {
    //         for (int i = 0; i < westCount; i++) {
    //             sb.append('W');
    //         }
    //     }
    //     System.out.println(sb.toString());
    //     return sb.toString();
    // }


   


