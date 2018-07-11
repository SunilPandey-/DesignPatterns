package com.designpatterns.singelton;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");

        {
            // Eager Initialization block
            EagerInitializedSingleton es1 = EagerInitializedSingleton.getInstance();
            EagerInitializedSingleton es2 = EagerInitializedSingleton.getInstance();
            System.out.println("es1 hascode: " + es1.hashCode());
            System.out.println("es2 hascode: " + es2.hashCode());
            if (es1.hashCode() == es2.hashCode())
                System.out.println("Both eager instances are Pointing to same location");
            else
                System.out.println("both eager  are different instances ");

        }


        {
            // Static block singleton
            StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
            StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();
            System.out.println("es1 hascode: " + s1.hashCode());
            System.out.println("es2 hascode: " + s2.hashCode());
            if (s1.hashCode() == s2.hashCode())
                System.out.println("Both static instances are Pointing to same location");
            else
                System.out.println("both static are different instances ");

        }

        {
            // Lazy Initialized Singelton
            LazyInitializedSingleton l1 = LazyInitializedSingleton.getInstance();
            LazyInitializedSingleton l2 = LazyInitializedSingleton.getInstance();
            System.out.println("es1 hascode: " + l1.hashCode());
            System.out.println("es2 hascode: " + l2.hashCode());
            if (l1.hashCode() == l2.hashCode())
                System.out.println("Both lazy instances are Pointing to same location");
            else
                System.out.println("both lazy are different instances ");
        }

        {
            ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance();
            ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance();
            System.out.println("es1 hascode: " + t1.hashCode());
            System.out.println("es2 hascode: " + t2.hashCode());
            if (t1.hashCode() == t2.hashCode())
                System.out.println("Both thread safe instances are Pointing to same location");
            else
                System.out.println("both thread safe are different instances ");
        }

        {
            ThreadSafeSingletonDoubleLock td1 = ThreadSafeSingletonDoubleLock.getInstance();
            ThreadSafeSingletonDoubleLock td2 = ThreadSafeSingletonDoubleLock.getInstance();
            System.out.println("es1 hascode: " + td1.hashCode());
            System.out.println("es2 hascode: " + td2.hashCode());
            if (td1.hashCode() == td2.hashCode())
                System.out.println("Both thread safe double lock instances are Pointing to same location");
            else
                System.out.println("both thread safe double lock  are different instances ");
        }


    }
}
