/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
       int len= s.length();
       String unique= "" + s.charAt(0);
       int uniLen= unique.length();
       for (int i= 0; i < len; i++) {
           if (uniqueChars(s.charAt(i), unique)) {
              unique += s.charAt(i);
           }
        
       }
       return unique; 
    }

    public static boolean uniqueChars(char a, String s) {
       for (int i= 0; i < s.length(); i++)
       {
           if ((s.charAt(i) == a) && s.charAt(i) != ' ') {
               return false;
           }
       }
       return true;
    }
}
