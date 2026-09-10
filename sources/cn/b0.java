package cn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f6673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f6674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f6675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f6676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b0[] f6677e;

    static {
        b0 b0Var = new b0("DEFAULT", 0);
        f6673a = b0Var;
        b0 b0Var2 = new b0("LAZY", 1);
        f6674b = b0Var2;
        b0 b0Var3 = new b0("ATOMIC", 2);
        f6675c = b0Var3;
        b0 b0Var4 = new b0("UNDISPATCHED", 3);
        f6676d = b0Var4;
        f6677e = new b0[]{b0Var, b0Var2, b0Var3, b0Var4};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f6677e.clone();
    }
}
