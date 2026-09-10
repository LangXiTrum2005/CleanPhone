package com.ironsource;

import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3647n2 {
    private final String a;
    private final JSONObject b;
    private final C3700q2 c;
    private final int d;
    private final String e;

    public C3647n2(String auctionId, JSONObject jSONObject, C3700q2 c3700q2, int i, String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.a = auctionId;
        this.b = jSONObject;
        this.c = c3700q2;
        this.d = i;
        this.e = auctionFallback;
    }

    public final String a() {
        return this.a;
    }

    public final JSONObject b() {
        return this.b;
    }

    public final C3700q2 c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3647n2)) {
            return false;
        }
        C3647n2 c3647n2 = (C3647n2) obj;
        return Intrinsics.wireman(this.a, c3647n2.a) && Intrinsics.wireman(this.b, c3647n2.b) && Intrinsics.wireman(this.c, c3647n2.c) && this.d == c3647n2.d && Intrinsics.wireman(this.e, c3647n2.e);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.a;
    }

    public final JSONObject h() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C3700q2 c3700q2 = this.c;
        return ((((iHashCode2 + (c3700q2 != null ? c3700q2.hashCode() : 0)) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    public final int i() {
        return this.d;
    }

    public final C3700q2 j() {
        return this.c;
    }

    public String toString() {
        return "AuctionResponseData(auctionId=" + this.a + ", auctionResponseGenericParam=" + this.b + ", genericNotifications=" + this.c + ", auctionTrial=" + this.d + ", auctionFallback=" + this.e + ")";
    }

    public final C3647n2 a(String auctionId, JSONObject jSONObject, C3700q2 c3700q2, int i, String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new C3647n2(auctionId, jSONObject, c3700q2, i, auctionFallback);
    }

    public static /* synthetic */ C3647n2 a(C3647n2 c3647n2, String str, JSONObject jSONObject, C3700q2 c3700q2, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c3647n2.a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c3647n2.b;
        }
        if ((i2 & 4) != 0) {
            c3700q2 = c3647n2.c;
        }
        if ((i2 & 8) != 0) {
            i = c3647n2.d;
        }
        if ((i2 & 16) != 0) {
            str2 = c3647n2.e;
        }
        String str3 = str2;
        C3700q2 c3700q3 = c3700q2;
        return c3647n2.a(str, jSONObject, c3700q3, i, str3);
    }
}
