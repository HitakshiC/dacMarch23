class pypattern5{
	public static void main(String args[]){
		 int n=9;
		 for(int i=1;i<=n;i++){
			 for(int j=n-i;j>0;j--){
				 System.out.print("  ");
			 }
			 for(int j=n-i+1;j<=n;j++){
				 System.out.print(j+" "); 
			 }
			 for(int j=n-1;j>n-i;j--){
				  System.out.print(j+" "); 
			 }
			 System.out.println();
		 }
		 
	
	}
}