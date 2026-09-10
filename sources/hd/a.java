package hd;

import nd.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fd.a f42314d = fd.a.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f42315c;

    public a(j jVar) {
        this.f42315c = jVar;
    }

    @Override // hd.e
    public final boolean a() {
        fd.a aVar = f42314d;
        j jVar = this.f42315c;
        if (jVar == null) {
            aVar.f("ApplicationInfo is null");
        } else if (!jVar.r()) {
            aVar.f("GoogleAppId is null");
        } else if (!jVar.p()) {
            aVar.f("AppInstanceId is null");
        } else if (!jVar.q()) {
            aVar.f("ApplicationProcessState is null");
        } else {
            if (!jVar.o()) {
                return true;
            }
            if (!jVar.m().l()) {
                aVar.f("AndroidAppInfo.packageName is null");
            } else {
                if (jVar.m().m()) {
                    return true;
                }
                aVar.f("AndroidAppInfo.sdkVersion is null");
            }
        }
        aVar.f("ApplicationInfo is invalid");
        return false;
    }
}
