
	
    /* returns |i-j|, the absolute value of i minus j */
	
    
      
      
      
      
	int AbsMinusKO3 (int i, int j) {__CPROVER_assume((i==0) && (j==1));
		int result;
		int k = 0;
		if (i <= j) {
			k = k+2; // error in the assignment : k = k+2 instead of k = k+1
		}
		if (k == 1 && i != j) {
			result = j-i; 		
		}
		else {
			result = i-j;
		}
		assert(result==1);
	}
