package x5;

import com.google.android.gms.internal.play_billing.q1;
import java.util.List;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f53643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f53644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f53645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53646d;

    public b(c cVar, a aVar, d dVar, String str) {
        this.f53643a = cVar;
        this.f53644b = aVar;
        this.f53645c = dVar;
        this.f53646d = str;
    }

    public final List a() {
        return o.Q(this.f53643a, this.f53644b, this.f53645c, this.f53646d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return q1.k(a(), ((b) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IRInstallationReferrer(type=");
        sb2.append(this.f53643a);
        sb2.append(", installationPlatform=");
        sb2.append(this.f53644b);
        sb2.append(", platform=");
        sb2.append(this.f53645c);
        sb2.append(", packageName=");
        return wi.d.k(sb2, this.f53646d, ')');
    }
}
