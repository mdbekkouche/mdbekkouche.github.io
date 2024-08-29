
	
    /* returns |i-j|, the absolute value of i minus j */
	
    
      
      
      

	int AbsMinusKO2 (int i, int j) {__CPROVER_assume((i==0) && (j==1));
		int result=i+1; // error in the assignment : result = i instead of result = i+1
		int k = 0;
		if (i <= j) {
			k = k+1;
		}
		if (k == 1 && i != j) {
			result = j-result; 		
		}
		else {
			result = result-j;
		}
		assert(result==1);
	}
