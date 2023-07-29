package BasicJava.Chapter_09;

import java.util.Arrays;
import java.util.StringJoiner;

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
        System.out.println("str -> concat: " + str.concat(" So Easy")); // 문자열을 뒤에 붙인다.
        System.out.println("str -> contains: " + str.contains("Java")); // 지정된 문자열이 있는지 검사한다.
        System.out.println("str -> endsWith: " + str.endsWith("...")); // 지정된 문자열로 끝나는지 검사한다.
        System.out.println("str -> equals: " + str.equals("I Study Java Lang...")); // 지정된 문자열이 똑같은지 검사한다.
        System.out.println("str -> equalsIgnoreCase: " + str.equalsIgnoreCase("i study java Lang...")); // 지정된 문자열이 똑같은지 대소문자 구별없이 검사한다.
        System.out.println("str -> indexOf: " + str.indexOf("Study")); // 지정된 문자열의 위치를 알려준다
        System.out.println("str -> indexOf: " + str.indexOf("...", 1)); // 검색 시작 지점을 지정할 수 있다.
        System.out.println(("str -> intern: " + str.intern()).equals(strCopy.intern())); // 상수풀에 지정된 문자열이 있는지 찾고 주소를 반환한다.
        System.out.println("str -> lastIndexOf: " + str.lastIndexOf("Java")); // 끝에서 부터 위치를 찾아서 반환한다.
        System.out.println("str -> length: " + str.length()); // 문자열의 길이를 반환한다.
        System.out.println("str -> replace: " + str.replace("Java", "Rust")); // 지정된 문자열을 새문자열로 변경해서 반환한다.
        System.out.println("str -> replaceAll: " + str.replaceAll(" ", "+")); // 지정된 문자열을 새문자열로 모두 변경해서 반환한다.
        System.out.println("str -> replaceFirst: " + str.replaceFirst(" ", "-")); // 지정된 문자열의 첫 문자열만 변경해서 반환한다.
        System.out.println("str -> split: " + Arrays.toString(str.split(" "))); // 지정된 문자열로 짤라서 배열로 반환한다.
        System.out.println("str -> startsWith: " + str.startsWith("I")); // 지정된 문자열로 시작되는지 검사한다.
        System.out.println("str -> substring: " + str.substring(13, 17)); // 지정된 위치의 문자열을 얻는다.
        System.out.println("str -> toLowerCase: " + str.toLowerCase()); // 모든 문자열을 소문자로 변환해서 반환한다.
        System.out.println("str -> toString: " + str.toString()); // 문자열로 출력한다.
        System.out.println("str -> toUpperCase: " + str.toUpperCase()); // 모든 문자열을 대문자로 변환해서 반환한다.
        System.out.println("str -> trim: " + str.trim()); // 문자열 왼쪽과 오른쪽의 공백을 제거한다. 중간 공백은 제거되지 않는다.
        System.out.println("str -> valueOf: " + String.valueOf(1000)); // 지정된 값을 문자열로 변환해서 반환한다.

        String animals = "dog,cat,bear";
        String[] arrAn = animals.split(",");
        String strAn = String.join("-", arrAn);
        System.out.println("join ->: " + strAn);

        StringJoiner sj = new StringJoiner("/", "{", "}");
        String[] arrSj = {"aaa", "bbb", "ccc"};

        for (String sjs : arrSj) {
            sj.add(sjs.toUpperCase());
        }

        System.out.println(sj);

        String strFm = String.format("%d 더하기 %d는 %d 입니다.", 3, 5, 3 + 5);
        System.out.println(strFm);
    }
}
