package cc;

import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f6142a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f6143b = mc.c.a("generator");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f6144c = mc.c.a("identifier");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f6145d = mc.c.a("appQualitySessionId");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f6146e = mc.c.a("startedAt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mc.c f6147f = mc.c.a("endedAt");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mc.c f6148g = mc.c.a("crashed");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mc.c f6149h = mc.c.a(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final mc.c f6150i = mc.c.a("user");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mc.c f6151j = mc.c.a(O6.F);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final mc.c f6152k = mc.c.a(X3.i.G);
    public static final mc.c l = mc.c.a("events");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final mc.c f6153m = mc.c.a("generatorType");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        mc.e eVar = (mc.e) obj2;
        n0 n0Var = (n0) ((t2) obj);
        eVar.a(f6143b, n0Var.f6186a);
        eVar.a(f6144c, n0Var.f6187b.getBytes(u2.f6303a));
        eVar.a(f6145d, n0Var.f6188c);
        eVar.f(f6146e, n0Var.f6189d);
        eVar.a(f6147f, n0Var.f6190e);
        eVar.c(f6148g, n0Var.f6191f);
        eVar.a(f6149h, n0Var.f6192g);
        eVar.a(f6150i, n0Var.f6193h);
        eVar.a(f6151j, n0Var.f6194i);
        eVar.a(f6152k, n0Var.f6195j);
        eVar.a(l, n0Var.f6196k);
        eVar.e(f6153m, n0Var.l);
    }
}
