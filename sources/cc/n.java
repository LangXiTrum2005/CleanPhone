package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f6181a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f6182b = mc.c.a("baseAddress");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f6183c = mc.c.a("size");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f6184d = mc.c.a("name");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f6185e = mc.c.a("uuid");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        mc.e eVar = (mc.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.f(f6182b, x0Var.f6331a);
        eVar.f(f6183c, x0Var.f6332b);
        eVar.a(f6184d, x0Var.f6333c);
        String str = x0Var.f6334d;
        eVar.a(f6185e, str != null ? str.getBytes(u2.f6303a) : null);
    }
}
