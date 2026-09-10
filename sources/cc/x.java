package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f6326a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f6327b = mc.c.a("rolloutVariant");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f6328c = mc.c.a("parameterKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f6329d = mc.c.a("parameterValue");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f6330e = mc.c.a("templateVersion");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        mc.e eVar = (mc.e) obj2;
        j1 j1Var = (j1) ((o2) obj);
        eVar.a(f6327b, j1Var.f6125a);
        eVar.a(f6328c, j1Var.f6126b);
        eVar.a(f6329d, j1Var.f6127c);
        eVar.f(f6330e, j1Var.f6128d);
    }
}
