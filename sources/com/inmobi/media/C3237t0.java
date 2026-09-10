package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3237t0 {
    public final C3188r1 a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final byte e;
    public final String f;

    public C3237t0(C3188r1 adUnitTelemetry, String str, Boolean bool, String str2, byte b, String str3) {
        Intrinsics.checkNotNullParameter(adUnitTelemetry, "adUnitTelemetry");
        this.a = adUnitTelemetry;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = b;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3237t0)) {
            return false;
        }
        C3237t0 c3237t0 = (C3237t0) obj;
        return Intrinsics.wireman(this.a, c3237t0.a) && Intrinsics.wireman(this.b, c3237t0.b) && Intrinsics.wireman(this.c, c3237t0.c) && Intrinsics.wireman(this.d, c3237t0.d) && this.e == c3237t0.e && Intrinsics.wireman(this.f, c3237t0.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (Byte.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C3188r1 c3188r1 = this.a;
        String str = this.b;
        Boolean bool = this.c;
        String str2 = this.d;
        byte b = this.e;
        return "AdNotReadyMetadata(adUnitTelemetry=" + c3188r1 + ", creativeType=" + str + ", isRewarded=" + bool + ", markupType=" + str2 + ", adState=" + ((int) b) + ", impressionId=" + this.f + ")";
    }
}
