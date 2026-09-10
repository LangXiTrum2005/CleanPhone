package am;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f3755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f3756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n[] f3757c;

    static {
        n nVar = new n("RENDER_OVERRIDE", 0);
        f3755a = nVar;
        n nVar2 = new n("RENDER_OPEN", 1);
        f3756b = nVar2;
        f3757c = new n[]{nVar, nVar2, new n("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f3757c.clone();
    }
}
