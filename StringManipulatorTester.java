class StringManipulatorTester
{    
    public static void main()
    {
        /* Create an object of the StringMan class and pass the string to be manipulated as an argument */
        String testString = "The qu1ck b456r0wn f0x jumped987 0ver the fe123nce. He110 W0r1d!";
        StringMan sa = new StringMan(testString);
        System.out.println("Original String : "+testString);
        System.out.println("Reversed String : "+sa.reverse());
        System.out.println("Character Array : ");// The char array look similar to the original String
        char charArr[] = sa.charArray();
        for(char i : charArr)
            System.out.println(i);
        System.out.println("String after spliting at every \'e\' : ");
        String stringArr[] = sa.split('e');
        for(String i : stringArr)
            System.out.println(i);
        System.out.println("Occurence of \'0\' : "+sa.count('0'));
        System.out.println("Number of digits present : "+sa.countDigit());
        System.out.println("Numbers present in the String : ");
        int numberArr[] = sa.extractNumber();
        for(int i : numberArr)
            System.out.println(i);
        System.out.println("Digits present in the String : ");
        int digitArr[] = sa.extractDigit();
        for(int i : digitArr)
            System.out.println(i);
        System.out.println(sa.toUpper());
    }
}
