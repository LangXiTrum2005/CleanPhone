package com.startapp.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TypeClassInfo {
    String decider() default "";

    boolean extendsClass() default false;

    Class[] inheritClasses() default {};

    String packageName() default "";
}
