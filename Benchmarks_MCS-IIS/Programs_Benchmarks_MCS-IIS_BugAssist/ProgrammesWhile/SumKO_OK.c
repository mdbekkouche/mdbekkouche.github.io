/*
 * sum of the n first integers
 * there is an error when n is greater than 1000
 */


	
	 
	
	int SumKO_OK (int n) {__CPROVER_assume(n==20);
		int s = 0;int res;
		int i = 1;
		int errorRank = 12;
		while (i <= n) {
			s = s + i;
			i = i + 1;		
			if (i>=errorRank) {
				s=1;
			}
		}
		res=s;
                assert(res == 210);
	}
