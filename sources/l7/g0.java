package l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f45133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f45134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f45135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f45136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0 f45137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g0 f45138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g0 f45139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g0[] f45140h;

    static {
        g0 g0Var = new g0("REQUESTS", 0);
        f45133a = g0Var;
        g0 g0Var2 = new g0("INCLUDE_ACCESS_TOKENS", 1);
        f45134b = g0Var2;
        g0 g0Var3 = new g0("INCLUDE_RAW_RESPONSES", 2);
        f45135c = g0Var3;
        g0 g0Var4 = new g0("CACHE", 3);
        g0 g0Var5 = new g0("APP_EVENTS", 4);
        f45136d = g0Var5;
        g0 g0Var6 = new g0("DEVELOPER_ERRORS", 5);
        f45137e = g0Var6;
        g0 g0Var7 = new g0("GRAPH_API_DEBUG_WARNING", 6);
        f45138f = g0Var7;
        g0 g0Var8 = new g0("GRAPH_API_DEBUG_INFO", 7);
        f45139g = g0Var8;
        f45140h = new g0[]{g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f45140h.clone();
    }
}
