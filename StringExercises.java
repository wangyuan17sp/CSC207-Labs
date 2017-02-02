import java.util.Scanner;
/**
 * 
 */

/**
 * @author Yuan
 *
 */
public class StringExercises {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String[] arr = {"ab", "cd", "ef"};
		//System.out.println(intersperse(arr));
		//String question = "Are you a student?";
		//System.out.println(forgivingPrompt(question));
		System.out.println(parseName("Anna,Johny,Baker"));

	}
	
	public static String intersperse(String[] arr) {
		int length = arr.length;
		String result = arr[0];
		for (int i = 1; i < length; i++) {
			result = result + "," + arr[i];
		}
		
		return result;
		
	}
	
	public static boolean forgivingPrompt(String question) {
		System.out.println("Type your answer to the question here:");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		char first = (response.toLowerCase()).charAt(0);
		while ((first != 'y') && (first != 'n')) {
			System.out.println("Type your answer to the question here:");
			response = in.nextLine();
			first = (response.toLowerCase()).charAt(0);
		}
			
		if (first == 'y'){
			return true;
		} else {
			return false;
		}
	}
	
	public static String parseName(String s) {
	    String name = s;
	    char[] nameArr = name.toCharArray();
	    char[] full = new char[name.length()];
	    
	    for (int i = 0; i < name.length(); i++) {
	        if (nameArr[i] == ',') {
	            full[i] = ' '; 
	        } else {
	            full[i] = nameArr[i];
	        }
	    }
	    
	    String fullName = new String(full);
	    
	    return fullName;
	}

}
