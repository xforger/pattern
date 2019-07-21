package com.hzdq;

import com.hzdq.lazySingleton.InnerClassLazySingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Thread thread = new Thread(new ExecutorTread());
        Thread thread2 = new Thread(new ExecutorTread());
        thread.run();
        thread2.run();
//        reflectDestruction();
        serializeDestruction();
    }
    public static void reflectDestruction(){
        Class<?> cls= InnerClassLazySingleton.class;
        try {
            Constructor<?> constructor = cls.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object o1=constructor.newInstance();
            Object o2=constructor.newInstance();
            System.out.println(o1);
            System.out.println(o2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static void serializeDestruction(){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("InnerClassLazySingleton.obj");
            InnerClassLazySingleton innerClassLazySingleton = InnerClassLazySingleton.getInstance();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(innerClassLazySingleton);
            objectOutputStream.flush();
            objectOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream("InnerClassLazySingleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            InnerClassLazySingleton innerClassLazySingleton1=(InnerClassLazySingleton) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(innerClassLazySingleton);
            System.out.println(innerClassLazySingleton1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
