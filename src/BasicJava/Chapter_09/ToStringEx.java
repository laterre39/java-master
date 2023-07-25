package BasicJava.Chapter_09;

class Card {
    String kind;
    int number;

    public Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString()); // 기본적인 메서드 로직인 해시코드 값은 얻게 된다. Ex)Card@11531931
        System.out.println(c2.toString());
    }
}
