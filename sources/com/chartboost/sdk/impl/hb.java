package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f14105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f14106c;
    public final Integer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14107e;

    public hb(String mimeType, Integer num, Integer num2, Integer num3, String url) {
        Intrinsics.f(mimeType, "mimeType");
        Intrinsics.f(url, "url");
        this.f14104a = mimeType;
        this.f14105b = num;
        this.f14106c = num2;
        this.d = num3;
        this.f14107e = url;
    }

    public final Integer a() {
        return this.d;
    }

    public final Integer b() {
        return this.f14106c;
    }

    public final String c() {
        return this.f14104a;
    }

    public final String d() {
        return this.f14107e;
    }

    public final Integer e() {
        return this.f14105b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return Intrinsics.a(this.f14104a, hbVar.f14104a) && Intrinsics.a(this.f14105b, hbVar.f14105b) && Intrinsics.a(this.f14106c, hbVar.f14106c) && Intrinsics.a(this.d, hbVar.d) && Intrinsics.a(this.f14107e, hbVar.f14107e);
    }

    public int hashCode() {
        int iHashCode = this.f14104a.hashCode() * 31;
        Integer num = this.f14105b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f14106c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return this.f14107e.hashCode() + ((iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.f14104a;
        Integer num = this.f14105b;
        Integer num2 = this.f14106c;
        Integer num3 = this.d;
        String str2 = this.f14107e;
        StringBuilder sb = new StringBuilder("MediaFile(mimeType=");
        sb.append(str);
        sb.append(", width=");
        sb.append(num);
        sb.append(", height=");
        sb.append(num2);
        sb.append(", bitrate=");
        sb.append(num3);
        sb.append(", url=");
        return android.support.v4.media.a.r(sb, str2, ")");
    }
}
