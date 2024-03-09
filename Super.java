class bank {
    String name = "sbi";
    

    bank() {
        System.out.println(name);
    }

    void payment() {
        System.out.println("payments");
    }
}

class atm extends bank {
    atm(){
        super();
    }
    void payment() {
        String name = "atm";
        System.out.println("“payments atm”");
        System.out.println(name);
        super.payment(); // here see the use of super.
    }

}

class Super {
    public static void main(String[] args) {
        atm o1 = new atm();
        o1.payment();
    }
}
