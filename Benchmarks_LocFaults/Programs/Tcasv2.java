package benchmark;

public class Tcasv2 {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	int tcas(int Cur_Vertical_Sep,boolean High_Confidence,boolean Two_of_Three_Reports_Valid,int Own_Tracked_Alt,int Own_Tracked_Alt_Rate,int Other_Tracked_Alt,int Alt_Layer_Value,int Up_Separation,int Down_Separation,int Other_RAC,int Other_Capability,boolean Climb_Inhibit,int[] Positive_RA_Alt_Thresh)
    {
    int OLEV;
	int MAXALTDIFF;
	int MINSEP;
	int NOZCROSS;
	int NO_INTENT;
	int TCAS_TA;
	int UNRESOLVED;
	int UPWARD_RA;
	int DOWNWARD_RA; 
    boolean enabled;
	boolean tcas_equipped;
	boolean intent_not_known;
	boolean need_upward_RA;
	boolean need_downward_RA;
	int alt_sep;
	boolean upward_preferred;
	int upward_crossing_situation;
	boolean resultat;                 
    int Inhibit_Biased_Climb;
    OLEV = 600;
	MAXALTDIFF = 600;
	MINSEP = 300;
	NOZCROSS = 100;
	NO_INTENT = 0;
	TCAS_TA = 1;
	UNRESOLVED = 0;
	UPWARD_RA = 1;
	DOWNWARD_RA = 2;
    Positive_RA_Alt_Thresh[0] = 400;
    Positive_RA_Alt_Thresh[1] = 500;
    Positive_RA_Alt_Thresh[2] = 640;
    Positive_RA_Alt_Thresh[3] = 740;
    enabled = (High_Confidence) && (Own_Tracked_Alt_Rate <= OLEV) && (Cur_Vertical_Sep > MAXALTDIFF);
	tcas_equipped = (Other_Capability == TCAS_TA);
	intent_not_known = ((Two_of_Three_Reports_Valid) && (Other_RAC == NO_INTENT));
	alt_sep = UNRESOLVED;
        if ((enabled) && (((tcas_equipped) && (intent_not_known)) || !(tcas_equipped)))
	    { 
		if (Climb_Inhibit){
		    Inhibit_Biased_Climb=Up_Separation + MINSEP; /* operand mutation NOZCROSS, the instruction should be : Inhibit_Biased_Climb=Up_Separation + NOZCROSS; */
		}
		else{
		    Inhibit_Biased_Climb=Up_Separation;
		}		
		if (Inhibit_Biased_Climb > Down_Separation)
		    {  
			resultat = (!(Own_Tracked_Alt < Other_Tracked_Alt) || ((Own_Tracked_Alt < Other_Tracked_Alt) && !(Down_Separation >= Positive_RA_Alt_Thresh[Alt_Layer_Value])));
		    }
		else
		    {  
			resultat = (Other_Tracked_Alt < Own_Tracked_Alt) && (Cur_Vertical_Sep >= MINSEP) && (Up_Separation >= Positive_RA_Alt_Thresh[Alt_Layer_Value]);
		    }  
		
		need_upward_RA= (resultat) && (Own_Tracked_Alt < Other_Tracked_Alt);
		if (Climb_Inhibit){
		    Inhibit_Biased_Climb=Up_Separation + MINSEP; /* operand mutation NOZCROSS, the instruction should be : Inhibit_Biased_Climb=Up_Separation + NOZCROSS; */
		}
		else{
		    Inhibit_Biased_Climb=Up_Separation;
		} 
		
		if (Inhibit_Biased_Climb > Down_Separation)
		    {
			resultat = (Own_Tracked_Alt < Other_Tracked_Alt) && (Cur_Vertical_Sep >= MINSEP) && (Down_Separation >= Positive_RA_Alt_Thresh[Alt_Layer_Value]);
		    }
		else
		    {
			resultat = !(Other_Tracked_Alt < Own_Tracked_Alt) || (((Other_Tracked_Alt < Own_Tracked_Alt)) && (Up_Separation >= Positive_RA_Alt_Thresh[Alt_Layer_Value]));
		    } 
		
		need_downward_RA=(resultat) && (Other_Tracked_Alt < Own_Tracked_Alt);
		if ((need_upward_RA)  && (need_downward_RA)){
		    //         unreachable: requires Own_Below_Threat and Own_Above_Threat
		    //           to both be true - that requires Own_Tracked_Alt < Other_Tracked_Alt
		    //           and Other_Tracked_Alt < Own_Tracked_Alt, which isn't possible 
		    alt_sep = UNRESOLVED; 
                }
		else if (need_upward_RA){
		    alt_sep = UPWARD_RA; 
		}
		else if (need_downward_RA)
		    {alt_sep = DOWNWARD_RA;}
		else 
		    {alt_sep = UNRESOLVED;}
	    }
	
	return alt_sep;
    }
}
