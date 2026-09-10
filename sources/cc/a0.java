package cc;

import com.ironsource.O6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f5981a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f5982b = mc.c.a(O6.H);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f5983c = mc.c.a("version");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f5984d = mc.c.a("buildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f5985e = mc.c.a("jailbroken");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        mc.e eVar = (mc.e) obj2;
        n1 n1Var = (n1) ((r2) obj);
        eVar.e(f5982b, n1Var.f6197a);
        eVar.a(f5983c, n1Var.f6198b);
        eVar.a(f5984d, n1Var.f6199c);
        eVar.c(f5985e, n1Var.f6200d);
    }
}
