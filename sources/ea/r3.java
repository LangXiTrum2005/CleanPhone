package ea;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r3 f39745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r3 f39746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r3[] f39747c;

    static {
        r3 r3Var = new r3("CONSENT", 0);
        f39745a = r3Var;
        r3 r3Var2 = new r3("LEGITIMATE_INTEREST", 1);
        r3 r3Var3 = new r3("FLEXIBLE_CONSENT", 2);
        r3 r3Var4 = new r3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f39746b = r3Var4;
        f39747c = new r3[]{r3Var, r3Var2, r3Var3, r3Var4};
    }

    public static r3[] values() {
        return (r3[]) f39747c.clone();
    }
}
