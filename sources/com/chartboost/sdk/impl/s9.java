package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2 f15116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CBError.Impression f15117b;

    public s9(r2 r2Var, CBError.Impression impression) {
        this.f15116a = r2Var;
        this.f15117b = impression;
    }

    public final CBError.Impression a() {
        return this.f15117b;
    }

    public final r2 b() {
        return this.f15116a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return Intrinsics.a(this.f15116a, s9Var.f15116a) && this.f15117b == s9Var.f15117b;
    }

    public int hashCode() {
        r2 r2Var = this.f15116a;
        int iHashCode = (r2Var == null ? 0 : r2Var.hashCode()) * 31;
        CBError.Impression impression = this.f15117b;
        return iHashCode + (impression != null ? impression.hashCode() : 0);
    }

    public String toString() {
        return "ImpressionHolder(impression=" + this.f15116a + ", error=" + this.f15117b + ")";
    }
}
