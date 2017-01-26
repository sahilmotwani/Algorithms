package code;

public class WordBreak {

	public static void main(String[] args) {

		 System.out.println(wordBreak("samsung")?"Yes":"No");
	}

	public static boolean dictionaryContains(String word){
		String dictionary[] = {"mobile","samsung","sam","sung","man","mango",
                "icecream","and","go","i","like","ice","cream"};
		
		for(int i=0; i<dictionary.length;i++){
			if(dictionary[i].equalsIgnoreCase(word))
			return true;
		}
		return false;
	}

	
	public static boolean wordBreak(String word){
		int size = word.length();
		if(size==0)
			return false;
		for(int i=0;i<size;i++){
			if(dictionaryContains(word.substring(0, i)) && wordBreak(word.substring(i, size-i))){
				return true;
			}
		}
		return false;
	}
	
}
