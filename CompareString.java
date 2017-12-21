public class TwoString{
	private String a;
	private String b;

	TwoString(){
		this.a = "";
		this.b = ""; 
	}

	TwoString(String a, String b){
		this.a = a;
		this.b = b;
	}

	public boolean checkEquals(String a, String b){
		boolean result = false;
		return result = a.equals(b);
	}
	public static void main(String[] args){
		TwoString Str = new TwoString("0401625000000921067","0401625000000921067");
		boolean res = Str.checkEquals(Str.a, Str.b);

		if(res){
			System.out.println("\nStrings are the same");
			System.out.println("String1: " +Str.a +"\nString2: "+ Str.b + "\n");
		}
		else{
			System.out.println("\nStrings are not equals");
			System.out.println("String1: " +Str.a +"\nString2: "+ Str.b +"\n");
		}

	}
}
