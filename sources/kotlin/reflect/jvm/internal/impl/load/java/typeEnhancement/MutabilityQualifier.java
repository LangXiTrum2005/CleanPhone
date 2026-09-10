package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class MutabilityQualifier {
    public static final MutabilityQualifier X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final MutabilityQualifier f43928Y;
    public static final /* synthetic */ MutabilityQualifier[] Z;

    static {
        MutabilityQualifier mutabilityQualifier = new MutabilityQualifier("READ_ONLY", 0);
        X = mutabilityQualifier;
        MutabilityQualifier mutabilityQualifier2 = new MutabilityQualifier("MUTABLE", 1);
        f43928Y = mutabilityQualifier2;
        Z = new MutabilityQualifier[]{mutabilityQualifier, mutabilityQualifier2};
    }

    public static MutabilityQualifier valueOf(String str) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, str);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) Z.clone();
    }
}
