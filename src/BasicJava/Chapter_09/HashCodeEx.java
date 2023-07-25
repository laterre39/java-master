package BasicJava.Chapter_09;

public class HashCodeEx {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode()); // 저장 된 위치를 알려주는 해시코드를 반환
        System.out.println(str2.hashCode()); // String 은 문자열이 같으면 동일한 해시코드를 반환한다.
        System.out.println(System.identityHashCode(str1));
        // 인스턴스의 주소값으로 해시코드를 생성해서 모든 인스턴스에 항상 다른 해시코드 값의 반환을 보장한다.
        System.out.println(System.identityHashCode(str2)); // 다른 코드를 반환한다.
    }
}
