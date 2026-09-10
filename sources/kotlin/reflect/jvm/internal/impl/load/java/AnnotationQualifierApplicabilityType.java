package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: loaded from: classes7.dex */
public enum AnnotationQualifierApplicabilityType {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PARAMETER("TYPE_PARAMETER");

    public final String X;

    AnnotationQualifierApplicabilityType(String str) {
        this.X = str;
    }
}
