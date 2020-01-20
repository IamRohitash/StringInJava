

public class String1 {

    public static void main(String[] args)
    {
        String str="GeeksforGeeks";
        //or String str1=new String("GeeksforGeeks");
        //return the length of string or number of character of string
        System.out.println("String lenght:"+ str.length());

        //return the character at ith index in the array
        System.out.println("character at the ith index in the array:"+ str.charAt(3));

        //return the substring from the ith index character to end of the string
        System.out.println("Substring:"+str.substring(3));

        //return the substring from the ith index to j-1th index
        System.out.println("Substring:"+str.substring(2,6));

        //concatenate the string1 to the end of the string1
        String str1="Rohitash";
        String str2=" Yadav";
        System.out.println("Concatenation of two string:"+str1.concat(str2));

        //return the index within the string of the first occurrence of the
        // specified string
        String str3="Rohitash Yadav and Mohit yadav";
        System.out.println("Index:"+str3.indexOf("and"));

        //Return the index within the string of the first occurrence
        // of the specified string,starting at the specified index
        System.out.println("index of a:"+str3.indexOf("a",3));

        //checking the quality of string
        Boolean out="Geeks".equals("geeks");
        System.out.println("Chacking equality:"+out);
        out="Geeks".equals("Geeks");
        System.out.println("Checking Equality:"+out);

        out="Geeks".equalsIgnoreCase("geEkS");
        System.out.println("Checking Equality:"+out);

        //compare two string
        int out1=str1.compareTo(str2);
        System.out.println(out1);

        //converting cases
        String str4="GeekMy";
        System.out.println("changing to lower case:"+str4.toLowerCase());

        //converting cases
        String str5="GeekMy";
        System.out.println("changing to upper case:"+str5.toUpperCase());

        //Trimming the word
        String str6="Learn share learn";
        System.out.println("Trim the world:"+str6.trim());

        //replacing characters
        String str7="FeeksforFeeks";
        System.out.println("original String:"+str7);
        String str8="FeeksforFeeks".replace('F','G');
        System.out.println("replaced F with G:"+str8);




    }
}
