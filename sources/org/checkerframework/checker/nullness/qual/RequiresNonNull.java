package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.PreconditionAnnotation;

/* JADX WARN: Classes with same name are omitted, all sources:
  assets/audience_network/classes.dex
  classes7.dex
 */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@PreconditionAnnotation
@Documented
@Repeatable(List.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresNonNull {

    /* JADX WARN: Classes with same name are omitted, all sources:
  assets/audience_network/classes.dex
  classes7.dex
 */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @PreconditionAnnotation
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
    }
}
