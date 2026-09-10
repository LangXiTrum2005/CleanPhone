package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d21 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13373c;

    public d21(long j10, long j11, long j12) {
        this.f13371a = j10;
        this.f13372b = j11;
        this.f13373c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d21)) {
            return false;
        }
        d21 d21Var = (d21) obj;
        return this.f13371a == d21Var.f13371a && this.f13372b == d21Var.f13372b && this.f13373c == d21Var.f13373c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13373c) + ((Long.hashCode(this.f13372b) + ((Long.hashCode(this.f13371a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        long j10 = this.f13371a;
        int length = String.valueOf(j10).length();
        long j11 = this.f13372b;
        int length2 = String.valueOf(j11).length();
        long j12 = this.f13373c;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j12).length());
        q4.a.r(sb2, "Mp4Timestamp: creation time=", j10, ", modification time=");
        sb2.append(j11);
        return defpackage.e.s(sb2, ", timescale=", j12);
    }
}
