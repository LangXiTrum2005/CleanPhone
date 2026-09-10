package ud;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f52081a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f52082b = mc.c.a(JsonStorageKeyNames.SESSION_ID_KEY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f52083c = mc.c.a("firstSessionId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f52084d = mc.c.a("sessionIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f52085e = mc.c.a("eventTimestampUs");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mc.c f52086f = mc.c.a("dataCollectionStatus");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mc.c f52087g = mc.c.a("firebaseInstallationId");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mc.c f52088h = mc.c.a("firebaseAuthenticationToken");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        mc.e eVar = (mc.e) obj2;
        eVar.a(f52082b, v0Var.f52167a);
        eVar.a(f52083c, v0Var.f52168b);
        eVar.e(f52084d, v0Var.f52169c);
        eVar.f(f52085e, v0Var.f52170d);
        eVar.a(f52086f, v0Var.f52171e);
        eVar.a(f52087g, v0Var.f52172f);
        eVar.a(f52088h, v0Var.f52173g);
    }
}
