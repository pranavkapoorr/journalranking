/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Pranav
 */public class journal implements Serializable{
        String name;
        boolean review;
            int score;
            int rank;
              
     public journal(String name, boolean review, int score , int rank) {
                this.name = name;
                this.review = review;
                this.score = score;
                this.rank = rank;
            }
          
 
  
     
    public static void main(String[] args) {
        ArrayList<journal> myArrayList=new ArrayList<>();
        journal A=new journal("Journal A",false,4,0);
         journal B=new journal("Journal B",false,2,0);
          journal C=new journal("Journal C",false,3,0);
       myArrayList.add(A);
       myArrayList.add(B);
       myArrayList.add(C);

   
    Collections.sort(myArrayList,new journalComparator());  
		
		System.out.println("Rank \t Name\t \t Score");
		Iterator itr=myArrayList.iterator();  
		double prevScore=0;
		int rank=0;
		while(itr.hasNext()){  
			journal jItem=(journal)itr.next();
			if(prevScore!=jItem.score){
				rank++;
				prevScore=jItem.score;
			}
			jItem.rank=rank;
			if(!jItem.review)
			System.out.println(jItem.rank+" \t "+jItem.name+" \t "+jItem.score);  
		}  
       
    }

 }


   
