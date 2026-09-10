package ud;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f52048a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f52049b = mc.c.a("appId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f52050c = mc.c.a("deviceModel");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f52051d = mc.c.a("sessionSdkVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f52052e = mc.c.a("osVersion");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mc.c f52053f = mc.c.a("logEnvironment");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mc.c f52054g = mc.c.a("androidAppInfo");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        mc.e eVar = (mc.e) obj2;
        eVar.a(f52049b, bVar.f52015a);
        eVar.a(f52050c, Build.MODEL);
        eVar.a(f52051d, "3.0.7");
        eVar.a(f52052e, Build.VERSION.RELEASE);
        eVar.a(f52053f, x.LOG_ENVIRONMENT_PROD);
        eVar.a(f52054g, bVar.f52016b);
    }
}
