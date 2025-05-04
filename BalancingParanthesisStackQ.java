package datastructure;

import java.util.Scanner;

public class BalancingParanthesisStackQ {

    // Function to match { and } or [ and ] or ( and )
    public static boolean match(char c1, char c2) {
        return ((c1 == '[') && (c2 == ']')) ||
               ((c1 == '{') && (c2 == '}')) ||
               ((c1 == '(') && (c2 == ')'));
    }

    public static boolean checkExpression(String str) {
        int i;
        char temp = '#';
        characterStack st = new characterStack(1);  // Initialize the stack with size 10
        
        for (i = 0; i < str.length(); i++) {
            
            /* Step 1: Processing character at index i: str.charAt(i)
             * If str.charAt(i) is an opening parenthesis, push it onto the stack
             */
            System.out.println("Step " + (i + 1) + ": Processing '" + str.charAt(i) + "'");
            
            /* Example of processing an opening parenthesis
             * Input: '('
             * Push '(' into stack
             * Stack after push: [ ( ]
             */
            if((str.charAt(i) == '[') || (str.charAt(i) == '{') || (str.charAt(i) == '(')) {
                st.pushchar(str.charAt(i));  // Push opening parenthesis onto stack
                
                /* Example of stack state after pushing an opening parenthesis
                 * Stack state: [ ( ]
                 */
                System.out.println("Push '" + str.charAt(i) + "' into stack");
                st.displayCharStack();
            }
            
            /* Step 2: If the character is a closing parenthesis, pop the corresponding opening parenthesis
             * Process when encountering a closing parenthesis like ']', '}', or ')'
             * Pop from stack if matching opening parenthesis is found
             */
            if(str.charAt(i) == ']' || str.charAt(i) == '}' || str.charAt(i) == ')') {
                temp = st.popchar();  // Pop from stack
                System.out.println("Pop from stack: '" + temp + "'");
                st.displayCharStack();
            }
            
            /* Step 3: Check if the popped character matches the closing parenthesis
             * Example of matching opening and closing parenthesis
             * If no match, return false.
             */
            if(!match(temp, str.charAt(i))) {
                System.out.println("Mismatch found, returning false...");
                return false;  // If no match, the expression is invalid
            }
        }
        
        /* Step 4: After processing all characters, check if the stack is empty
         * If the stack is empty, then all parentheses have been matched
         */
        if(st.ischarstackEmpty()) {
            System.out.println("All parentheses matched, stack is empty, returning true...");
            return true;  // Valid expression
        } else {
            System.out.println("Stack is not empty, returning false...");
            return false;  // Invalid expression
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter string to check if valid or not:");
        str = sc.next();
        
        if(checkExpression(str)) {
            System.out.println("The string is valid...");
        } else {
            System.out.println("The string is invalid...");
        }
    }
}
