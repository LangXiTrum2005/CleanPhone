package ud;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f52024a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f52025b = mc.c.a("packageName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f52026c = mc.c.a("versionName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f52027d = mc.c.a("appBuildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f52028e = mc.c.a("deviceManufacturer");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mc.c f52029f = mc.c.a("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mc.c f52030g = mc.c.a("appProcessDetails");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        mc.e eVar = (mc.e) obj2;
        eVar.a(f52025b, aVar.f52005a);
        eVar.a(f52026c, aVar.f52006b);
        eVar.a(f52027d, aVar.f52007c);
        eVar.a(f52028e, Build.MANUFACTURER);
        eVar.a(f52029f, aVar.f52008d);
        eVar.a(f52030g, aVar.f52009e);
    }
}
