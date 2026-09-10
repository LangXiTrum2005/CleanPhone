package kn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f44746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f44747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f44748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f44749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f44750e;

    static {
        g gVar = new g("SUCCESSFUL", 0);
        f44746a = gVar;
        g gVar2 = new g("REREGISTER", 1);
        f44747b = gVar2;
        g gVar3 = new g("CANCELLED", 2);
        f44748c = gVar3;
        g gVar4 = new g("ALREADY_SELECTED", 3);
        f44749d = gVar4;
        f44750e = new g[]{gVar, gVar2, gVar3, gVar4};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f44750e.clone();
    }
}
