package ThirdExample;

interface Predator9 {
    String bark();
}

abstract class Animal9 {
    public String hello() {
        return "hello";
    }
}

class Dog9 extends Animal9 {
}

class Lion9 extends Animal9 implements Predator9 {
    public String bark() {
        return "Bark bark!!";
    }
}

public class ThirldExample9 {
    public static void main(String[] args) {
        Animal9 a = new Lion9(); //Lion9으로 만든 객체 a를 Animal9 자료형으로 사용, Animal9 클래스의 메소드만 사용 가능 
        Lion9 b = new Lion9();
        Predator9 c = new Lion9(); //Lion9으로 만든 객체 c를 Predator9 자료형으로 사용, Predator9 클래스의 메소드만 사용 가능

        System.out.println(a.hello());
        //System.out.println(a.bark());   //a 객체가 Animal9 타입으로 생성되어 hello 메서드만 사용 가능 
        System.out.println(b.hello());
        System.out.println(b.bark());
        //System.out.println(c.hello());  //c 객체가 Predator9 타입으로 생성되어 bark 메서드만 사용 가능 
        System.out.println(c.bark());
    }
}