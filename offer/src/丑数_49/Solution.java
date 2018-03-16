 package ����_49;

public class Solution {
	public int GetUglyNumber_Solution(int index) {
        if(index<=0)
        	return 0;
        int[] result=new int[index];//�½���СΪindex�������ų���
        int count=1;        //��¼���˼�������
        int i2=0;          //ȡ��2�������±�
        int i3=0;          //ȡ��3�������±�
        int i5=0;          //ȡ��5�������±�
        result[0]=1;       //1Ĭ��Ϊ��һ������
        
        while(count<index) {
        	int num2=result[i2]*2;
        	int num3=result[i3]*3;
        	int num5=result[i5]*5;
        	int min=min(num2, num3, num5);
        	if(min==num2)
        		i2++;
        	if(min==num3)
        		i3++;
        	if(min==num5)
        		i5++;
        	result[count]=min;
        	count++;
        }       
        return result[index-1];      
    }
	//������Сֵ
	private int min(int num2,int num3,int num5) {
		int temp=Math.min(num2, num3);
		return Math.min(temp, num5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution=new Solution();                               
		int number=solution.GetUglyNumber_Solution(7);
		System.out.println(number);

	}

}


/*
 **���Ӹ���
 

public int GetUglyNumber_Solution(int index) {
	if(index<=0)
		return 0;
	int foundUgly=0;
	int number=0;
	while(foundUgly<index) {
		number++;
		if(isUgly(number)) {
			foundUgly++;
		}
	}
	return number;
}

public boolean isUgly(int number) {
	while(number%2==0) {
		number=number/2;
	}
	while(number%3==0) {
		number=number/3;
	}
	while(number%5==0) {
		number=number/5;
	}
	if(number==1)
		return true;
	else
		return false;
}
*/




