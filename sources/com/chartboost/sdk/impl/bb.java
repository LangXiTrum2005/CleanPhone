package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f13517c;
    public final Integer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f13518e;
    public final String f;
    public final String g;

    public bb(long j, int i2, Integer num, Integer num2, Integer num3, String appBundle, String omidPartner) {
        Intrinsics.f(appBundle, "appBundle");
        Intrinsics.f(omidPartner, "omidPartner");
        this.f13515a = j;
        this.f13516b = i2;
        this.f13517c = num;
        this.d = num2;
        this.f13518e = num3;
        this.f = appBundle;
        this.g = omidPartner;
    }

    public final String a() {
        return this.f;
    }

    public final int b() {
        return this.f13516b;
    }

    public final long c() {
        return this.f13515a;
    }

    public final Integer d() {
        return this.f13517c;
    }

    public final Integer e() {
        return this.f13518e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.f13515a == bbVar.f13515a && this.f13516b == bbVar.f13516b && Intrinsics.a(this.f13517c, bbVar.f13517c) && Intrinsics.a(this.d, bbVar.d) && Intrinsics.a(this.f13518e, bbVar.f13518e) && Intrinsics.a(this.f, bbVar.f) && Intrinsics.a(this.g, bbVar.g);
    }

    public final String f() {
        return this.g;
    }

    public final Integer g() {
        return this.d;
    }

    public int hashCode() {
        int iA = androidx.media3.extractor.text.ttml.a.a(this.f13516b, Long.hashCode(this.f13515a) * 31, 31);
        Integer num = this.f13517c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f13518e;
        return this.g.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f, (iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        long j = this.f13515a;
        int i2 = this.f13516b;
        Integer num = this.f13517c;
        Integer num2 = this.d;
        Integer num3 = this.f13518e;
        String str = this.f;
        String str2 = this.g;
        StringBuilder sb = new StringBuilder("MacroContext(currentTimeMs=");
        sb.append(j);
        sb.append(", cacheBusting=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(num);
        sb.append(", reasonCode=");
        sb.append(num2);
        sb.append(", limitAdTracking=");
        sb.append(num3);
        sb.append(", appBundle=");
        sb.append(str);
        return android.support.v4.media.a.s(sb, ", omidPartner=", str2, ")");
    }
}
