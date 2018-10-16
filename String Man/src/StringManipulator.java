
public class StringManipulator {

	
	public String  noVowels(String base) {
		
		String voweless = "";
		
		//vowels
		String vowels = "AaEeIiOoUu";
		
		for (int i = 0;i < (base.length()); i++) {
			//checking all the vowels in character form
					if (base.charAt(i)== vowels.charAt(0) || base.charAt(i)== vowels.charAt(1)||
							base.charAt(i)== vowels.charAt(2)||base.charAt(i)== vowels.charAt(3)||base.charAt(i)== vowels.charAt(4)||base.charAt(i)== vowels.charAt(5)||base.charAt(i)== vowels.charAt(6)||
							base.charAt(i)== vowels.charAt(7)||base.charAt(i)== vowels.charAt(8)||base.charAt(i)== vowels.charAt(9)) {
					voweless+= "*";
				}
					//if it's not a vowel
					else {
					voweless += base.charAt(i);		
			    }	
			}
		return voweless;	
	}
}
