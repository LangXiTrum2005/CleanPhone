package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l4 implements k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i32 f16703d;

    public l4(long j10, long j11, boolean z10, i32 i32Var) {
        boolean z11 = true;
        if (j10 != C.TIME_UNSET && j11 != C.TIME_UNSET && j10 > j11) {
            z11 = false;
        }
        ps1.v(z11);
        this.f16700a = j10;
        this.f16701b = j11;
        this.f16702c = z10;
        this.f16703d = i32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l4.class == obj.getClass()) {
            l4 l4Var = (l4) obj;
            if (this.f16700a == l4Var.f16700a && this.f16701b == l4Var.f16701b && this.f16702c == l4Var.f16702c && Objects.equals(this.f16703d, l4Var.f16703d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f16701b) + ((Long.hashCode(this.f16700a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        i32 i32Var = this.f16703d;
        return (((iHashCode * 31) + (this.f16702c ? 1 : 0)) * 31) + (i32Var != null ? i32Var.hashCode() : 0);
    }

    public final String toString() {
        long j10 = this.f16700a;
        Object objValueOf = j10 == C.TIME_UNSET ? "UNSET" : Long.valueOf(j10);
        long j11 = this.f16701b;
        String string = objValueOf.toString();
        String strS = j11 == C.TIME_UNSET ? "" : defpackage.e.s(new StringBuilder(String.valueOf(j11).length() + 12), ", endTimeMs=", j11);
        i32 i32Var = this.f16703d;
        String strConcat = i32Var == null ? "" : ", title=".concat(i32Var.toString());
        String str = true == this.f16702c ? ", hidden" : "";
        StringBuilder sb2 = new StringBuilder(str.length() + strS.length() + string.length() + 21 + strConcat.length());
        d5.u.r(sb2, "Chapter: startTimeMs=", string, strS, str);
        sb2.append(strConcat);
        return sb2.toString();
    }
}
