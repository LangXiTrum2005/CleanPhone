package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f49105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f49106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f49107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b0[] f49108d;

    static {
        b0 b0Var = new b0("INVARIANT", 0);
        f49105a = b0Var;
        b0 b0Var2 = new b0("IN", 1);
        f49106b = b0Var2;
        b0 b0Var3 = new b0("OUT", 2);
        f49107c = b0Var3;
        f49108d = new b0[]{b0Var, b0Var2, b0Var3};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f49108d.clone();
    }
}
