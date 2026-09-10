package f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f40435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f40436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f40437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q0[] f40438d;

    static {
        q0 q0Var = new q0("PASS_THROUGH", 0);
        f40435a = q0Var;
        q0 q0Var2 = new q0("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f40436b = q0Var2;
        q0 q0Var3 = new q0("DISCARDING", 2);
        f40437c = q0Var3;
        f40438d = new q0[]{q0Var, q0Var2, q0Var3};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f40438d.clone();
    }
}
