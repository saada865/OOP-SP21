package l6ac2;

public class L6Ac2RUNNER {

    public static void main(String[] args) {
    
    NoOfObjects o1 = new NoOfObjects();
    NoOfObjects o2 = new NoOfObjects(122);
    NoOfObjects o3 = new NoOfObjects(150);
    System.out.println("Objects created:"+ NoOfObjects.getObjs());
    System.out.println("Objects created:"+ o1.getObjs());
    
    }
    
}
