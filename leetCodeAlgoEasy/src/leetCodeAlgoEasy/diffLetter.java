package leetCodeAlgoEasy;

public class diffLetter {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "eabcd";
		char diffChar = findTheDifference(s, t);
		System.out.println("the dif" + diffChar);

	}
	
    public static char findTheDifference(String s, String t) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s.length();i++){
            sum1+=s.charAt(i);
            System.out.println("sum1 " + sum1);
        }
        for(int i=0;i<t.length();i++){
            sum2+=t.charAt(i);
            System.out.println("sum2 " + sum2);
        }
        int a=sum2-sum1;
        char c=(char)(a);
        return c;
               
    }

}
