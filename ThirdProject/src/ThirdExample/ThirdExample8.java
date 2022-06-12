package ThirdExample;


interface Predator8 {
}

class Animal8 {
}

class Dog8 extends Animal8 {
}

class Lion8 extends Animal8 implements Predator8 {
}

public class ThirdExample8 {
    public static void main(String[] args) {
        Animal8 a = new Animal8();  // Animal8 is Animal8
        Animal8 b = new Dog8();  // Dog8 is Animal8
        Animal8 c = new Lion8();  // Lion8 is Animal8
        //Dog8 d = new Animal8();  // Animal8 is Dog8 -> Dog8 클래스는 Animal8의 자식 클래스로 IS-A 관계 미성립 
        Predator8 e = new Lion8();  // Lion8 is Predator8
    }
}

