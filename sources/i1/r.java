package i1;

import com.google.android.gms.internal.ads.q2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42664a;

    static {
        new r(new q2());
        l1.y.G(0);
        l1.y.G(1);
        l1.y.G(2);
        l1.y.G(3);
        l1.y.G(4);
        l1.y.G(5);
        l1.y.G(6);
        l1.y.G(7);
    }

    public r(q2 q2Var) {
        String str = l1.y.f44830a;
        this.f42664a = q2Var.f18888a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f42664a == ((r) obj).f42664a;
    }

    public final int hashCode() {
        long j10 = this.f42664a;
        return ((((int) 0) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 923521;
    }
}
