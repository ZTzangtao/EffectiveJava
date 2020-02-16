package zt.test.effectiveJava.chapter4_ClassAndInterface.extends_test;

import java.time.Instant;

public final class Sub extends Super {
    private final Instant instant;

    Sub(){
        instant = Instant.now();
    }

    //Overriding method invoked by superclass constructor
    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }

}
