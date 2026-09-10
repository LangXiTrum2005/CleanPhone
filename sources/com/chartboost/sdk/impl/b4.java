package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13482c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13483e;
    public final Float f;
    public final Float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v9 f13484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f13485i;

    public b4(String location, String adId, String to, String cgn, String creative, Float f, Float f2, v9 impressionMediaType, Boolean bool) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adId, "adId");
        Intrinsics.f(to, "to");
        Intrinsics.f(cgn, "cgn");
        Intrinsics.f(creative, "creative");
        Intrinsics.f(impressionMediaType, "impressionMediaType");
        this.f13480a = location;
        this.f13481b = adId;
        this.f13482c = to;
        this.d = cgn;
        this.f13483e = creative;
        this.f = f;
        this.g = f2;
        this.f13484h = impressionMediaType;
        this.f13485i = bool;
    }

    public final String a() {
        return this.f13481b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f13483e;
    }

    public final v9 d() {
        return this.f13484h;
    }

    public final String e() {
        return this.f13480a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return Intrinsics.a(this.f13480a, b4Var.f13480a) && Intrinsics.a(this.f13481b, b4Var.f13481b) && Intrinsics.a(this.f13482c, b4Var.f13482c) && Intrinsics.a(this.d, b4Var.d) && Intrinsics.a(this.f13483e, b4Var.f13483e) && Intrinsics.a(this.f, b4Var.f) && Intrinsics.a(this.g, b4Var.g) && this.f13484h == b4Var.f13484h && Intrinsics.a(this.f13485i, b4Var.f13485i);
    }

    public final Boolean f() {
        return this.f13485i;
    }

    public final String g() {
        return this.f13482c;
    }

    public final Float h() {
        return this.g;
    }

    public int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f13483e, androidx.datastore.preferences.protobuf.a.b(this.d, androidx.datastore.preferences.protobuf.a.b(this.f13482c, androidx.datastore.preferences.protobuf.a.b(this.f13481b, this.f13480a.hashCode() * 31, 31), 31), 31), 31);
        Float f = this.f;
        int iHashCode = (iB + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.g;
        int iHashCode2 = (this.f13484h.hashCode() + ((iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31)) * 31;
        Boolean bool = this.f13485i;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Float i() {
        return this.f;
    }

    public String toString() {
        String str = this.f13480a;
        String str2 = this.f13481b;
        String str3 = this.f13482c;
        String str4 = this.d;
        String str5 = this.f13483e;
        Float f = this.f;
        Float f2 = this.g;
        v9 v9Var = this.f13484h;
        Boolean bool = this.f13485i;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("ClickParams(location=", str, ", adId=", str2, ", to=");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str3, ", cgn=", str4, ", creative=");
        sbQ.append(str5);
        sbQ.append(", videoPosition=");
        sbQ.append(f);
        sbQ.append(", videoDuration=");
        sbQ.append(f2);
        sbQ.append(", impressionMediaType=");
        sbQ.append(v9Var);
        sbQ.append(", retargetReinstall=");
        sbQ.append(bool);
        sbQ.append(")");
        return sbQ.toString();
    }
}
