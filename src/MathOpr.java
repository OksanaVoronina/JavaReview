
public class MathOpr {

	public int add(int num1,int num2) {
		int addition=num1+num2;
		return addition;
	}
	int multiply(int a,int b) {
		return a*b;
	}
	public static void main(String args[]) {
		MathOpr math=new MathOpr();
		int result=math.add(4, 5);
		System.out.println(result);
		System.out.println(math.multiply(3,8));
	}
}
