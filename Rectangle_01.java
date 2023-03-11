//No-Argument Construtor!
class Rectangle_1 {
    double length;
    double breadth;

    Rectangle_1(){
        length=15.5;
        breadth=10.67;
    }

    double calculateArea(){
        return length*breadth;
    }
}

class Rectangle_01{
    public static void main(String[]args) {
        double area;
        // object creation creates the default construtor automatically without visible.
        Rectangle_1 myrec =new Rectangle_1();
        area =myrec.calculateArea();
        System.out.println("The area of the Rectangle :" +area);
    }
}
