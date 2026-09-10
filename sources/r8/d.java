package r8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f49469a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f49470b = new mc.c("logSource", q4.a.m(q4.a.l(pc.e.class, new pc.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f49471c = new mc.c("logEventDropped", q4.a.m(q4.a.l(pc.e.class, new pc.a(2))));

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        u8.e eVar = (u8.e) obj;
        mc.e eVar2 = (mc.e) obj2;
        eVar2.a(f49470b, eVar.f51930a);
        eVar2.a(f49471c, eVar.f51931b);
    }
}
