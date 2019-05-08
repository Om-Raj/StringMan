package str;

public class StringMan
{
    /*
     * Author  : Om Raj
     * Purpose : Custom String manipulation methods for Java
     */
    String string;
    int length;
    public StringMan(String str)
    {
        string = new String(str);
        length = string.length();
    }
    
    public char[] charArray()
    {
        /*
         * Parameter : ()
         * Returns   : char[]
         * Purpose   : Returns the char array form of the String.
         */
        char arr[] = new char[length];
        for(int i=0; i<length; i++)
            arr[i] = string.charAt(i);
        return arr;
    }

    public int count(char ch)
    {
        /*
         * Parameter : (char)
         * Returns   : int
         * Purpose   : Returns the number of occurence of any character in the String.
         */
        int c = 0;
        for(int i=0; i<length; i++)
            if(string.charAt(i)==ch)
                c++;
        return c;
    }
    
    public int countDigit()
    {
        /*
         * Parameter : ()
         * Returns   : int
         * Purpose   : Returns the number of digits (0-9) present in the String.
         */
        int c = 0;
        char ch;
        for(int i=0; i<length; i++)
        {
            ch = string.charAt(i);
            if(ch>47 && ch<58)
                c++;
        }
        return c;
    }
    
    public int[] extractDigit()
    {
        /*
         * Parameter : ()
         * Returns   : int[]
         * Purpose   : Returns the int array containing the digits present in the String. Each index of the array has a single digit only.
         */
        int arr[] = new int[countDigit()];
        int c = 0;
        char ch;
        for(int i=0; i<length; i++)
        {
            ch = string.charAt(i);
            if(ch>47 && ch<58)
                arr[c++] = Integer.parseInt(ch+"");
        }
        return arr;
    }
    
    public int[] extractNumber()
    {
        /*
         * Parameter : ()
         * Returns   : int[]
         * Purpose   : Returns the int array containing the numbers present in the String. Each index of the array may contain non-single digit number.
         */
        String arr[] = new String[countDigit()];
        int c = 0;
        String wd = "";
        String str = string + " ";
        char ch;
        for(int i=0; i<=length; i++)
        {
            ch = str.charAt(i);
            if(ch>47 && ch<58)
                wd += ch;
            else if(!wd.equals(""))
            {
                arr[c++] = wd;
                wd = "";
            }
        }
        int array[] = new int[c]; //Array to remove null
        for(int i=0;i<c;i++)
            array[i] = Integer.parseInt(arr[i]);
        return array;
    }
    
    public String reverse()
    {
        /*
         * Parameter : ()
         * Returns   : String
         * Purpose   : Returns the reverse of the String.
         */
        String str = "";
        for(int i=0; i<length; i++)
            str = string.charAt(i)+str;
        return str;
    }
    
    public String[] split(char ch)
    {
        /*
         * Parameter : ()
         * Returns   : String[]
         * Purpose   : Returns the String array containing the parts of the original String split at every occurence of the character argument.
         */
        String arr[] = new String[count(ch)+1];
        String str = string + ch;
        for(int i=str.indexOf(ch), m=0, k=0; i>=0 && i<=length; m=i+1, i=str.indexOf(ch,i+1))
        {
            arr[k++] = str.substring(m,i);
        }
        return arr;
    }
}
