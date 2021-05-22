package aufgabe5;

public class SetOperationTest{

	public static void main(String[] args) {
		SetOperations so = new SetOperations();
		so.fill();
		so.fillBothUnion();
		so.print();
		so.fillBothIntersection();
		so.print();
		so.fillBothDifference();
		so.print();
	}

}
