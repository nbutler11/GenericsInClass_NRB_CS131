
public class ListApp {

	public static void main(String[] args) {
		FirstList<SquareGenerics>squareList = new FirstList<SquareGenerics>();
		FirstList<Point3d>pointList = new FirstList<Point3d>();
		FirstList<String>stringList = new FirstList<String>();
		
		SquareGenerics mySq = new SquareGenerics(4.0);
		SquareGenerics Sq2 = new SquareGenerics(2.7);
		squareList.addItem(mySq);
		squareList.addItem(Sq2);
		
		Point3d myP = new Point3d(3,2,6);
		Point3d P3 = new Point3d(4,5,7);
		pointList.addItem(P3);
		pointList.addItem(myP);
		
		String str = "Hello my name is";
		String s4 = "John";
		stringList.addItem(str);
		stringList.addItem(s4);
		
		System.out.println(mySq.toString());
		System.out.println(Sq2.toString());
		System.out.println(myP.toString());
		System.out.println(P3.toString());
		
		System.out.println(stringList.getItem(1));
		System.out.println(pointList.getItem(1));
		System.out.println(squareList.getItem(0));
	}

}
