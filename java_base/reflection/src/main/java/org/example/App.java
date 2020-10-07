package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println);
//        Arrays.stream(MyBook.class.getDeclaredAnnotations()).forEach(System.out::println);

        Class<?> bookClass =  Class.forName("org.example.Book");

        Constructor<?> constructor =  bookClass.getConstructor(String.class);

        Book book = (Book) constructor.newInstance("myBook");
        System.out.println(book);

        Field field = Book.class.getDeclaredField("A");
        System.out.println(field.get(null));

        field.set(null, "AAAAAAAAAA");
        System.out.println(field.get(null));

        Field field2 = Book.class.getDeclaredField("B");
        field2.setAccessible(true);
        System.out.println(field2.get(book));
        field2.set(book, "BBBB");
        System.out.println(field2.get(book));

    }
}
