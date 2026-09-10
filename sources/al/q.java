package al;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f3659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f3660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f3661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f3662d;

    static {
        q qVar = new q("RUNTIME", 0);
        f3659a = qVar;
        q qVar2 = new q("BINARY", 1);
        f3660b = qVar2;
        q qVar3 = new q("SOURCE", 2);
        f3661c = qVar3;
        f3662d = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f3662d.clone();
    }
}
