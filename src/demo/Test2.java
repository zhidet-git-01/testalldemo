package demo;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String visitUrl = "http://www.twt.edu.cn/＃";
		int size = visitUrl.length();
		System.out.println(size);
		String endWord = visitUrl.substring(size-1);
		System.out.println(endWord);
		message(endWord);
		System.out.println(endWord);
		if(endWord.equals("＃")){
			System.out.println("ok");
		}
		
	}
	
	private static String ENCODE = "UTF-8";
	private static void message( String szMsg ) {
		System.out.println(System.getProperty("file.encoding"));
        try{System.out.println(new String(szMsg.getBytes(ENCODE), System.getProperty("file.encoding"))); } catch(Exception e ){}
    }
}
