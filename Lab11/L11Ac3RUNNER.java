package l11ac3;

public class L11Ac3RUNNER {

    public static void main(String[] args) {
        
        I1 i1 = new B1();
i1.methodI1(); // OK as methodI1 is present in B1
// i1.methodI2(); Compilation error as methodI2 not present in I1
// Casting to convert the type of the reference from type I1 to type I2
((I2) i1).methodI2();
I2 i2 = new B1();
i2.methodI1(); // OK
i2.methodI2(); // OK
// Does not Compile as methodA1() not present in interface reference I1
// String var = i1.methodA1();
// Hence I1 requires a cast to invoke methodA1
String var2 = ((A1) i1).methodA1();
System.out.println("var2 : " + var2);
String var3 = ((B1) i1).methodA1();
System.out.println("var3 : " + var3);
String var4 = i1.toString();
System.out.println("var4 : " + var4);
String var5 = i2.toString();
System.out.println("var5 : " + var5);
I1 i3 = new C1();
String var6 = i3.toString();
System.out.println("var6 : " + var6); // It prints the Object toString() method
Object o1 = new B1();
// o1.methodI1(); does not compile as Object class does not define
// methodI1()
// To solve the probelm we need to downcast o1 reference. We can do it
// in the following 4 ways
((I1) o1).methodI1(); // 1
((I2) o1).methodI1(); // 2
((B1) o1).methodI1(); // 3
        
    }
    
}
