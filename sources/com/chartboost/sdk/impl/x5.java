package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15514c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15515e;
    public final String f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15517i;
    public final String j;
    public final boolean k;

    public x5(int i2, int i3, int i4, int i5, float f, String str, int i6, String deviceType, String str2, String str3, boolean z2) {
        Intrinsics.f(deviceType, "deviceType");
        this.f15512a = i2;
        this.f15513b = i3;
        this.f15514c = i4;
        this.d = i5;
        this.f15515e = f;
        this.f = str;
        this.g = i6;
        this.f15516h = deviceType;
        this.f15517i = str2;
        this.j = str3;
        this.k = z2;
    }

    public final int a() {
        return this.f15513b;
    }

    public final String b() {
        return this.f15516h;
    }

    public final int c() {
        return this.f15512a;
    }

    public final String d() {
        return this.f;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        return this.f15512a == x5Var.f15512a && this.f15513b == x5Var.f15513b && this.f15514c == x5Var.f15514c && this.d == x5Var.d && Float.compare(this.f15515e, x5Var.f15515e) == 0 && Intrinsics.a(this.f, x5Var.f) && this.g == x5Var.g && Intrinsics.a(this.f15516h, x5Var.f15516h) && Intrinsics.a(this.f15517i, x5Var.f15517i) && Intrinsics.a(this.j, x5Var.j) && this.k == x5Var.k;
    }

    public final int f() {
        return this.g;
    }

    public final String g() {
        return this.f15517i;
    }

    public final float h() {
        return this.f15515e;
    }

    public int hashCode() {
        int iHashCode = (Float.hashCode(this.f15515e) + androidx.media3.extractor.text.ttml.a.a(this.d, androidx.media3.extractor.text.ttml.a.a(this.f15514c, androidx.media3.extractor.text.ttml.a.a(this.f15513b, Integer.hashCode(this.f15512a) * 31, 31), 31), 31)) * 31;
        String str = this.f;
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f15516h, androidx.media3.extractor.text.ttml.a.a(this.g, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f15517i;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return Boolean.hashCode(this.k) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.j;
    }

    public final int j() {
        return this.f15514c;
    }

    public final boolean k() {
        return this.k;
    }

    public String toString() {
        int i2 = this.f15512a;
        int i3 = this.f15513b;
        int i4 = this.f15514c;
        int i5 = this.d;
        float f = this.f15515e;
        String str = this.f;
        int i6 = this.g;
        String str2 = this.f15516h;
        String str3 = this.f15517i;
        String str4 = this.j;
        boolean z2 = this.k;
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "DeviceBodyFields(deviceWidth=", ", deviceHeight=", ", width=");
        androidx.datastore.preferences.protobuf.a.y(sbP, i4, ", height=", i5, ", scale=");
        sbP.append(f);
        sbP.append(", dpi=");
        sbP.append(str);
        sbP.append(", ortbDeviceType=");
        sbP.append(i6);
        sbP.append(", deviceType=");
        sbP.append(str2);
        sbP.append(", packageName=");
        androidx.media3.extractor.text.ttml.a.C(sbP, str3, ", versionName=", str4, ", isPortrait=");
        return android.support.v4.media.a.t(sbP, z2, ")");
    }

    public /* synthetic */ x5(int i2, int i3, int i4, int i5, float f, String str, int i6, String str2, String str3, String str4, boolean z2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i2, (i7 & 2) != 0 ? 0 : i3, (i7 & 4) != 0 ? 0 : i4, (i7 & 8) != 0 ? 0 : i5, (i7 & 16) != 0 ? 0.0f : f, (i7 & 32) != 0 ? "" : str, (i7 & 64) != 0 ? a6.f13405a : i6, (i7 & 128) != 0 ? "phone" : str2, (i7 & 256) != 0 ? null : str3, (i7 & 512) != 0 ? null : str4, (i7 & 1024) != 0 ? true : z2);
    }
}
