

public class palindrome {

        private static boolean isPalindrome(String string){
            int len = string.length();
            for(int i=0, j=len-1; i<j; i++, j--) {
                //if (string.charAt(i) != string.charAt(j)) return false;
                if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(string.charAt(j))) 
                    return false;
            }
            return true;
        }
    
        public static void main(String[] args) {
            String string1 = "Арозаупаланалапуазора";
            if (isPalindrome(string1)) {
                System.out.println("Yes");
            } else { 
                System.out.println("No");
            }
        }
    }
    
