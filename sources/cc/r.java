package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f6244a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f6245b = mc.c.a("name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f6246c = mc.c.a("importance");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f6247d = mc.c.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        mc.e eVar = (mc.e) obj2;
        a1 a1Var = (a1) ((h2) obj);
        eVar.a(f6245b, a1Var.f5986a);
        eVar.e(f6246c, a1Var.f5987b);
        eVar.a(f6247d, a1Var.f5988c);
    }
}
