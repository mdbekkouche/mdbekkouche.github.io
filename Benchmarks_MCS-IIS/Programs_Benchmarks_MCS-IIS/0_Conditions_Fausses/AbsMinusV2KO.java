class AbsMinus {
	
    /* returns |i-j|, the absolute value of i minus j */
	
    /*@ requires
      @	(i==0) && (j==1);
      @ ensures 
      @ (result==1); 
      @*/
	int AbsMinusV2KO (int i, int j) {
		int result;
		if (i < j) {
			result = i-j; // error in the assignment : result = i-j instead of result = j-i		
		}
		else {
			result = i-j;
		}
		return result;
	}
}
