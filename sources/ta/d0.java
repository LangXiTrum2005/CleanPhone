package ta;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f50598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f50599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f50600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d0[] f50601d;

    static {
        d0 d0Var = new d0("NOT_RUN", 0);
        f50598a = d0Var;
        d0 d0Var2 = new d0("CANCELLED", 1);
        f50599b = d0Var2;
        d0 d0Var3 = new d0("STARTED", 2);
        f50600c = d0Var3;
        f50601d = new d0[]{d0Var, d0Var2, d0Var3};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f50601d.clone();
    }
}
