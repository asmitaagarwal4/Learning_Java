import java.util.*;
import java.lang.*;


class microsoft2 {
    public static void main(String[] args){
        System.out.println(solution("29162","10524")); 
    }
    public static int solution(String S, String T) {
        // Implement your solution here
        
        int l=S.length();
        int flag=-1;
        int index=-1;

        for(int i=0;i<l;i++){
            if(S.charAt(i)!=T.charAt(i)){
                if(S.charAt(i)<T.charAt(i)){
                    flag=1;
                    index=i+1;
                    break;
                }else{
                    flag=0;
                    index=i+1;
                    break;
                }
            }
        }
        if(flag==-1){
            return 0;
        }
        if(flag==0){
            int swapCount1=0,swapCount2=0;
            for(int i=index;i<l;i++){
                if(S.charAt(i)==T.charAt(i)){
                    continue;
                }if(S.charAt(i)>T.charAt(i))
                    swapCount1++;
                else
                    swapCount2++;
            }
            return Math.min(swapCount1,(swapCount2+1));
        }else{
            int swapCount1=0,swapCount2=0;
            for(int i=index;i<l;i++){
                if(S.charAt(i)==T.charAt(i)){
                    continue;
                }if(S.charAt(i)<T.charAt(i))
                    swapCount1++;
                else
                    swapCount2++;
            }
            return Math.min(swapCount1,(swapCount2+1));
        }
         
    }
}
