package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f15258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f15259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15260c;
    public final dg d;

    public u8(Integer num, Integer num2, String str, dg dgVar) {
        this.f15258a = num;
        this.f15259b = num2;
        this.f15260c = str;
        this.d = dgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return Intrinsics.a(this.f15258a, u8Var.f15258a) && Intrinsics.a(this.f15259b, u8Var.f15259b) && Intrinsics.a(this.f15260c, u8Var.f15260c) && Intrinsics.a(this.d, u8Var.d);
    }

    public int hashCode() {
        Integer num = this.f15258a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f15259b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f15260c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        dg dgVar = this.d;
        return iHashCode3 + (dgVar != null ? dgVar.hashCode() : 0);
    }

    public String toString() {
        return "IconClickFallbackImage(width=" + this.f15258a + ", height=" + this.f15259b + ", altText=" + this.f15260c + ", staticResource=" + this.d + ")";
    }
}
