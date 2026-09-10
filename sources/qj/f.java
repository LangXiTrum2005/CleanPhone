package qj;

import java.util.List;
import java.util.Map;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f49046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f49047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49048d;

    public f(String str, q qVar, Map map, String str2) {
        this.f49045a = str;
        this.f49046b = qVar;
        this.f49047c = map;
        this.f49048d = str2;
    }

    public final List a() {
        return xj.o.Q(this.f49045a, this.f49046b, this.f49047c, this.f49048d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(a(), ((f) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "CreationOptions(uri=" + this.f49045a + ", formatHint=" + this.f49046b + ", httpHeaders=" + this.f49047c + ", userAgent=" + this.f49048d + ")";
    }
}
