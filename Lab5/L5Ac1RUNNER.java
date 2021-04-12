package l5ac1;

public class L5Ac1RUNNER {

    public static void main(String[] args) {
       ObjectPass p = new ObjectPass();
    p.value = 5;
    System.out.println("Before calling: " + p.value);
    p.increment(p);
    System.out.println("After calling: " + p.value);

    }
    
}
