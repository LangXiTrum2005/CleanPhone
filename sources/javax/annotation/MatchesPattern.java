package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierValidator;

/* JADX WARN: Method from annotation default annotation not found: flags */
/* JADX INFO: loaded from: classes7.dex */
@TypeQualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MatchesPattern {

    public static class Checker implements TypeQualifierValidator<MatchesPattern> {
    }
}
