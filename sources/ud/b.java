package ud;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f52016b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.n.f(appId, "appId");
        kotlin.jvm.internal.n.f(deviceModel, "deviceModel");
        kotlin.jvm.internal.n.f(osVersion, "osVersion");
        this.f52015a = appId;
        this.f52016b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!kotlin.jvm.internal.n.a(this.f52015a, bVar.f52015a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!kotlin.jvm.internal.n.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return kotlin.jvm.internal.n.a(str2, str2) && this.f52016b.equals(bVar.f52016b);
    }

    public final int hashCode() {
        return this.f52016b.hashCode() + ((x.LOG_ENVIRONMENT_PROD.hashCode() + d5.u.e((((Build.MODEL.hashCode() + (this.f52015a.hashCode() * 31)) * 31) + 48517566) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f52015a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.7, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + x.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f52016b + ')';
    }
}
