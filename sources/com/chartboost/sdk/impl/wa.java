package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f15466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f15468c;
    public final Integer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f15469e;

    public wa(l1 appRequest, boolean z2, Integer num, Integer num2) {
        Intrinsics.f(appRequest, "appRequest");
        this.f15466a = appRequest;
        this.f15467b = z2;
        this.f15468c = num;
        this.d = num2;
        this.f15469e = new f0();
    }

    public final l1 a() {
        return this.f15466a;
    }

    public final Integer b() {
        return this.f15468c;
    }

    public final Integer c() {
        return this.d;
    }

    public final f0 d() {
        return this.f15469e;
    }

    public final boolean e() {
        return this.f15467b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        return Intrinsics.a(this.f15466a, waVar.f15466a) && this.f15467b == waVar.f15467b && Intrinsics.a(this.f15468c, waVar.f15468c) && Intrinsics.a(this.d, waVar.d);
    }

    public int hashCode() {
        int iE = Z.e(this.f15467b, this.f15466a.hashCode() * 31, 31);
        Integer num = this.f15468c;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "LoadParams(appRequest=" + this.f15466a + ", isCacheRequest=" + this.f15467b + ", bannerHeight=" + this.f15468c + ", bannerWidth=" + this.d + ")";
    }
}
