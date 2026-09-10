package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0472n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f29785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0526q2 f29786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29788e;

    public C0472n2(String auctionId, JSONObject jSONObject, C0526q2 c0526q2, int i10, String auctionFallback) {
        kotlin.jvm.internal.n.f(auctionId, "auctionId");
        kotlin.jvm.internal.n.f(auctionFallback, "auctionFallback");
        this.f29784a = auctionId;
        this.f29785b = jSONObject;
        this.f29786c = c0526q2;
        this.f29787d = i10;
        this.f29788e = auctionFallback;
    }

    public final String a() {
        return this.f29784a;
    }

    public final JSONObject b() {
        return this.f29785b;
    }

    public final C0526q2 c() {
        return this.f29786c;
    }

    public final int d() {
        return this.f29787d;
    }

    public final String e() {
        return this.f29788e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0472n2)) {
            return false;
        }
        C0472n2 c0472n2 = (C0472n2) obj;
        return kotlin.jvm.internal.n.a(this.f29784a, c0472n2.f29784a) && kotlin.jvm.internal.n.a(this.f29785b, c0472n2.f29785b) && kotlin.jvm.internal.n.a(this.f29786c, c0472n2.f29786c) && this.f29787d == c0472n2.f29787d && kotlin.jvm.internal.n.a(this.f29788e, c0472n2.f29788e);
    }

    public final String f() {
        return this.f29788e;
    }

    public final String g() {
        return this.f29784a;
    }

    public final JSONObject h() {
        return this.f29785b;
    }

    public int hashCode() {
        int iHashCode = this.f29784a.hashCode() * 31;
        JSONObject jSONObject = this.f29785b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C0526q2 c0526q2 = this.f29786c;
        return this.f29788e.hashCode() + wi.d.f(this.f29787d, (iHashCode2 + (c0526q2 != null ? c0526q2.hashCode() : 0)) * 31, 31);
    }

    public final int i() {
        return this.f29787d;
    }

    public final C0526q2 j() {
        return this.f29786c;
    }

    public String toString() {
        String str = this.f29784a;
        JSONObject jSONObject = this.f29785b;
        C0526q2 c0526q2 = this.f29786c;
        int i10 = this.f29787d;
        String str2 = this.f29788e;
        StringBuilder sb2 = new StringBuilder("AuctionResponseData(auctionId=");
        sb2.append(str);
        sb2.append(", auctionResponseGenericParam=");
        sb2.append(jSONObject);
        sb2.append(", genericNotifications=");
        sb2.append(c0526q2);
        sb2.append(", auctionTrial=");
        sb2.append(i10);
        sb2.append(", auctionFallback=");
        return defpackage.e.q(str2, ")", sb2);
    }

    public final C0472n2 a(String auctionId, JSONObject jSONObject, C0526q2 c0526q2, int i10, String auctionFallback) {
        kotlin.jvm.internal.n.f(auctionId, "auctionId");
        kotlin.jvm.internal.n.f(auctionFallback, "auctionFallback");
        return new C0472n2(auctionId, jSONObject, c0526q2, i10, auctionFallback);
    }

    public static /* synthetic */ C0472n2 a(C0472n2 c0472n2, String str, JSONObject jSONObject, C0526q2 c0526q2, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c0472n2.f29784a;
        }
        if ((i11 & 2) != 0) {
            jSONObject = c0472n2.f29785b;
        }
        if ((i11 & 4) != 0) {
            c0526q2 = c0472n2.f29786c;
        }
        if ((i11 & 8) != 0) {
            i10 = c0472n2.f29787d;
        }
        if ((i11 & 16) != 0) {
            str2 = c0472n2.f29788e;
        }
        String str3 = str2;
        C0526q2 c0526q3 = c0526q2;
        return c0472n2.a(str, jSONObject, c0526q3, i10, str3);
    }
}
