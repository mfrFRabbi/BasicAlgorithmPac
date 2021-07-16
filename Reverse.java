public class Reverse{
	static void revStr(String str){
		if(str.length() == 1){
			System.out.println(str);
		}else{
			System.out.print(str.charAt(str.length() - 1));
			revStr(str.substring(0,str.length() -1));
		}
	}
	public static void main(String[] args){
		String str = "Hello";
		revStr(str);
	}
}