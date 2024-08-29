

       int Sum () {
                int n;__CPROVER_assume(n == 55);
		int s = 0;
		int i = 0;
		while (i < n) {
			s = s + i;
			i = i + 1;			
		}
                assert(s == (n*(n+1))/2);
	}
