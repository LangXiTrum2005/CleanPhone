package r8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f49473a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f49474b = new mc.c("currentCacheSizeBytes", q4.a.m(q4.a.l(pc.e.class, new pc.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f49475c = new mc.c("maxCacheSizeBytes", q4.a.m(q4.a.l(pc.e.class, new pc.a(2))));

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        u8.f fVar = (u8.f) obj;
        mc.e eVar = (mc.e) obj2;
        eVar.f(f49474b, fVar.f51932a);
        eVar.f(f49475c, fVar.f51933b);
    }
}
