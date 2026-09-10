package d8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f38784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g[] f38785b;

    static {
        g gVar = new g("MOVE", 0);
        f38784a = gVar;
        f38785b = new g[]{gVar, new g("UPDATE", 1)};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f38785b.clone();
    }
}
