package com.example.demo.JZOffer;

public class 单例模式2 {
    public static void main(String[] args) {
        People people = People.getInstance();
        System.out.println(people.get());
    }
    static class People{
        private People(){}
        private static People people;

        //双重检查机制
        public static People getInstance() {
            if (people == null) {
                synchronized (People.class) {
                    if (people == null) {
                        people = new People();
                    }
                }
            }
            return people;
        }

        //方法
        public int get(){
            return 1;
        }
    }

    //饿汉模式：线程安全，耗费资源。
    static class HugerSingletonTest {
        //该对象的引用不可修改
        private static final HugerSingletonTest ourInstance = new HugerSingletonTest();

        public static HugerSingletonTest getInstance() {
            return ourInstance;
        }

        private HugerSingletonTest() {}
    }

    //在静态代码块实例对象
    static class Singleton {
        private static Singleton ourInstance;

        static {
            ourInstance = new Singleton();
        }

        public static Singleton getInstance() {
            return ourInstance;
        }

        private Singleton() {}
    }
}
