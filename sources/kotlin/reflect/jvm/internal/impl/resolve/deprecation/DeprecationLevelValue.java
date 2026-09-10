package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class DeprecationLevelValue {
    public static final DeprecationLevelValue X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ DeprecationLevelValue[] f44312Y;

    /* JADX INFO: Fake field, exist only in values array */
    DeprecationLevelValue EF0;

    static {
        DeprecationLevelValue deprecationLevelValue = new DeprecationLevelValue("WARNING", 0);
        DeprecationLevelValue deprecationLevelValue2 = new DeprecationLevelValue("ERROR", 1);
        X = deprecationLevelValue2;
        f44312Y = new DeprecationLevelValue[]{deprecationLevelValue, deprecationLevelValue2, new DeprecationLevelValue("HIDDEN", 2)};
    }

    public static DeprecationLevelValue valueOf(String str) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, str);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) f44312Y.clone();
    }
}
