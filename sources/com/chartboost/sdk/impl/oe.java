package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f14785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f14786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14787c;
    public final zc d;

    public oe(Integer num, Integer num2, String str, zc openRTBConnectionType) {
        Intrinsics.f(openRTBConnectionType, "openRTBConnectionType");
        this.f14785a = num;
        this.f14786b = num2;
        this.f14787c = str;
        this.d = openRTBConnectionType;
    }

    public final Integer a() {
        return this.f14785a;
    }

    public final Integer b() {
        return this.f14786b;
    }

    public final String c() {
        return this.f14787c;
    }

    public final zc d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return Intrinsics.a(this.f14785a, oeVar.f14785a) && Intrinsics.a(this.f14786b, oeVar.f14786b) && Intrinsics.a(this.f14787c, oeVar.f14787c) && this.d == oeVar.d;
    }

    public int hashCode() {
        Integer num = this.f14785a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f14786b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f14787c;
        return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ReachabilityBodyFields(cellularConnectionType=" + this.f14785a + ", connectionTypeFromActiveNetwork=" + this.f14786b + ", detailedConnectionType=" + this.f14787c + ", openRTBConnectionType=" + this.d + ")";
    }
}
