package BasicJava.Chapter_09;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "abc"; // 문자열 리터럴 생성
        String str2 = new String("abc"); // String 인스턴스 생성

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2); // false

        String s = null; // == String s = "";
        char c = '\u0000'; // == char c = '';

        char[] cArr = new char[0];
        String sArr = new String(cArr);

        System.out.println("cArr.length="+cArr.length);
        System.out.println("@@@"+sArr+"@@@");

        //////////////////////////////
        // 정의된 생성자 와 메서드 의 목록
        //////////////////////////////

        String strIns = new String("Hello ");

        char[] charArr = {'H', 'e', 'l', 'l', 'o'};
        String strIns2 = new String(charArr);

        StringBuffer sb = new StringBuffer(" Hello");
        String strIns3 = new String(sb);

        System.out.println("위의 3가지는 동일한 String 인스턴스를 생성 한다. : " + strIns + strIns2 + strIns3);

        String str = "I Study Java Lang...";
        String strCopy = "Java";

        System.out.println("str -> charAt: " + str.charAt(0)); // 지정된 위치(index)의 문자를 알려준다.
        System.out.println("str -> compareTo: " + str.compareTo("I Study")); // 문자열과 사전순서로 비교한다.
        System.out.println("str -> concat: " + str.concat(" So Easy"));
        System.out.println("str -> contains: " + str.contains("Java"));
        System.out.println("str -> endsWith: " + str.endsWith("..."));
        System.out.println("str -> equals: " + str.equals("I Study Java Lang..."));
        System.out.println("str -> equalsIgnoreCase: " + str.equalsIgnoreCase("i study java Lang..."));
        System.out.println("str -> indexOf: " + str.indexOf("Study"));
        System.out.println("str -> indexOf: " + str.indexOf("...", 1));
        System.out.println(("str -> intern: " + str.intern()).equals(strCopy.intern()));
        System.out.println("str -> lastIndexOf: " + str.lastIndexOf("Java"));
        System.out.println("str -> length: " + str.length());
        System.out.println("str -> replace: " + str.replace("Java", "Rust"));
        System.out.println("str -> replaceAll: " + str.replaceAll(" ", "+"));
        System.out.println("str -> replaceFirst: " + str.replaceFirst(" ", "-"));
        System.out.println("str -> split: " + Arrays.toString(str.split(" ")));
        System.out.println("str -> startsWith: " + str.startsWith("I"));
        System.out.println("str -> substring: " + str.substring(13));
        System.out.println("str -> toLowerCase: " + str.toLowerCase());
        System.out.println("str -> toString: " + str.toString());
        System.out.println("str -> toUpperCase: " + str.toUpperCase());
        System.out.println("str -> trim: " + str.trim());
        System.out.println("str -> valueOf: " + String.valueOf(1000));
    }
}
