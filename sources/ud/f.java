package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f52067a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f52068b = mc.c.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f52069c = mc.c.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f52070d = mc.c.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f52071e = mc.c.a("defaultProcess");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        mc.e eVar = (mc.e) obj2;
        eVar.a(f52068b, e0Var.f52063a);
        eVar.e(f52069c, e0Var.f52064b);
        eVar.e(f52070d, e0Var.f52065c);
        eVar.c(f52071e, e0Var.f52066d);
    }
}
