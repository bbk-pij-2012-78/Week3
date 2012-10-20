//public class point2point {

    public static void main(args) {
        int x = 0;
    
        Point pnt1 = new Point();
        Point pnt2 = new Point();
        Point pnt3 = new Point();
    	
        ReadValues(pnt1);
        ReadValues(pnt2);
        ReadValues(pnt3);
        println(pnt1.difference().abs());
        
        if (pnt1.difference().abs() < pnt2.difference().abs()) {
            if (pnt1.difference().abs() < pnt3.difference().abs()) {
                print('Point 1 Closest')
            }
            else {
                print('Point 3 Closest')
            }   
        }
        else {
            if (pnt2.difference().abs() < pnt3.difference().abs()) {
                print('Point 2 Closest')
            }
            else {
                print('Point 3 Closest')
            }         
        }
        
    }
    
    static void ReadValues(Point pnt) {
        
        print('Enter x value: ');
        pnt.x = Double.parseDouble(System.console().readLine());
        
        print('Enter y value: ');
        pnt.y = Double.parseDouble(System.console().readLine());
    }
//}

class Point {
    double x = 0;
    double y = 0;

    Double difference() {
        return (this.x - this.y);
    }
}