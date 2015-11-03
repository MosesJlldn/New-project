import java.util.Scanner;

class Vector{
	private double x;
	private double y;
	private double z;
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double getZ() {
		return this.z;
	}

	public String getAddition(Vector vector) {
		return ("{" + (this.x + vector.getX()) + ";" + (this.y + vector.getY()) + ";" + (this.z + vector.getZ()) + "}");
	}

	public String getSubtract(Vector vector) {
		return ("{" + (this.x - vector.getX()) + ";" + (this.y - vector.getY()) + ";" + (this.z - vector.getZ()) + "}");
	}

	public double getScalarMultiply(Vector vector) {
		return (this.x * vector.getX() + this.y * vector.getY() + this.z * vector.getZ());
	}
	public String getVectorMultiply(Vector vector) {
		return ("{" + (this.y * vector.getZ() - this.z * vector.getY()) + ";" + 
                (this.z * vector.getX() - this.x * vector.getZ()) + ";" + 
                (this.x * vector.getY() - this.y * vector.getX()) + "}");
	}
	public String getAbsoluteValue() {
			return ("{" + this.x + ";" + this.y + ";" + this.z + "}");
		}
	public double getModule(){
        	return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type vector1's coordinates by a space, please!");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double z1 = sc.nextDouble();
		System.out.println("Type vector2's coordinates by a space, please!");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double z2 = sc.nextDouble(); 
		Vector vector1 = new Vector(x1, y1, z1);
		Vector vector2 = new Vector(x2, y2, z2);
		//AbsoluteValue
		System.out.println("Vectors:");
		System.out.println(vector1.getAbsoluteValue());
		System.out.println(vector2.getAbsoluteValue());
		//Addition
		System.out.println("Addition = " + vector1.getAddition(vector2));
		//Subtract
		System.out.println("Subtract = " + vector1.getSubtract(vector2) + " or " + vector2.getSubtract(vector1));
		//ScalarMultiply
		System.out.println("ScalarMultiply = " + vector1.getScalarMultiply(vector2));
		//VectorMultiply
		System.out.println("VectroMultiply = " + vector1.getVectorMultiply(vector2));
		System.out.println("VectorModule = " + vector1.getModule());
	}

}
