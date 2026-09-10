package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f6277a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f6278b = mc.c.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f6279c = mc.c.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f6280d = mc.c.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f6281e = mc.c.a("defaultProcess");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        mc.e eVar = (mc.e) obj2;
        e1 e1Var = (e1) ((j2) obj);
        eVar.a(f6278b, e1Var.f6068a);
        eVar.e(f6279c, e1Var.f6069b);
        eVar.e(f6280d, e1Var.f6070c);
        eVar.c(f6281e, e1Var.f6071d);
    }
}
