package org.example;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface Myannotation {

//    String name() default "jsh";
    String value() default "jsh";

    int number() default 100;

}
