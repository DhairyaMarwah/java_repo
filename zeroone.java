import java.io.*;
 
class GFG
{
    // Function to count patterns
    static int patternCount(String str)
    {
        /* Variable to store the last character*/
        char last = str.charAt(0);
     
        int i = 1, counter = 0;
        while (i < str.length())
        {
            /* We found 0 and last character was '1',
            state change*/
            if (str.charAt(i) == '0' && last == '1')
            {
                while (str.charAt(i) == '0')
                    i++;
     
                // After the stream of 0's, we
                // got a '1',counter incremented
                if (str.charAt(i) == '1')
                    counter++;
            }
     
            /* Last character stored */
            last = str.charAt(i);
            i++;
        }
     
        return counter;
    }
     
    // Driver Code
    public static void main (String[] args)
    {
        String str = "1001ab010abc01001";
        System.out.println(patternCount(str));
         
    }
}