public class CompareString{
	private String a;
	private String b;

	CompareString(){
		this.a = "";
		this.b = ""; 
	}

	CompareString(String a, String b){
		this.a = a;
		this.b = b;
	}

	public boolean checkEquals(String a, String b){
		boolean result = false;
		return result = a.equals(b);
	}
	public static void main(String[] args){
		CompareString compStr = new CompareString("IT95E0310401625000000121067","IT95E0310401625000000121067");
		boolean res = compStr.checkEquals(compStr.a, compStr.b);

		if(res){
			System.out.println("\nStrings are the same");
			System.out.println("String1: " +compStr.a +"\nString2: "+ compStr.b + "\n");
		}
		else{
			System.out.println("\nStrings are not equals");
			System.out.println("String1: " +compStr.a +"\nString2: "+ compStr.b +"\n");
		}

	}
}