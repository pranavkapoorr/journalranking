package test;
//used to access in the main class to compare

import java.util.Comparator;

public class journalComparator implements Comparator{

        @Override
	public int compare(Object o1,Object o2){  
		journal j1=(journal)o1;  
		journal j2=(journal)o2;  
		  
		
		if(j1.score==j2.score){
			return j1.name.compareTo(j2.name);
		}
		else if(j1.score>j2.score){
		return -1;	
		}
		else
		{
			return 1;
		}
		
	}
	
}
