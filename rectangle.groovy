
public static void main(args) {
int x = 0;

    Rectangle rec = new Rectangle();

    print('Enter Left Value: ')
    rec.upLeft = Double.parseDouble(System.console().readLine());
  
    print('Enter Right Value: ')
    rec.downRight = Double.parseDouble(System.console().readLine());
    
    println('Perimeter: ' + rec.perimeter())
    print('Area: ' + rec.area())

}
    

class Rectangle {
    double upLeft;
    double downRight;

    Double perimeter() {
        return ((this.upLeft * 2) + (this.downRight * 2));
    }
    
    Double area() {
        return (this.upLeft * this.downRight);
    }
}