package org.checkerframework.checker.interning.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf
public @interface InternedDistinct {
}
