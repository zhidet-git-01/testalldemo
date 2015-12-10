package demo;

public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "dkjfiejre|kdfjdi|dofjdo|r3jro|jfodf";
		  String[] strch = str.split("[|]");
		  System.out.println(strch.length);
		  for (String string : strch) {
		   System.out.println(string);
		  }
	}

}
