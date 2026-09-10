package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f52075a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f52076b = mc.c.a("eventType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f52077c = mc.c.a("sessionData");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f52078d = mc.c.a("applicationInfo");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        mc.e eVar = (mc.e) obj2;
        n0Var.getClass();
        eVar.a(f52076b, m.SESSION_START);
        eVar.a(f52077c, n0Var.f52128a);
        eVar.a(f52078d, n0Var.f52129b);
    }
}
