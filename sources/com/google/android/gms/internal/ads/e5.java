package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13838c;

    public e5(long j10, long j11, int i10) {
        ps1.v(j10 < j11);
        this.f13836a = j10;
        this.f13837b = j11;
        this.f13838c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e5.class == obj.getClass()) {
            e5 e5Var = (e5) obj;
            if (this.f13836a == e5Var.f13836a && this.f13837b == e5Var.f13837b && this.f13838c == e5Var.f13838c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13836a), Long.valueOf(this.f13837b), Integer.valueOf(this.f13838c));
    }

    public final String toString() {
        String str = uu0.f20901a;
        Locale locale = Locale.US;
        StringBuilder sbL = wi.d.l(this.f13836a, "Segment: startTimeMs=", ", endTimeMs=");
        sbL.append(this.f13837b);
        sbL.append(", speedDivisor=");
        sbL.append(this.f13838c);
        return sbL.toString();
    }
}
