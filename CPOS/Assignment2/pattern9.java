class pattern9{
	public static void main(String args[]){
	int n=5;
	char ch='A';
	for(int i=0;i<=n-1;i++){
		for(int j=n-i-1;j>=0;j--){
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++){
			System.out.print((char)(ch+j)+" ");
		}
		System.out.println();
	}
	}
}	