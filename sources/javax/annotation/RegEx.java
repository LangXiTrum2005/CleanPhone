package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifierValidator;

/* JADX WARN: Method from annotation default annotation not found: when */
/* JADX INFO: loaded from: classes7.dex */
@Syntax
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface RegEx {

    public static class Checker implements TypeQualifierValidator<RegEx> {
    }
}
