package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class LightClassOriginKind {
    public static final /* synthetic */ LightClassOriginKind[] X = {new LightClassOriginKind("SOURCE", 0), new LightClassOriginKind("BINARY", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    LightClassOriginKind EF5;

    public static LightClassOriginKind valueOf(String str) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, str);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) X.clone();
    }
}
