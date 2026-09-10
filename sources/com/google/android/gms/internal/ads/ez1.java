package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ez1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r32 f14116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14123h;

    public ez1(r32 r32Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12) {
        ps1.v(!z12 || z10);
        ps1.v(!z11 || z10);
        this.f14116a = r32Var;
        this.f14117b = j10;
        this.f14118c = j11;
        this.f14119d = j12;
        this.f14120e = j13;
        this.f14121f = z10;
        this.f14122g = z11;
        this.f14123h = z12;
    }

    public final ez1 a(long j10, long j11) {
        return (j10 == this.f14117b && j11 == this.f14118c) ? this : new ez1(this.f14116a, j10, j11, this.f14119d, this.f14120e, this.f14121f, this.f14122g, this.f14123h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ez1.class == obj.getClass()) {
            ez1 ez1Var = (ez1) obj;
            if (this.f14117b == ez1Var.f14117b && this.f14119d == ez1Var.f14119d && this.f14120e == ez1Var.f14120e && this.f14121f == ez1Var.f14121f && this.f14122g == ez1Var.f14122g && this.f14123h == ez1Var.f14123h && Objects.equals(this.f14116a, ez1Var.f14116a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f14116a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f14117b)) * 31) + ((int) this.f14119d)) * 31) + ((int) this.f14120e)) * 961) + (this.f14121f ? 1 : 0)) * 31) + (this.f14122g ? 1 : 0)) * 31) + (this.f14123h ? 1 : 0);
    }
}
