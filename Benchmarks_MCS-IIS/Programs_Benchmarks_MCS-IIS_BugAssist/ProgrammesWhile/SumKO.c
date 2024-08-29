/*
 * sum of the n first integers
 */


	
	 
	  
	void SumKO (int n) {__CPROVER_assume(n == 5);
		int s = 1;
		int i = 0;
		while (i < n) {
			s = s + i;
			i = i + 1;			
		}
		assert(s==10);
	}
