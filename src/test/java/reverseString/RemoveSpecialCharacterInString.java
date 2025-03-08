package reverseString;

public class RemoveSpecialCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abg#5ug%43&*  @lo   uf";
		String new_s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		System.out.println(new_s);

	}

}
