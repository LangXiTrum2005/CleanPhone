package kj;

import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f44703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f44704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44705c;

    public q(Double d10, Double d11, long j10) {
        this.f44703a = d10;
        this.f44704b = d11;
        this.f44705c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(q.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        q qVar = (q) obj;
        return a2.g(this.f44703a, qVar.f44703a) && a2.g(this.f44704b, qVar.f44704b) && a2.g(Long.valueOf(this.f44705c), Long.valueOf(qVar.f44705c));
    }

    public final int hashCode() {
        return a2.i(Long.valueOf(this.f44705c)) + ((a2.i(this.f44704b) + ((a2.i(this.f44703a) + (q.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageSelectionOptions(maxWidth=");
        sb2.append(this.f44703a);
        sb2.append(", maxHeight=");
        sb2.append(this.f44704b);
        sb2.append(", quality=");
        return defpackage.e.r(sb2, this.f44705c, ")");
    }
}
