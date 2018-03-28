package test1;

public class test3_12 {
	public static int getGroupid(String str) {
		String strNew[]=str.split("-");
		int num = Integer.parseInt(strNew[1]);
		return num;
	}
	public static String getBelongGroup(String str) {
		String strNew[]=str.split("-");
		return strNew[2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "共享风险业务组-16-B";  
		String strNew[] = str.split("-"); 
		System.out.println(getGroupid(str));
		System.out.println(getBelongGroup(str));

	}

}
