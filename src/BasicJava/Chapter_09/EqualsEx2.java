package BasicJava.Chapter_09;

class Person {
    long id;

    public boolean equals(Object obj) {  // equals 오버라이딩
        if (obj instanceof Person) { // 인스턴스가 person 을 참조하면 인스턴스의 id를 비교한다.
            return id == ((Person)obj).id;
        }
        else return false;
    }

    Person(long id) {
        this.id = id;
    }
}
public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(1234123422L);
        Person p2 = new Person(1234123422L);

        if (p1 == p2) { // 인스턴스가 다르기 때문에 false
            System.out.println("p1과 p2는 같습니다.");
        }
        else
            System.out.println("p1과 p2는 다릅니다.");


        if (p1.equals(p2)) { // 인스턴스가 다르지만 오버라이딩 된 equals 에 따라 값을 비교하기 때문에 true
            System.out.println("p1과 p2는 같습니다.");
        }
        else
            System.out.println("p1과 p2는 다릅니다.");
    }
}
