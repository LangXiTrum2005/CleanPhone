package cc;

import com.facebook.appevents.integrity.IntegrityManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f6224a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f6225b = mc.c.a("name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f6226c = mc.c.a("code");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f6227d = mc.c.a(IntegrityManager.INTEGRITY_TYPE_ADDRESS);

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        mc.e eVar = (mc.e) obj2;
        z0 z0Var = (z0) ((f2) obj);
        eVar.a(f6225b, z0Var.f6345a);
        eVar.a(f6226c, z0Var.f6346b);
        eVar.f(f6227d, z0Var.f6347c);
    }
}
