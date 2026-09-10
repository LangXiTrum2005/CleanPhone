package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class K implements n {
    public static final K BE;
    public static final K BEFORE_BE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ K[] f43025a;

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f43025a.clone();
    }

    static {
        K k = new K("BEFORE_BE", 0);
        BEFORE_BE = k;
        K k2 = new K("BE", 1);
        BE = k2;
        f43025a = new K[]{k, k2};
    }

    @Override // j$.time.chrono.n
    public final int p() {
        return ordinal();
    }
}
