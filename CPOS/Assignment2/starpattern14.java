class starpattern14{
	public static void main(String args[]){
		int n=5;
		//upper pattern
		for(int i=n;i>0;i--){
		for(int j=1;j<=n-i;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
			System.out.print("* ");
		}
		System.out.println();
		}
		//lower pattern
		for(int i=1;i<=n-1;i++){
		for(int j=1;j<=n-i-1;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=i+1;j++){
			System.out.print("* ");
		}
		System.out.println();
		}
	
	
	
	
	
	}


}