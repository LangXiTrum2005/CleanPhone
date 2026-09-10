package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AnnotatedCallableKind {
    public static final AnnotatedCallableKind X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final AnnotatedCallableKind f44376Y;
    public static final AnnotatedCallableKind Z;
    public static final AnnotatedCallableKind e0;
    public static final /* synthetic */ AnnotatedCallableKind[] f0;

    static {
        AnnotatedCallableKind annotatedCallableKind = new AnnotatedCallableKind("FUNCTION", 0);
        X = annotatedCallableKind;
        AnnotatedCallableKind annotatedCallableKind2 = new AnnotatedCallableKind("PROPERTY", 1);
        f44376Y = annotatedCallableKind2;
        AnnotatedCallableKind annotatedCallableKind3 = new AnnotatedCallableKind("PROPERTY_GETTER", 2);
        Z = annotatedCallableKind3;
        AnnotatedCallableKind annotatedCallableKind4 = new AnnotatedCallableKind("PROPERTY_SETTER", 3);
        e0 = annotatedCallableKind4;
        f0 = new AnnotatedCallableKind[]{annotatedCallableKind, annotatedCallableKind2, annotatedCallableKind3, annotatedCallableKind4};
    }

    public static AnnotatedCallableKind valueOf(String str) {
        return (AnnotatedCallableKind) Enum.valueOf(AnnotatedCallableKind.class, str);
    }

    public static AnnotatedCallableKind[] values() {
        return (AnnotatedCallableKind[]) f0.clone();
    }
}
