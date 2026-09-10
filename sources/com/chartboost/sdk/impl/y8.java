package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh f15616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15618c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15619e;
    public final Integer f;
    public final String g;

    public y8(kh trackingState, String str, String str2, String str3, String str4, Integer num, String str5) {
        Intrinsics.f(trackingState, "trackingState");
        this.f15616a = trackingState;
        this.f15617b = str;
        this.f15618c = str2;
        this.d = str3;
        this.f15619e = str4;
        this.f = num;
        this.g = str5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f15617b;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.f15619e;
    }

    public final Integer e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8)) {
            return false;
        }
        y8 y8Var = (y8) obj;
        return this.f15616a == y8Var.f15616a && Intrinsics.a(this.f15617b, y8Var.f15617b) && Intrinsics.a(this.f15618c, y8Var.f15618c) && Intrinsics.a(this.d, y8Var.d) && Intrinsics.a(this.f15619e, y8Var.f15619e) && Intrinsics.a(this.f, y8Var.f) && Intrinsics.a(this.g, y8Var.g);
    }

    public final kh f() {
        return this.f15616a;
    }

    public final String g() {
        return this.f15618c;
    }

    public int hashCode() {
        int iHashCode = this.f15616a.hashCode() * 31;
        String str = this.f15617b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15618c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15619e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        kh khVar = this.f15616a;
        String str = this.f15617b;
        String str2 = this.f15618c;
        String str3 = this.d;
        String str4 = this.f15619e;
        Integer num = this.f;
        String str5 = this.g;
        StringBuilder sb = new StringBuilder("IdentityBodyFields(trackingState=");
        sb.append(khVar);
        sb.append(", identifiers=");
        sb.append(str);
        sb.append(", uuid=");
        androidx.media3.extractor.text.ttml.a.C(sb, str2, ", gaid=", str3, ", setId=");
        sb.append(str4);
        sb.append(", setIdScope=");
        sb.append(num);
        sb.append(", instanceId=");
        return android.support.v4.media.a.r(sb, str5, ")");
    }

    public /* synthetic */ y8(kh khVar, String str, String str2, String str3, String str4, Integer num, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? kh.TRACKING_UNKNOWN : khVar, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : str5);
    }
}
