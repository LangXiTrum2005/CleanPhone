package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f15530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f15531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CBError f15532c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15533e;

    public xa(l1 appRequest, z zVar, CBError cBError, long j, long j2) {
        Intrinsics.f(appRequest, "appRequest");
        this.f15530a = appRequest;
        this.f15531b = zVar;
        this.f15532c = cBError;
        this.d = j;
        this.f15533e = j2;
    }

    public final z a() {
        return this.f15531b;
    }

    public final CBError b() {
        return this.f15532c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return Intrinsics.a(this.f15530a, xaVar.f15530a) && Intrinsics.a(this.f15531b, xaVar.f15531b) && Intrinsics.a(this.f15532c, xaVar.f15532c) && this.d == xaVar.d && this.f15533e == xaVar.f15533e;
    }

    public int hashCode() {
        int iHashCode = this.f15530a.hashCode() * 31;
        z zVar = this.f15531b;
        int iHashCode2 = (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        CBError cBError = this.f15532c;
        return Long.hashCode(this.f15533e) + androidx.media3.extractor.text.ttml.a.b((iHashCode2 + (cBError != null ? cBError.hashCode() : 0)) * 31, 31, this.d);
    }

    public String toString() {
        return "LoadResult(appRequest=" + this.f15530a + ", adUnit=" + this.f15531b + ", error=" + this.f15532c + ", requestResponseCodeNs=" + this.d + ", readDataNs=" + this.f15533e + ")";
    }

    public /* synthetic */ xa(l1 l1Var, z zVar, CBError cBError, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l1Var, (i2 & 2) != 0 ? null : zVar, (i2 & 4) != 0 ? null : cBError, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0L : j2);
    }
}
