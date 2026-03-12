public class ReverseWords {

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            result += rev + " ";
        }
        return result.trim();
    }
    
   public static String removeduplicates(String str) {
    String removed = "";

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (!removed.contains(ch + "")) {
            removed += ch;
        }
    }
    return removed;
}


    public static void main(String[] args) {
        String str = "java is good";
        System.out.println(reverseWords(str));
        

        System.out.println(removeduplicates("programing"));
    }
}
