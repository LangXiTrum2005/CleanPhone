package ud;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f52008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f52009e;

    public a(String str, String versionName, String appBuildVersion, e0 e0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.n.f(versionName, "versionName");
        kotlin.jvm.internal.n.f(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.n.f(deviceManufacturer, "deviceManufacturer");
        this.f52005a = str;
        this.f52006b = versionName;
        this.f52007c = appBuildVersion;
        this.f52008d = e0Var;
        this.f52009e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f52005a.equals(aVar.f52005a) || !kotlin.jvm.internal.n.a(this.f52006b, aVar.f52006b) || !kotlin.jvm.internal.n.a(this.f52007c, aVar.f52007c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return kotlin.jvm.internal.n.a(str, str) && this.f52008d.equals(aVar.f52008d) && this.f52009e.equals(aVar.f52009e);
    }

    public final int hashCode() {
        return this.f52009e.hashCode() + ((this.f52008d.hashCode() + d5.u.e(d5.u.e(d5.u.e(this.f52005a.hashCode() * 31, 31, this.f52006b), 31, this.f52007c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f52005a + ", versionName=" + this.f52006b + ", appBuildVersion=" + this.f52007c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f52008d + ", appProcessDetails=" + this.f52009e + ')';
    }
}
