package vd;

import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.n;
import zb.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f52555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f52556b = null;

    public a(CountDownLatch countDownLatch) {
        this.f52555a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.a(this.f52555a, aVar.f52555a) && n.a(this.f52556b, aVar.f52556b);
    }

    public final int hashCode() {
        int iHashCode = this.f52555a.hashCode() * 31;
        h hVar = this.f52556b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.f52555a + ", subscriber=" + this.f52556b + ')';
    }
}
