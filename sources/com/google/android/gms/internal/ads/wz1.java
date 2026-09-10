package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wz1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wz1 f21652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wz1 f21653c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21654a;

    static {
        wz1 wz1Var = new wz1(0L);
        f21652b = new wz1(Long.MAX_VALUE);
        f21653c = wz1Var;
    }

    public wz1(long j10) {
        this.f21654a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && wz1.class == obj.getClass() && this.f21654a == ((wz1) obj).f21654a;
    }

    public final int hashCode() {
        return ((int) this.f21654a) * 31;
    }
}
