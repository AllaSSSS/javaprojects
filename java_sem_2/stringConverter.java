package javaprojects.java_sem_2;

public class stringConverter {
    private static String convertString(String string){
        StringBuilder resultString = new StringBuilder();
        for(int i=0; i<string.length(); i++){
            int count = 1;
                while(i+1 < string.length() && string.charAt(i+1) == string.charAt(i)){
                    count += 1;
                    i += 1;
                }
                resultString.append(string.charAt(i));
                if(count > 1)
                    resultString.append(count);
            }
        return resultString.toString();
    }

    public static void main(String[] args) {
        String string1 = "aaabbbcdd";
        String string = convertString(string1);
        System.out.println(string);
        }
    
}
