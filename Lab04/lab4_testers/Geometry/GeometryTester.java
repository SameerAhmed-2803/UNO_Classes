public class GeometryTester
{
	public static void main(String[] args)
	{
		String error;
		error = testGetAreaRectangle();
		if (error != null) { System.out.println(error); return;}
		error = testGetAreaCircle();
		if (error != null) { System.out.println(error); return;}
		error = testGetAreaTriangle();
		if (error != null) { System.out.println(error); return;}
		error = testGetPerimeterRectangle();
		if (error != null) { System.out.println(error); return;}
		error = testGetPerimeterCircle();
		if (error != null) { System.out.println(error); return;}
		error = testGetPerimeterTriangle();
		if (error != null) { System.out.println(error); return;}
		System.out.println("Geometry: Correct!");
	}

	public static String testGetAreaRectangle()
	{
		double area;

		area = Geometry.getAreaRectangle(1,1);
		if (area != 1) return "Geometry.getAreaRectangle(1,1)";
		area = Geometry.getAreaRectangle(2,3);
		if (area != 6) return "Geometry.getAreaRectangle(2,3)";
		area = Geometry.getAreaRectangle(9999999,99998999);
		if (area != 9.99989890001001E14) return "Geometry.getAreaRectangle(9999999,99998999)";
		area = Geometry.getAreaRectangle(0.5,0.4);
		if (area != 0.2) return "Geometry.getAreaRectangle(0.5,0.4)";
		return null;
	}

	public static String testGetAreaCircle()
	{
		double area;

		area = Geometry.getAreaCircle(1);
		if (area != 3.141592653589793) return "Geometry.getAreaCircle(1)";
		area = Geometry.getAreaCircle(2);
		if (area != 12.566370614359172) return "Geometry.getAreaCircle(2)";
		area = Geometry.getAreaCircle(9999999);
		if (area != 3.141592025271294E14) return "Geometry.getAreaCircle(9999999)";
		area = Geometry.getAreaCircle(0.5);
		if (area != 0.7853981633974483) return "Geometry.getAreaCirlce(0.5)";
		return null;
		
	}

	public static String testGetAreaTriangle()
	{
		double area;

		area = Geometry.getAreaTriangle(1,1);
		if (area != 0.5) return "Geometry.getAreaTriangle(1,1)";
		area = Geometry.getAreaTriangle(2,3);
		if (area != 3.0) return "Geometry.getAreaTriangle(2,3)";
		area = Geometry.getAreaTriangle(9999999,99998999);
		if (area != 4.999949450005005E14) return "Geometry.getAreaTriangle(9999999,99998999)";
		area = Geometry.getAreaTriangle(0.5,0.4);
		if (area != 0.1) return "Geometry.getAreaTriangle(0.5,0.4)";
		return null;
	}

	public static String testGetPerimeterRectangle()
	{
		double perimeter;

		perimeter = Geometry.getPerimeterRectangle(1,1);
		if (perimeter != 4.0) return "Geometry.getPerimeterRectangle(1,1)";
		perimeter = Geometry.getPerimeterRectangle(2,3);
		if (perimeter != 10.0) return "Geometry.getPerimeterRectangle(2,3)";
		perimeter = Geometry.getPerimeterRectangle(9999999,99998999);
		if (perimeter != 2.19997996E8) return "Geometry.getPerimeterRectangle(9999999,99998999)";
		perimeter = Geometry.getPerimeterRectangle(0.5,0.4);
		if (perimeter != 1.8) return "Geometry.getPerimeterRectangle(0.5,0.4)";
		return null;
	}

	public static String testGetPerimeterCircle()
	{
		double perimeter;

		perimeter = Geometry.getPerimeterCircle(1);
		if (perimeter != 6.283185307179586) return "Geometry.getPerimeterCircle(1)";
		perimeter = Geometry.getPerimeterCircle(2);
		if (perimeter != 12.566370614359172) return "Geometry.getPerimeterCircle(2)";
		perimeter = Geometry.getPerimeterCircle(9999999);
		if (perimeter != 6.2831846788610555E7) return "Geometry.getPerimeterCircle(9999999)";
		perimeter = Geometry.getPerimeterCircle(0.5);
		if (perimeter != 3.141592653589793) return "Geometry.getPerimeterCirlce(0.5)";
		return null;
	}

	public static String testGetPerimeterTriangle()
	{
		double perimeter;

		perimeter = Geometry.getPerimeterTriangle(1,1,1);
		if (perimeter != 3.0) return "Geometry.getPerimeterTriangle(1,1,1)";
		perimeter = Geometry.getPerimeterTriangle(2,3,4);
		if (perimeter != 9.0) return "Geometry.getPerimeterTriangle(2,3,4)";
		perimeter = Geometry.getPerimeterTriangle(9999999,99998999,9999999);
		if (perimeter != 1.19998997E8) return "Geometry.getPerimeterTriangle(9999999,99998999,9999999)";
		perimeter = Geometry.getPerimeterTriangle(0.5,0.4, 0.3);
		if (perimeter != 1.2) return "Geometry.getPerimeterTriangle(0.5,0.4,0.3)";
		return null;
	}




}