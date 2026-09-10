package com.chartboost.sdk.impl;

import android.os.SystemClock;
import com.applovin.impl.Z;
import com.applovin.shadow.okio.Segment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s6 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f15095A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f15096B;
    public final int C;
    public final int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f15097E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f15098F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15101c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15102e;
    public final boolean f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15104i;
    public final String j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f15105l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f15106n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f15107p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f15108u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f15109w;
    public final boolean x;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f15110z;

    public s6(String sessionId, int i2, String appId, String appVersion, String chartboostSdkVersion, boolean z2, String chartboostSdkGdpr, String chartboostSdkCcpa, String chartboostSdkCoppa, String chartboostSdkLgpd, String deviceId, String deviceMake, String deviceModel, String deviceOsVersion, String devicePlatform, String deviceCountry, String deviceLanguage, String deviceTimezone, String deviceConnectionType, String deviceOrientation, int i3, boolean z3, int i4, boolean z4, int i5, long j, long j2, int i6, int i7, int i8, long j3, long j4) {
        Intrinsics.f(sessionId, "sessionId");
        Intrinsics.f(appId, "appId");
        Intrinsics.f(appVersion, "appVersion");
        Intrinsics.f(chartboostSdkVersion, "chartboostSdkVersion");
        Intrinsics.f(chartboostSdkGdpr, "chartboostSdkGdpr");
        Intrinsics.f(chartboostSdkCcpa, "chartboostSdkCcpa");
        Intrinsics.f(chartboostSdkCoppa, "chartboostSdkCoppa");
        Intrinsics.f(chartboostSdkLgpd, "chartboostSdkLgpd");
        Intrinsics.f(deviceId, "deviceId");
        Intrinsics.f(deviceMake, "deviceMake");
        Intrinsics.f(deviceModel, "deviceModel");
        Intrinsics.f(deviceOsVersion, "deviceOsVersion");
        Intrinsics.f(devicePlatform, "devicePlatform");
        Intrinsics.f(deviceCountry, "deviceCountry");
        Intrinsics.f(deviceLanguage, "deviceLanguage");
        Intrinsics.f(deviceTimezone, "deviceTimezone");
        Intrinsics.f(deviceConnectionType, "deviceConnectionType");
        Intrinsics.f(deviceOrientation, "deviceOrientation");
        this.f15099a = sessionId;
        this.f15100b = i2;
        this.f15101c = appId;
        this.d = appVersion;
        this.f15102e = chartboostSdkVersion;
        this.f = z2;
        this.g = chartboostSdkGdpr;
        this.f15103h = chartboostSdkCcpa;
        this.f15104i = chartboostSdkCoppa;
        this.j = chartboostSdkLgpd;
        this.k = deviceId;
        this.f15105l = deviceMake;
        this.m = deviceModel;
        this.f15106n = deviceOsVersion;
        this.o = devicePlatform;
        this.f15107p = deviceCountry;
        this.q = deviceLanguage;
        this.r = deviceTimezone;
        this.s = deviceConnectionType;
        this.t = deviceOrientation;
        this.f15108u = i3;
        this.v = z3;
        this.f15109w = i4;
        this.x = z4;
        this.y = i5;
        this.f15110z = j;
        this.f15095A = j2;
        this.f15096B = i6;
        this.C = i7;
        this.D = i8;
        this.f15097E = j3;
        this.f15098F = j4;
    }

    public final long A() {
        return this.f15097E;
    }

    public final String B() {
        return this.f15099a;
    }

    public final int C() {
        return this.D;
    }

    public final int D() {
        return this.f15096B;
    }

    public final int E() {
        return this.C;
    }

    public final String a() {
        return this.f15101c;
    }

    public final boolean b() {
        return this.f;
    }

    public final String c() {
        return this.f15103h;
    }

    public final String d() {
        return this.f15104i;
    }

    public final String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return Intrinsics.a(this.f15099a, s6Var.f15099a) && this.f15100b == s6Var.f15100b && Intrinsics.a(this.f15101c, s6Var.f15101c) && Intrinsics.a(this.d, s6Var.d) && Intrinsics.a(this.f15102e, s6Var.f15102e) && this.f == s6Var.f && Intrinsics.a(this.g, s6Var.g) && Intrinsics.a(this.f15103h, s6Var.f15103h) && Intrinsics.a(this.f15104i, s6Var.f15104i) && Intrinsics.a(this.j, s6Var.j) && Intrinsics.a(this.k, s6Var.k) && Intrinsics.a(this.f15105l, s6Var.f15105l) && Intrinsics.a(this.m, s6Var.m) && Intrinsics.a(this.f15106n, s6Var.f15106n) && Intrinsics.a(this.o, s6Var.o) && Intrinsics.a(this.f15107p, s6Var.f15107p) && Intrinsics.a(this.q, s6Var.q) && Intrinsics.a(this.r, s6Var.r) && Intrinsics.a(this.s, s6Var.s) && Intrinsics.a(this.t, s6Var.t) && this.f15108u == s6Var.f15108u && this.v == s6Var.v && this.f15109w == s6Var.f15109w && this.x == s6Var.x && this.y == s6Var.y && this.f15110z == s6Var.f15110z && this.f15095A == s6Var.f15095A && this.f15096B == s6Var.f15096B && this.C == s6Var.C && this.D == s6Var.D && this.f15097E == s6Var.f15097E && this.f15098F == s6Var.f15098F;
    }

    public final String f() {
        return this.j;
    }

    public final String g() {
        return this.f15102e;
    }

    public final int h() {
        return this.y;
    }

    public int hashCode() {
        return Long.hashCode(this.f15098F) + androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.a(this.D, androidx.media3.extractor.text.ttml.a.a(this.C, androidx.media3.extractor.text.ttml.a.a(this.f15096B, androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.a(this.y, Z.e(this.x, androidx.media3.extractor.text.ttml.a.a(this.f15109w, Z.e(this.v, androidx.media3.extractor.text.ttml.a.a(this.f15108u, androidx.datastore.preferences.protobuf.a.b(this.t, androidx.datastore.preferences.protobuf.a.b(this.s, androidx.datastore.preferences.protobuf.a.b(this.r, androidx.datastore.preferences.protobuf.a.b(this.q, androidx.datastore.preferences.protobuf.a.b(this.f15107p, androidx.datastore.preferences.protobuf.a.b(this.o, androidx.datastore.preferences.protobuf.a.b(this.f15106n, androidx.datastore.preferences.protobuf.a.b(this.m, androidx.datastore.preferences.protobuf.a.b(this.f15105l, androidx.datastore.preferences.protobuf.a.b(this.k, androidx.datastore.preferences.protobuf.a.b(this.j, androidx.datastore.preferences.protobuf.a.b(this.f15104i, androidx.datastore.preferences.protobuf.a.b(this.f15103h, androidx.datastore.preferences.protobuf.a.b(this.g, Z.e(this.f, androidx.datastore.preferences.protobuf.a.b(this.f15102e, androidx.datastore.preferences.protobuf.a.b(this.d, androidx.datastore.preferences.protobuf.a.b(this.f15101c, androidx.media3.extractor.text.ttml.a.a(this.f15100b, this.f15099a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f15110z), 31, this.f15095A), 31), 31), 31), 31, this.f15097E);
    }

    public final int i() {
        return this.f15108u;
    }

    public final boolean j() {
        return this.v;
    }

    public final String k() {
        return this.s;
    }

    public final String l() {
        return this.f15107p;
    }

    public final String m() {
        return this.k;
    }

    public final String n() {
        return this.q;
    }

    public final long o() {
        return this.f15095A;
    }

    public final String p() {
        return this.f15105l;
    }

    public final String q() {
        return this.m;
    }

    public final boolean r() {
        return this.x;
    }

    public final String s() {
        return this.t;
    }

    public final String t() {
        return this.f15106n;
    }

    public String toString() {
        String str = this.f15099a;
        int i2 = this.f15100b;
        String str2 = this.f15101c;
        String str3 = this.d;
        String str4 = this.f15102e;
        boolean z2 = this.f;
        String str5 = this.g;
        String str6 = this.f15103h;
        String str7 = this.f15104i;
        String str8 = this.j;
        String str9 = this.k;
        String str10 = this.f15105l;
        String str11 = this.m;
        String str12 = this.f15106n;
        String str13 = this.o;
        String str14 = this.f15107p;
        String str15 = this.q;
        String str16 = this.r;
        String str17 = this.s;
        String str18 = this.t;
        int i3 = this.f15108u;
        boolean z3 = this.v;
        int i4 = this.f15109w;
        boolean z4 = this.x;
        int i5 = this.y;
        long j = this.f15110z;
        long j2 = this.f15095A;
        int i6 = this.f15096B;
        int i7 = this.C;
        int i8 = this.D;
        long j3 = this.f15097E;
        long j4 = this.f15098F;
        StringBuilder sbZ = android.support.v4.media.a.z("EnvironmentData(sessionId=", str, ", sessionCount=", i2, ", appId=");
        androidx.media3.extractor.text.ttml.a.C(sbZ, str2, ", appVersion=", str3, ", chartboostSdkVersion=");
        sbZ.append(str4);
        sbZ.append(", chartboostSdkAutocacheEnabled=");
        sbZ.append(z2);
        sbZ.append(", chartboostSdkGdpr=");
        androidx.media3.extractor.text.ttml.a.C(sbZ, str5, ", chartboostSdkCcpa=", str6, ", chartboostSdkCoppa=");
        androidx.media3.extractor.text.ttml.a.C(sbZ, str7, ", chartboostSdkLgpd=", str8, ", deviceId=");
        androidx.media3.extractor.text.ttml.a.C(sbZ, str9, ", deviceMake=", str10, ", deviceModel=");
        androidx.media3.extractor.text.ttml.a.C(sbZ, str11, ", deviceOsVersion=", str12, ", devicePlatform=");
        androidx.media3.extractor.text.ttml.a.C(sbZ, str13, ", deviceCountry=", str14, ", deviceLanguage=");
        androidx.media3.extractor.text.ttml.a.C(sbZ, str15, ", deviceTimezone=", str16, ", deviceConnectionType=");
        androidx.media3.extractor.text.ttml.a.C(sbZ, str17, ", deviceOrientation=", str18, ", deviceBatteryLevel=");
        sbZ.append(i3);
        sbZ.append(", deviceChargingStatus=");
        sbZ.append(z3);
        sbZ.append(", deviceVolume=");
        sbZ.append(i4);
        sbZ.append(", deviceMute=");
        sbZ.append(z4);
        sbZ.append(", deviceAudioOutput=");
        sbZ.append(i5);
        sbZ.append(", deviceStorage=");
        sbZ.append(j);
        androidx.datastore.preferences.protobuf.a.A(sbZ, ", deviceLowMemoryWarning=", j2, ", sessionImpressionInterstitialCount=");
        androidx.datastore.preferences.protobuf.a.y(sbZ, i6, ", sessionImpressionRewardedCount=", i7, ", sessionImpressionBannerCount=");
        sbZ.append(i8);
        sbZ.append(", sessionDuration=");
        sbZ.append(j3);
        sbZ.append(", deviceUpTime=");
        sbZ.append(j4);
        sbZ.append(")");
        return sbZ.toString();
    }

    public final String u() {
        return this.o;
    }

    public final long v() {
        return this.f15110z;
    }

    public final String w() {
        return this.r;
    }

    public final long x() {
        return this.f15098F;
    }

    public final int y() {
        return this.f15109w;
    }

    public final int z() {
        return this.f15100b;
    }

    public /* synthetic */ s6(String str, int i2, String str2, String str3, String str4, boolean z2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i3, boolean z3, int i4, boolean z4, int i5, long j, long j2, int i6, int i7, int i8, long j3, long j4, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "not available" : str, (i9 & 2) != 0 ? 0 : i2, (i9 & 4) != 0 ? "not available" : str2, (i9 & 8) != 0 ? "not available" : str3, (i9 & 16) != 0 ? "not available" : str4, (i9 & 32) != 0 ? false : z2, (i9 & 64) != 0 ? "not available" : str5, (i9 & 128) != 0 ? "not available" : str6, (i9 & 256) != 0 ? "not available" : str7, (i9 & 512) != 0 ? "not available" : str8, (i9 & 1024) != 0 ? "not available" : str9, (i9 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? "not available" : str10, (i9 & 4096) != 0 ? "not available" : str11, (i9 & Segment.SIZE) != 0 ? "not available" : str12, (i9 & 16384) != 0 ? "not available" : str13, (i9 & 32768) != 0 ? "not available" : str14, (i9 & 65536) != 0 ? "not available" : str15, (i9 & 131072) != 0 ? "not available" : str16, (i9 & 262144) != 0 ? "not available" : str17, (i9 & 524288) == 0 ? str18 : "not available", (i9 & 1048576) != 0 ? 0 : i3, (i9 & 2097152) != 0 ? false : z3, (i9 & 4194304) != 0 ? 0 : i4, (i9 & 8388608) != 0 ? false : z4, (i9 & 16777216) != 0 ? 0 : i5, (i9 & 33554432) != 0 ? 0L : j, (i9 & 67108864) != 0 ? 0L : j2, (i9 & 134217728) != 0 ? 0 : i6, (i9 & 268435456) != 0 ? 0 : i7, (i9 & 536870912) != 0 ? 0 : i8, (i9 & 1073741824) == 0 ? j3 : 0L, (i9 & Integer.MIN_VALUE) != 0 ? SystemClock.uptimeMillis() : j4);
    }
}
