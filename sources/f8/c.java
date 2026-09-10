package f8;

import com.applovin.impl.ca;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40693c;

    public c(long j10, long j11, boolean z10) {
        this.f40691a = j10;
        this.f40692b = j11;
        this.f40693c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f40691a == cVar.f40691a && this.f40692b == cVar.f40692b && this.f40693c == cVar.f40693c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40693c) + ca.j(this.f40692b, Long.hashCode(this.f40691a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbL = wi.d.l(this.f40691a, "DateCond(minMs=", ", maxMs=");
        sbL.append(this.f40692b);
        sbL.append(", ignore=");
        sbL.append(this.f40693c);
        sbL.append(")");
        return sbL.toString();
    }
}
