package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ClassKind {
    public static final ClassKind X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ClassKind f43559Y;
    public static final ClassKind Z;
    public static final ClassKind e0;
    public static final ClassKind f0;
    public static final ClassKind g0;
    public static final /* synthetic */ ClassKind[] h0;

    static {
        ClassKind classKind = new ClassKind("CLASS", 0);
        X = classKind;
        ClassKind classKind2 = new ClassKind("INTERFACE", 1);
        f43559Y = classKind2;
        ClassKind classKind3 = new ClassKind("ENUM_CLASS", 2);
        Z = classKind3;
        ClassKind classKind4 = new ClassKind("ENUM_ENTRY", 3);
        e0 = classKind4;
        ClassKind classKind5 = new ClassKind("ANNOTATION_CLASS", 4);
        f0 = classKind5;
        ClassKind classKind6 = new ClassKind("OBJECT", 5);
        g0 = classKind6;
        h0 = new ClassKind[]{classKind, classKind2, classKind3, classKind4, classKind5, classKind6};
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) h0.clone();
    }

    public final boolean d() {
        return this == g0 || this == e0;
    }
}
