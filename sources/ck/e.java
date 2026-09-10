package ck;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX WARN: Method from annotation default annotation not found: i */
/* JADX WARN: Method from annotation default annotation not found: n */
/* JADX WARN: Method from annotation default annotation not found: nl */
/* JADX WARN: Method from annotation default annotation not found: s */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface e {
    String c() default "";

    String f() default "";

    int[] l() default {};

    String m() default "";

    int v() default 2;
}
