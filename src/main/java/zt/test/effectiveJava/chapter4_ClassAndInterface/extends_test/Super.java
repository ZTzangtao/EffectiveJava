package zt.test.effectiveJava.chapter4_ClassAndInterface.extends_test;

/**
 * @author zangtao
 */
public class Super {
    //Broken - constructor invokes an overridable method
    public Super(){
        overrideMe();
    }

    public void overrideMe() {
    }
}
