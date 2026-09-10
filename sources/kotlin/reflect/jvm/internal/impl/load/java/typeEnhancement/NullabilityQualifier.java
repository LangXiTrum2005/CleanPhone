package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class NullabilityQualifier {
    public static final NullabilityQualifier X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final NullabilityQualifier f43930Y;
    public static final NullabilityQualifier Z;
    public static final /* synthetic */ NullabilityQualifier[] e0;

    static {
        NullabilityQualifier nullabilityQualifier = new NullabilityQualifier("FORCE_FLEXIBILITY", 0);
        X = nullabilityQualifier;
        NullabilityQualifier nullabilityQualifier2 = new NullabilityQualifier("NULLABLE", 1);
        f43930Y = nullabilityQualifier2;
        NullabilityQualifier nullabilityQualifier3 = new NullabilityQualifier("NOT_NULL", 2);
        Z = nullabilityQualifier3;
        e0 = new NullabilityQualifier[]{nullabilityQualifier, nullabilityQualifier2, nullabilityQualifier3};
    }

    public static NullabilityQualifier valueOf(String str) {
        return (NullabilityQualifier) Enum.valueOf(NullabilityQualifier.class, str);
    }

    public static NullabilityQualifier[] values() {
        return (NullabilityQualifier[]) e0.clone();
    }
}
