package com.ppdai.tutorial;

/**
 * Created by qiankai02 on 2017/6/30.
 */
abstract class Demo {
    void show() {
        System.out.println("......");
    }
    abstract void tell();

    public void test(String[] args) {
        Demo test = new Demo(){
            @Override
            void tell() {

            }
        };
    }
}

public class Test{
    static int age;
    static {
        System.out.println("age = " + age);
    }
    public static void main(String[] args) {
//        Test test = new Test();
//        System.out.println("age = " + test.age);
//        System.out.println("age = " + age);
    }
}
