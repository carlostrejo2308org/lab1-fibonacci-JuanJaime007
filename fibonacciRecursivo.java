
public class fibonacciRecursivo {

	public static void main(String[]args) {
		
		fibonacciRecursivo op = new fibonacciRecursivo();
		System.out.println("la sucesión fibonacci recusrivo de 12 es "+ op.fibRec(12));

		System.out.print("la sucesión fibonacci iterativo  de 12 es "+ op.fibRec(12));
		
	}
	
		public int fibRec(int n) {
	if(n==1 || n==2) {
		
		return 1;
	}else {
		return fibRec(n-1) + fibRec(n-2); 
	}					
	}
	
		public int fibit(int n) {
			int fibo=0,prim=1,seg=0;
			while(n>0) {
				fibo=prim+seg;
				prim=seg;
				seg=fibo;
				n--;
			}
			return fibo;
		}
}