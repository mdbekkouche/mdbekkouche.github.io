
	
    /* returns |i-j|, the absolute value of i minus j */
	
    
      
      
      

	int AbsMinusKO (int i, int j) {__CPROVER_assume((i==0) && (j==1));
		int result;
		int k = 0;
		if (i <= j) {
			k = k+1;
		}
		if (k == 1 && i != j) {
			result = i-j; // error in the assignment : result = i-j instead of result = j-i		
		}
		else {
			result = i-j;
		}
		assert(result==1);
	}
