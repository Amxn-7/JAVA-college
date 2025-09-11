package Class4;
public class Main {
    String s = new String("abc");
    // String length is s.length() - 3
    // String size is basically 6 bytes but it purely depends on the implementation in 32/64 bit architecture cecause it includes object headers, padding and refrences

    // Java character encoding sys follows unicode charset UTF-16 which can store more than a million characters

    // To overcome the immutability issue in string class java introduced StringBuilder 


}

//Strng class methods 
// 1. Length and character acces
// int length() = Returns the length of the string 
// char charAt(int index) = Returns the character at a given index 

// 2. Comparison:
// boolean equals(Object obj) = Compares content
// boolean equalsIgnoreCase(String another) = Compares ignoring case 
// int compareTo(string another) = Lexicographicallly compare two string;
// ex: String s1 = new String("abc");
//     String s2 = new String("ABC");
//     sout(s.compareTo(s2));// Diffrence between a and A(a - A)

//     Rule:
//     if string1 > string2  +value
//     if string1 < string2  -value
//     if string1 == string2  0


// 3. Searching
// boolean contains(CharSequence s) = checks if substring exists;
// boolean startWith(string prefix) = checks prefix;
// boolean endsWith(string suffix) = checks suffix;
// int indexOf(string str) = first index of substring
// int lastIndexOf(string str) = Last index of substring

// 5. Substring and Concatenation:
// // string substring(int beginIndex) = substring from index 
// string substring(int beginIndex, int endInndex) = between indices
// string concat(string str) = concatenates 2 strings
// string join(CharSequence delimiter, Charsequence... elements) = join

// 6. Trimming and replacing
// String trim() = removes leading and trailing spaces
// String replace(char oldChar, char newChar) = replaces all occurrences of oldChar with newChar
// string replace(CharSequence target, CharSequence replacement) = replaces all occurrences of target with replacement
// string replaceAll(String regqx, String replacement) = replaces all substrings matching regex with replacement


// 7. Splitting
// string[] split(String regex) = splits string based on regex and returns array of substrings
// string[] split(String regex, int limit) = splits string based on regex with limit on


// 8. Conversion 
// char[] toCharArray() = converts string to char array
// byte[] getBytes() = converts string to byte array using platform's default charset
// static String ValueOf(int i) = converts primitive to string
// string intern() = retruns canonical representation from string pool

