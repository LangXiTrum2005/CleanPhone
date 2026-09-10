package ql;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f49143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f49144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f49145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f49146d;

    static {
        g gVar = new g("FORCE_FLEXIBILITY", 0);
        f49143a = gVar;
        g gVar2 = new g("NULLABLE", 1);
        f49144b = gVar2;
        g gVar3 = new g("NOT_NULL", 2);
        f49145c = gVar3;
        f49146d = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f49146d.clone();
    }
}
