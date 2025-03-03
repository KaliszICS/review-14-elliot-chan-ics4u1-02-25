public class PracticeProblem {
	public static final int MAXIMUM = 10;
	public static void main(String args[]) {
		System.out.println(totalWordsChecker("Hello'a b c d e f g h i j"));
	
	}
	public static int calculate(int num1, int num2, char operator) {
		switch(operator) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / num2;
			case '%':
				return num1 % num2;
			case '^':
				return (int) Math.pow(num1, num2);
			
		}
		return -1;
	}
	public static boolean totalWordsChecker(String st) {
		
		int wordCount = 0;
		char[] array = st.toUpperCase().toCharArray();
		//Look at letters one by one
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= 65 && array[i] <= 90) {
				//Check if within A to Z
				//Check if the next element exists in the first place
				if((i + 1) != array.length) {
					//Add one to word count if the next character is not A to Z, or a ', or a _.
					if(!( (array[i+1] >= 65 && array[i+1] <= 90) || array[i+1] == '\'' || array[i+1] == '_'))
					wordCount++;
				}else{
					wordCount++;
				}
			}
		}

		return wordCount <= MAXIMUM;
		
	}
	public static String minString(String s1, String s2, String s3) {
		if(s1.compareToIgnoreCase(s2) < 0 && s1.compareToIgnoreCase(s3) < 0)
			return s1;
		else if(s2.compareToIgnoreCase(s1) < 0 && s2.compareToIgnoreCase(s3) < 0)
			return s2;
		else
			return s3;
		
	}
}
