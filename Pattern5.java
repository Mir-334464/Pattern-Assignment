class Pattern5
{
	 public static void main(String[] args)
	 {
		int i,j;

		for(i=5; i>=1; i--)
		{
			for(j=i; j>=1; j--)
				System.out.print(j+" ");

			System.out.println();
		}
		
		for(i=1; i<=5; i++)
		{
			for(j=i; j>=1; j--)
				System.out.print(j+" ");

			System.out.println();
		}

	 }
}