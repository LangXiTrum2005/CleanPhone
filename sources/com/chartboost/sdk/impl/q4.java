package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14881b;

    public q4(String str, List companionAds) {
        Intrinsics.f(companionAds, "companionAds");
        this.f14880a = str;
        this.f14881b = companionAds;
    }

    public final List a() {
        return this.f14881b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return Intrinsics.a(this.f14880a, q4Var.f14880a) && Intrinsics.a(this.f14881b, q4Var.f14881b);
    }

    public int hashCode() {
        String str = this.f14880a;
        return this.f14881b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "CompanionAds(required=" + this.f14880a + ", companionAds=" + this.f14881b + ")";
    }
}
