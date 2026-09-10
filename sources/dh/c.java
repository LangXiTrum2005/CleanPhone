package dh;

import java.util.Arrays;
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[][] f38889b;

    public c(long j10, double[][] dArr) {
        this.f38888a = j10;
        this.f38889b = dArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        n.d(obj, "null cannot be cast to non-null type com.storage.androidcleaner.flutter.services.scan.models.CombinedHash");
        c cVar = (c) obj;
        return this.f38888a == cVar.f38888a && k.d0(this.f38889b, cVar.f38889b);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(this.f38889b) + (Long.hashCode(this.f38888a) * 31);
    }

    public final String toString() {
        return "CombinedHash(imageHash=" + this.f38888a + ", colorHash=" + Arrays.toString(this.f38889b) + ")";
    }
}
