package JavaProgram;

public class Alphabetcheck {

	public static void main(String[] args) {
		char ch = '5';
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ){
			System.out.println(ch+ " It is Alphabet");
			
		}
		else {
			System.out.println(ch+ " It is not Alphabet");
		}

	}

}
