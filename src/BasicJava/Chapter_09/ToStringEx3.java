package BasicJava.Chapter_09;

class Card2 {
    String kind;
    int number;

    public Card2() {
        this("SPADE", 1);
    }

    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() { // 오버라이딩을 인스턴스의 값을 반환 하도록 메서드를 정의했다.
        return "kind: " + kind + ", number: " + number;
    }
}

public class ToStringEx3 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 10);
        System.out.println(c1); // 오버라이딩된 메서드의 결과값을 얻는다.
        System.out.println(c2); // 예시) kind: HEART, number: 10
    }
}
