package r8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f49466a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f49467b = new mc.c("eventsDroppedCount", q4.a.m(q4.a.l(pc.e.class, new pc.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f49468c = new mc.c("reason", q4.a.m(q4.a.l(pc.e.class, new pc.a(3))));

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        u8.d dVar = (u8.d) obj;
        mc.e eVar = (mc.e) obj2;
        eVar.f(f49467b, dVar.f51927a);
        eVar.a(f49468c, dVar.f51928b);
    }
}
