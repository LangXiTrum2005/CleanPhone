package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierValidator;

/* JADX WARN: Classes with same name are omitted, all sources:
  assets/audience_network/classes2.dex
  classes7.dex
 */
/* JADX WARN: Method from annotation default annotation not found: when */
/* JADX INFO: loaded from: classes7.dex */
@TypeQualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Nonnull {

    public static class Checker implements TypeQualifierValidator<Nonnull> {
    }
}
