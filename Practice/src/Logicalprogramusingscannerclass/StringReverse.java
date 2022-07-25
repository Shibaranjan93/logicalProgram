package Logicalprogramusingscannerclass;

public class StringReverse {

	public static void main(String[] args) {
		String str="Shibaranja Mohakud";
		
//		StringBuffer st=new StringBuffer(str);
//		st.reverse();
//		String sr=st.toString();
//		System.out.println(sr);
		
//		char[] ch=str.toCharArray();
//		for(int i=ch.length-1;i>=0;i--)
//		{
//			System.out.print(ch[i]);
//		}
		
		String[]s1=str.split("");
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]);
		}
	}

}
