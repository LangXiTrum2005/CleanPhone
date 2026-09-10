package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11847u {
    public final long A00;
    public final long A01;
    public static final C11847u A04 = new C11847u(0, 0);
    public static final C11847u A02 = new C11847u(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C11847u A06 = new C11847u(Long.MAX_VALUE, 0);
    public static final C11847u A05 = new C11847u(0, Long.MAX_VALUE);
    public static final C11847u A03 = A04;

    public C11847u(long j, long j2) {
        AbstractC10843y.A07(j >= 0);
        AbstractC10843y.A07(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final long A00(long minPositionUs, long j, long j2) {
        if (this.A01 == 0 && this.A00 == 0) {
            return minPositionUs;
        }
        long jA0V = C5C.A0V(minPositionUs, this.A01, Long.MIN_VALUE);
        long jA0S = C5C.A0S(minPositionUs, this.A00, Long.MAX_VALUE);
        boolean z2 = true;
        boolean z3 = jA0V <= j && j <= jA0S;
        if (jA0V > j2 || j2 > jA0S) {
            z2 = false;
        }
        if (z3 && z2) {
            long jAbs = Math.abs(j - minPositionUs);
            long maxPositionUs = Math.abs(j2 - minPositionUs);
            if (jAbs <= maxPositionUs) {
                return j;
            }
            return j2;
        }
        if (z3) {
            return j;
        }
        if (z2) {
            return j2;
        }
        return jA0V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11847u c11847u = (C11847u) obj;
        return this.A01 == c11847u.A01 && this.A00 == c11847u.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
