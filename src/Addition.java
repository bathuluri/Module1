
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumAll(1,2,4);

		//System.out.println("total is, " + sumAll2(5,5,5));
		int a = sumAll_ReturnsValue(5,2,1);

		if (a>10)
			System.out.println("a IS greater than 10");
		else 
			System.out.println("a is NOT greater than 10");
		
		
		int random = generateRandom(1);
		System.out.println("random number returned is " +random);
	
	}
	
	
	public static void sumAll(int a, int b, int c) {
		
		int sum = a+b+c;
		System.out.println("total a+b+c is " +sum);
	
	}
	
	public static int sumAll_ReturnsValue(int a, int b, int c) {
	
		int sum = a+b+c;
		//System.out.println("total a+b+c is " +sum);
		return sum;
	}
	
	public static int generateRandom(int a){
		
		
		
		int y = 0;
		while (y>a || y==0){
			double x = 10000* Math.random();
			y = (int)x;
			System.out.println("y value now is " +y);
			
		}

		return(y);
		
	

		

		
	}
	
	
	
	}
	
	

