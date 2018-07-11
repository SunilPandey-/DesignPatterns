package com.designpatterns.singelton;

public class ThreadSafeSingletonDoubleLock {

    private static ThreadSafeSingletonDoubleLock instance;
    private ThreadSafeSingletonDoubleLock(){}

    public static ThreadSafeSingletonDoubleLock getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingletonDoubleLock.class){
                if(instance == null){
                    instance = new ThreadSafeSingletonDoubleLock();
                }
            }
        }
        return instance;
    }
}
