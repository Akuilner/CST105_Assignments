public class Octagon extends GeometricObject implements Cloneable ,
Comparable<Octagon>{
	
	double side;
	
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea()) 
			return 1;
		
		else if (getArea() < o.getArea()) 
			return -1;
		
		else
			return 0;
	}
	
	 public Octagon() {
	  
	 }
	 
	 public Octagon(double side) {
	  this.side = side;
	 }
	 
	 @Override
	 public double getArea() {
	 return ((2 + 4.0 / Math.sqrt(2)) * side * side);
  
	 }
	 
	 @Override
	 public double getPerimeter() {
	  return side * 8;
	 }
	 
	 public Object clone() {
	  Object o = null;
	  try {
	   o = super.clone();
	  } catch (CloneNotSupportedException ex) {
	   ex.printStackTrace();
	  }
	  return o;
	 }
	 
	 @Override
	 public boolean equals(Object o) {
	  return o instanceof Octagon && getArea() == ((Octagon)o).getArea();
	 }

	

	
	

}
