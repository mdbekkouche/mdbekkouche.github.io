
	
    /* returns |i-j|, the absolute value of i minus j */
	
    
      
      
      

	int AbsMinusV2KO (int i, int j) {__CPROVER_assume((i==0) && (j==1));
		int result;
		if (i < j) {
			result = i-j; // error in the assignment : result = i-j instead of result = j-i		
		}
		else {
			result = i-j;
		}
		assert(result==1);
	}
