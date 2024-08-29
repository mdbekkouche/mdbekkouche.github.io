
	
    /* returns |i-j|, the absolute value of i minus j */
	
    
      
      
      

	int AbsMinusV2KO2 (int i, int j) {__CPROVER_assume((i==0) && (j==1));
		int result=i+1; // error in the assignment : result = i instead of result = i+1
		if (i < j) {
			result = j-result; 		
		}
		else {
			result = result-j;
		}
		assert(result==1);
	}
