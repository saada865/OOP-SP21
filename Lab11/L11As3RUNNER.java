package l11as3;

public class L11As3RUNNER {

    public static void main(String[] args) {
       
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7.8);
        Rectangle r1 = new Rectangle(6, 7.2);
        CalculateAreas syst = new CalculateAreas();
        syst.add(c1);
        syst.add(c2);
        syst.add(r1);
        syst.printAreas();
    }
    
}
