
package share_cakes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	        int cakes=sc.nextInt();
	       int weight=sc.nextInt();
	       int []cakeweight=new int[cakes];
	       for (int i = 0; i < cakeweight.length; i++) {
			cakeweight[i]=sc.nextInt();
	       }
	       
	       int num=0;
	       int i=0;
	       int curnum=0;
	       while(i<cakeweight.length){
	    	  if(isWeight(curnum, weight)){
	    		  num++;
	    		  curnum=0;
	    	  }else{
	    		  curnum+=cakeweight[i];
	    		  i++;
	    		  if(i==cakeweight.length){
	    			  num++;
	    		  }
	    	  }  
	       } 
	       System.out.println(num);
	}

	public static boolean isWeight(int a,int weight){
		if(a>=weight){
			return true;
		}else{
			return false;
		}
	}
}
