interface sports{
    void play();
    void rest();
    void enjoy();
}
class football implements sports{
    public void play(){
        System.out.println("football is good");
    }
    public void rest(){
        System.out.println("football  players rest");
    }
    public void enjoy(){
        System.out.println("football audience enjoy");
    }
}
class volleyball implements sports{
    public void play(){
        System.out.println("volleyball is good");
    }
    public void rest(){
        System.out.println("volleyball  players rest");
    }
    public void enjoy(){
        System.out.println("volleyball audience enjoy");
    }
}
class basketball implements sports{
    public void play(){
        System.out.println("baskteball is good");
    }
    public void rest(){
        System.out.println("baskteball  players rest");
    }
    public void enjoy(){
        System.out.println("baskteball audience enjoy");
    }
}

  

public class interfaceQ2 {
    public static void main(String[] args){
        basketball o1 = new basketball();
        o1.play();
        o1.rest();
        o1.enjoy();
    }
}

