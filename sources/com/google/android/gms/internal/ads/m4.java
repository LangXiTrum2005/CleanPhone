package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m4 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17237e;

    public m4(long j10, long j11, long j12, long j13, long j14) {
        this.f17233a = j10;
        this.f17234b = j11;
        this.f17235c = j12;
        this.f17236d = j13;
        this.f17237e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m4.class == obj.getClass()) {
            m4 m4Var = (m4) obj;
            if (this.f17233a == m4Var.f17233a && this.f17234b == m4Var.f17234b && this.f17235c == m4Var.f17235c && this.f17236d == m4Var.f17236d && this.f17237e == m4Var.f17237e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17237e) + ((Long.hashCode(this.f17236d) + ((Long.hashCode(this.f17235c) + ((Long.hashCode(this.f17234b) + ((Long.hashCode(this.f17233a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        long j10 = this.f17233a;
        int length = String.valueOf(j10).length();
        long j11 = this.f17234b;
        int length2 = String.valueOf(j11).length();
        long j12 = this.f17235c;
        int length3 = String.valueOf(j12).length();
        long j13 = this.f17236d;
        int length4 = String.valueOf(j13).length();
        long j14 = this.f17237e;
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j14).length());
        q4.a.r(sb2, "Motion photo metadata: photoStartPosition=", j10, ", photoSize=");
        sb2.append(j11);
        q4.a.r(sb2, ", photoPresentationTimestampUs=", j12, ", videoStartPosition=");
        sb2.append(j13);
        return defpackage.e.s(sb2, ", videoSize=", j14);
    }
}
