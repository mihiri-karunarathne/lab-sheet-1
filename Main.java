public class Main {
    public static void main(String[] args) {
       /*  Area r = new Area();
        double length = 5;
        double breadth = 3.5;
        r.setDim(length, breadth);
        double area = r.getArea();
        System.out.println("Area of rectangle"+ area );
    }*/
  Scanner sc =new Scanner(System.in);
  Area r = new Area();
  System.out.println("enter length:");
  double length = sc.nextDouble();
  System.out.println("ënter breadth:");
  double breadth = sc.nextDouble();
  System.out.println();

 r.setDim(length, breadth);
 double area = r.getArea();
 System.out.println("Area of rectangle"+ area );
 Scanner.close();

    }
}
