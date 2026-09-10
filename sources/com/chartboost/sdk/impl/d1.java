package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh f13669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13670b;

    public d1(kh advertisingIDState, String str) {
        Intrinsics.f(advertisingIDState, "advertisingIDState");
        this.f13669a = advertisingIDState;
        this.f13670b = str;
    }

    public final String a() {
        return this.f13670b;
    }

    public final kh b() {
        return this.f13669a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f13669a == d1Var.f13669a && Intrinsics.a(this.f13670b, d1Var.f13670b);
    }

    public int hashCode() {
        int iHashCode = this.f13669a.hashCode() * 31;
        String str = this.f13670b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdvertisingIDHolder(advertisingIDState=" + this.f13669a + ", advertisingID=" + this.f13670b + ")";
    }
}
