package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f49109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f49110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f49111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f49112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c0[] f49113e;

    static {
        c0 c0Var = new c0("PUBLIC", 0);
        f49109a = c0Var;
        c0 c0Var2 = new c0("PROTECTED", 1);
        f49110b = c0Var2;
        c0 c0Var3 = new c0("INTERNAL", 2);
        f49111c = c0Var3;
        c0 c0Var4 = new c0("PRIVATE", 3);
        f49112d = c0Var4;
        f49113e = new c0[]{c0Var, c0Var2, c0Var3, c0Var4};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f49113e.clone();
    }
}
