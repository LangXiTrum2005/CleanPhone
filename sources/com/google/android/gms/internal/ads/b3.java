package com.google.android.gms.internal.ads;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b3 f12618c = new b3(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12620b;

    public b3(long j10, long j11) {
        this.f12619a = j10;
        this.f12620b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b3.class == obj.getClass()) {
            b3 b3Var = (b3) obj;
            if (this.f12619a == b3Var.f12619a && this.f12620b == b3Var.f12620b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12619a) * 31) + ((int) this.f12620b);
    }

    public final String toString() {
        long j10 = this.f12619a;
        int length = String.valueOf(j10).length();
        long j11 = this.f12620b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(j11).length() + 1);
        q4.a.r(sb2, "[timeUs=", j10, ", position=");
        return defpackage.e.r(sb2, j11, X3.j.f27836e);
    }
}
