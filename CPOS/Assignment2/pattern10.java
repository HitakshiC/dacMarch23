class pattern10{
	public static void main(String args[]){
	int n=5;
	char ch='A';
	for(int i=0;i<n;i++){
		for(int j=n-i-1;j>=0;j--){
			System.out.print(" ");
		}
		for(int j=n-i;j<=n;j++){
			System.out.print((char)(ch+j-1)+" ");
		}
		System.out.println();
	}	
 }
} 