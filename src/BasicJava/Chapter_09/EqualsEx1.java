package BasicJava.Chapter_09;

public class EqualsEx1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) { // 같은 인스턴스를 참조하고 있는지 검사한다.
            System.out.println("v1과 v2는 같습니다.");
        }
        else
            System.out.println("v1과 v2는 다릅니다."); // 서로 다른 인스턴스이기 때문에 false 결과를 얻는다.

        v2 = v1;

        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다."); // 인스턴스 객체를 동일하게 해 true 결과를 얻는다.
        }
        else
            System.out.println("v1과 v2는 다릅니다.");
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}
