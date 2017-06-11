public class Exercise13_11 extends Octagon {

    public static void main(String[] args) {
        Octagon oc1 = new Octagon(5);
        
        //added for testing
        Octagon oc2 = (Octagon)oc1.clone();
        
        //added for testing
        //Octagon oc2 = new Octagon(6);
        
        //added for testing
        //Octagon oc2 = new Octagon(3);
        
        //oc1 info
        System.out.print("--------------OC1 INFORMATION--------------");
        System.out.print("\nEach side of the first octagon is: " + (int)(oc1.getPerimeter() / 8));
        System.out.print("\nThe perimeter of the first octagon is: " + (int)oc1.getPerimeter());
        System.out.print("\nThe area of the first octagon is: " + oc1.getArea() + "\n");
        
        //oc2 info
        System.out.print("\n--------------OC2 INFORMATION--------------");
        System.out.print("\nEach side of the second octagon is: " + (int)(oc2.getPerimeter() / 8));
        System.out.print("\nThe perimeter of the second octagon is: " + (int)oc2.getPerimeter());
        System.out.print("\nThe area of the second octagon is: " + oc2.getArea() + "\n");
        
        
        //comparison
        int comparison = oc1.compareTo(oc2);
        
        switch(comparison) {
        
        case -1: System.out.println("\nThe area of the second octagon is greater than the area of the first one.");
        break;
        
        case 1: System.out.println("\nThe area of the first octagon is greater than the area of the second one.");
        break;
        
        case 0: System.out.print("\nThe areas of the two octagons are identical");
        }
    }
}
