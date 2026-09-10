package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f15495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f15496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f15497c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15498e;

    public x(y adType, Integer num, Integer num2, String str, int i2) {
        Intrinsics.f(adType, "adType");
        this.f15495a = adType;
        this.f15496b = num;
        this.f15497c = num2;
        this.d = str;
        this.f15498e = i2;
    }

    public final y a() {
        return this.f15495a;
    }

    public final Integer b() {
        return this.f15496b;
    }

    public final int c() {
        return this.f15498e;
    }

    public final String d() {
        return this.d;
    }

    public final Integer e() {
        return this.f15497c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.a(this.f15495a, xVar.f15495a) && Intrinsics.a(this.f15496b, xVar.f15496b) && Intrinsics.a(this.f15497c, xVar.f15497c) && Intrinsics.a(this.d, xVar.d) && this.f15498e == xVar.f15498e;
    }

    public int hashCode() {
        int iHashCode = this.f15495a.hashCode() * 31;
        Integer num = this.f15496b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15497c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        return Integer.hashCode(this.f15498e) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        y yVar = this.f15495a;
        Integer num = this.f15496b;
        Integer num2 = this.f15497c;
        String str = this.d;
        int i2 = this.f15498e;
        StringBuilder sb = new StringBuilder("AdParameters(adType=");
        sb.append(yVar);
        sb.append(", height=");
        sb.append(num);
        sb.append(", width=");
        sb.append(num2);
        sb.append(", location=");
        sb.append(str);
        sb.append(", impDepth=");
        return android.support.v4.media.a.i(i2, ")", sb);
    }
}
