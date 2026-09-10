package ud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f52190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f52191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ z0[] f52192c;

    static {
        z0 z0Var = new z0("GENERAL", 0);
        f52190a = z0Var;
        z0 z0Var2 = new z0("FALLBACK", 1);
        f52191b = z0Var2;
        f52192c = new z0[]{z0Var, z0Var2};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f52192c.clone();
    }
}
