class starpattern7{
	public static void main(String args[]){
		int n=5;
		//upper pattern
		for(int i=0;i<n;i++){
			for(int j=n-i-1;j>0;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	//lower pattern
		for(int i=0;i<n-1;i++){
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++){
				System.out.print("*");
			}
			for(int j=0;j<n-i-2;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	
	
	
	}
}