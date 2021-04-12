package l3as1;

public class Marks {

double a;
double b;
double c;

Marks(){
    
} 
Marks(double A, double B, double C)
{
    a = A;
    b = B;
    c = C;
    
}
public double sum(){
    
    double sum  = a + b + c;
    return sum;
}
    
}
