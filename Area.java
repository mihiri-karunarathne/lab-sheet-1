import java.util.Scanner;
public class Area {
    double length;
    double breadth;
    void setDim(double l,double b){
        length =l;
        breadth = b;
    }
    double getArea(){
        return length*breadth;
    }
}
