package middleCos.lang;

/**
 * 
 * @author bgkim
 *
 *	StringBuffer append() 메소드 : 메소드 체인패턴 ==> 자신을 리턴함
 *
 */

public class StringBufferExam {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello").append(" ").append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("Hello");  
		
		if(sb2 == sb3) {
			System.out.println("sb2 == sb3");
		}
		
		
		String str2 = new StringBuffer().append("Hello").append(" ").append("World").toString();
		System.out.println(str2);
	}
}
