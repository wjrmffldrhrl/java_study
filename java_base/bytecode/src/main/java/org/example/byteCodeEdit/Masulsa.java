package org.example.byteCodeEdit;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {
    public static void main(String[] args) {
//        ClassLoader classLoader = Masulsa.class.getClassLoader();
//        TypePool typePool = TypePool.Default.of(classLoader);
//        try {
//            new ByteBuddy().redefine(
//                    typePool.describe("org.example.byteCodeEdit.Moja").resolve(),
//                    ClassFileLocator.ForClassLoader.of(classLoader))
//                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                    .make().saveIn(new File("D:\\github\\java_study\\java_base\\bytecode\\target\\classes\\"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(new Moja().pullOut());


    }

}
