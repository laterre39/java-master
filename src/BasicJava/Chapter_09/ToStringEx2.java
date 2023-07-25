package BasicJava.Chapter_09;

import java.util.Date;

public class ToStringEx2 {
    public static void main(String[] args) {
        String str = new String("KOREA");
        Date today = new Date();

        System.out.println(str); // 문자열의 경우 값을 출력하도록 오버라이딩 되어 있다.
        System.out.println(str.toString()); // 생략하고 작성해도 되지만 메서드를 호출해도 된다.
        System.out.println(today);
        System.out.println(today.toString());
    }
}
