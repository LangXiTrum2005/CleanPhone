package ne;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f46728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f46729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f46730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f46731d;

    static {
        g gVar = new g("FORCE_NONE", 0);
        f46728a = gVar;
        g gVar2 = new g("FORCE_SQUARE", 1);
        f46729b = gVar2;
        g gVar3 = new g("FORCE_RECTANGLE", 2);
        f46730c = gVar3;
        f46731d = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f46731d.clone();
    }
}
