package org.example.byteCodeEdit;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {
    public static void main(String[] args) {
//        try {
//            new ByteBuddy().redefine(Moja.class)
//                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                    .make().saveIn(new File("D:\\github\\java_study\\java_base\\bytecode\\target\\classes\\"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(new Moja().pullOut());


    }

}
