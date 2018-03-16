package 和为s的数字_57;

import java.util.ArrayList;

public class Solution1 {
	 public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum){
		 ArrayList<ArrayList<Integer> > result=new ArrayList<>();
		 int small=1;
		 int big=2;
		 while(small<=(sum/2)) {
			 int cursum=((small+big)*(big-small+1))/2;
			 if(cursum==sum) {
				 ArrayList<Integer> sequence=creatSequence(small,big);
				 result.add(sequence);
				 big++;
			 }
			 else if(cursum<sum) {
				 big++;
			 }
			 else if(cursum>sum) {
				 small++;
			 }
		 }
		 return result;
	 }
	 
	 public ArrayList<Integer> creatSequence(int small,int big){
		 ArrayList<Integer> sequence=new ArrayList<>();
		 for(int i=small;i<=big;i++) {
			 sequence.add(i);
		 }
		 return sequence;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Solution1 s1=new Solution1();
          ArrayList<ArrayList<Integer> > result=s1.FindContinuousSequence(9);
          for(int i=0;i<result.size();i++) {
        	  for(int j=0;j<result.get(i).size();j++) {
        		  System.out.print(result.get(i).get(j));
        	  }
        	  System.out.println();
          }
	}

}
