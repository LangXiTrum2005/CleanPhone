package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o6 extends c2 implements nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14753c;
    public final p6 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14754e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Mediation f14756i;

    public o6(String auctionId, List impressionIds, p6 engagementType, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(impressionIds, "impressionIds");
        Intrinsics.f(engagementType, "engagementType");
        this.f14752b = auctionId;
        this.f14753c = impressionIds;
        this.d = engagementType;
        this.f14754e = str;
        this.f = str2;
        this.g = str3;
        this.f14755h = str4;
        this.f14756i = mediation;
    }

    @Override // com.chartboost.sdk.impl.ig
    public Map b() {
        Pair pair = new Pair("CB_ENGAGEMENT_TYPE", this.d.b());
        Pair pair2 = new Pair("CB_ERROR", ob.a(this.f14754e, this.f14755h));
        String str = this.f;
        if (str == null) {
            str = "";
        }
        Pair pair3 = new Pair("CB_ERROR_CODE", str);
        String str2 = this.g;
        return MapsKt.m(MapsKt.j(pair, pair2, pair3, new Pair("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), ob.a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return Intrinsics.a(this.f14752b, o6Var.f14752b) && Intrinsics.a(this.f14753c, o6Var.f14753c) && this.d == o6Var.d && Intrinsics.a(this.f14754e, o6Var.f14754e) && Intrinsics.a(this.f, o6Var.f) && Intrinsics.a(this.g, o6Var.g) && Intrinsics.a(this.f14755h, o6Var.f14755h) && Intrinsics.a(this.f14756i, o6Var.f14756i);
    }

    @Override // com.chartboost.sdk.impl.nb
    public Mediation getMediation() {
        return this.f14756i;
    }

    public int hashCode() {
        int iHashCode = (this.d.hashCode() + androidx.media3.extractor.text.ttml.a.c(this.f14752b.hashCode() * 31, 31, this.f14753c)) * 31;
        String str = this.f14754e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14755h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f14756i;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f14752b;
        List list = this.f14753c;
        p6 p6Var = this.d;
        String str2 = this.f14754e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.f14755h;
        Mediation mediation = this.f14756i;
        StringBuilder sb = new StringBuilder("EngagementEventPayload(auctionId=");
        sb.append(str);
        sb.append(", impressionIds=");
        sb.append(list);
        sb.append(", engagementType=");
        sb.append(p6Var);
        sb.append(", errorString=");
        sb.append(str2);
        sb.append(", errorCode=");
        androidx.media3.extractor.text.ttml.a.C(sb, str3, ", errorConstant=", str4, ", errorCauseDescription=");
        sb.append(str5);
        sb.append(", mediation=");
        sb.append(mediation);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ o6(String str, List list, p6 p6Var, String str2, String str3, String str4, String str5, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, p6Var, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, mediation);
    }
}
