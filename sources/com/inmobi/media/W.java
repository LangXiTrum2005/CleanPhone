package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U0 f23307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f23309c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f23310e;

    public W(U0 adUnitTelemetry, String str, Boolean bool, String str2, byte b2) {
        Intrinsics.f(adUnitTelemetry, "adUnitTelemetry");
        this.f23307a = adUnitTelemetry;
        this.f23308b = str;
        this.f23309c = bool;
        this.d = str2;
        this.f23310e = b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w2 = (W) obj;
        return Intrinsics.a(this.f23307a, w2.f23307a) && Intrinsics.a(this.f23308b, w2.f23308b) && Intrinsics.a(this.f23309c, w2.f23309c) && Intrinsics.a(this.d, w2.d) && this.f23310e == w2.f23310e;
    }

    public final int hashCode() {
        int iHashCode = this.f23307a.hashCode() * 31;
        String str = this.f23308b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f23309c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        return Byte.hashCode(this.f23310e) + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdNotReadyMetadata(adUnitTelemetry=");
        sb.append(this.f23307a);
        sb.append(", creativeType=");
        sb.append(this.f23308b);
        sb.append(", isRewarded=");
        sb.append(this.f23309c);
        sb.append(", markupType=");
        sb.append(this.d);
        sb.append(", adState=");
        return android.support.v4.media.a.p(sb, this.f23310e, ')');
    }
}
