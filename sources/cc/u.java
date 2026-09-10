package cc;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f6288a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f6289b = mc.c.a(X3.j.Y);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f6290c = mc.c.a("batteryVelocity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f6291d = mc.c.a("proximityOn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f6292e = mc.c.a("orientation");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mc.c f6293f = mc.c.a("ramUsed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mc.c f6294g = mc.c.a("diskUsed");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        mc.e eVar = (mc.e) obj2;
        g1 g1Var = (g1) ((l2) obj);
        eVar.a(f6289b, g1Var.f6096a);
        eVar.e(f6290c, g1Var.f6097b);
        eVar.c(f6291d, g1Var.f6098c);
        eVar.e(f6292e, g1Var.f6099d);
        eVar.f(f6293f, g1Var.f6100e);
        eVar.f(f6294g, g1Var.f6101f);
    }
}
