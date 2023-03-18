class pattern18{
	public static void main(String args[]){
	int n=5;
	char ch='A';
	for(int i=n;i>0;i--){
		for(int j=0;j<i;j++){
			System.out.print((char)(ch+j)+" ");
		}
		System.out.println();
	}
	}
}	