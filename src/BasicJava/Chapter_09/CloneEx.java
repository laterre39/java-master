package BasicJava.Chapter_09;

import javax.sound.midi.Soundbank;

class Point implements Cloneable { // cloneable 인터페이스를 구현해야지 clone을 호출할 수 있다.
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public Object clone() { // 참조 타입의 복제를 위해 오버라이딩 한다. clone 은 인스턴스값만 복제하기 때문에
        Object obj = null; // clone 은 반드시 예외처리 되어야 한다.
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return obj;
    }

    public Point clone2() { // 1.5 버전부터 공변 반환을 통해 자손 객체의 타입으로 반환할 수 있다
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Point) obj;
    }
}
public class CloneEx {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point)original.clone();
        System.out.println(original);
        System.out.println(copy);

        Point orginal2 = new Point(7, 9);
        Point copy2 = orginal2.clone2(); // 번거로운 타입 형변환을 하지 않아도 된다.
        System.out.println(orginal2);
        System.out.println(copy2);
    }
}
